package com.pluralsight.northwind_traders_springboot_20.controller;

import com.pluralsight.northwind_traders_springboot_20.model.Product;
import com.pluralsight.northwind_traders_springboot_20.service.ProductService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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

    //add get mapping all products w/ endpoints
    @GetMapping
    public List<Product> getAllProducts() {
        return productService.getAllProducts();
    }

    //add get product by id w/ endpoints
    @GetMapping

    //add post products w/endpoints
    @PostMapping

    //delete products by id w/endpoints
    @DeleteMapping
}

