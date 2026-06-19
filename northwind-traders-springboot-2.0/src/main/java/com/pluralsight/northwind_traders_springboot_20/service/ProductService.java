package com.pluralsight.northwind_traders_springboot_20.service;

import com.pluralsight.northwind_traders_springboot_20.model.Product;
import com.pluralsight.northwind_traders_springboot_20.repository.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;



//announces to spring it's a bean
@Service
public class ProductService {

    //add private final repo
    private ProductRepository productRepository;

    //create constructor injection for repo to get dependencies
    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    //each operation has its own method based on what website does

    // get - read
    //get all products
    public List<Product> getAllProducts(){
        return productRepository.findAll();
    }

    //get a product by id
    public Optional<Product> getProductById(int id) {
        return productRepository.findById(id);
    }

    // post - create
    //add a new product
    public Product addProduct(Product product) {
        return productRepository.save(product);
    }

    // put - update

    // delete - remove
    // delete  a product by ID
    public void deleteProductById(int id) {
        productRepository.deleteById(id);
    }

    //controller asks
    //service thinks
    //repository fetches

}
