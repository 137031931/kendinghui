package com.manong.service.impl;

import pojo.EasyUITree;
import pojo.ResponseJasnResult;

import java.util.List;

public interface ProductCategoryService {
    List<EasyUITree> findProductCategoryListByParentId(Short parentid);
    ResponseJasnResult addCategory(Short parentid,String name);
}
