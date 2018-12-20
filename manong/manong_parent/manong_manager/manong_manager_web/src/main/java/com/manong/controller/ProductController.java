package com.manong.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 商品管理的控制层
 */
@Controller
public class ProductController {
    @RequestMapping("product_list")
    public String lostProduct(){
        return "product_list";
    }
}
