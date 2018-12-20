package com.manong.service.impl;

import pojo.EasyUITree;

import java.util.List;

public interface ProductCategoryService {
    List<EasyUITree> findProductCategoryListByParentId(Short parentid);
}
