package com.manong.service.impl;

import com.manong.mapper.ProductCategoryMapper;
import com.manong.pojo.ProductCategory;
import com.manong.pojo.ProductCategoryExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pojo.EasyUITree;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductCategoryServiceImpl implements ProductCategoryService {
    @Autowired
    private ProductCategoryMapper productCategoryMapper;
    @Override
    public List<EasyUITree> findProductCategoryListByParentId(Short parentid) {
        ProductCategoryExample productCategoryExample = new ProductCategoryExample();
        ProductCategoryExample.Criteria criteria = productCategoryExample.createCriteria();
        criteria.andParentIdEqualTo(parentid);
        List<ProductCategory> productCategoryList = productCategoryMapper.selectByExample(productCategoryExample);
        List<EasyUITree> easyUITrees = new ArrayList<>(productCategoryList.size());
        for (ProductCategory productCategory: productCategoryList){
            EasyUITree easyuiTree = new EasyUITree();

            easyuiTree.setId(productCategory.getId());

            easyuiTree.setText(productCategory.getName());
            easyuiTree.setState(productCategory.getParentId()==0?"closed":"open");
            easyUITrees.add(easyuiTree);
        }
        return easyUITrees;
    }
}
