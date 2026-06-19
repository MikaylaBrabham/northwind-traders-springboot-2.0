package com.pluralsight.northwind_traders_springboot_20.repository;

import com.pluralsight.northwind_traders_springboot_20.model.Product;
import org.hibernate.mapping.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


    @Repository
    public interface ProductRepository extends JpaRepository <Product, Integer>{
       // List<Product> findByProductIdContainingIgnoreCase(Integer productId);
       // List<Product> findByNameContainingIgnoreCase(String name);
       // List<Product> findByCategoryContainingIgnoreCase(String category);
       // List<Product> findByPriceContainingIgnoreCase(Double price);



}

