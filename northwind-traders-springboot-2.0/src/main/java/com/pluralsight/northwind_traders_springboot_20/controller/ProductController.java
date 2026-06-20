package com.pluralsight.northwind_traders_springboot_20.controller;

import com.pluralsight.northwind_traders_springboot_20.service.ProductService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//add rest controller with the default mapping for products
@RestController
@RequestMapping("/api/products")

public class ProductController {

    //add product service as variable
    private ProductService productService;

    //add constructor
    public ProductController(ProductService productService) {
        this.productService = productService;
    }
}

