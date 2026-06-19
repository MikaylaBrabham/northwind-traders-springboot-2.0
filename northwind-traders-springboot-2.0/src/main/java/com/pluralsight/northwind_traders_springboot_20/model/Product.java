package com.pluralsight.northwind_traders_springboot_20.model;

import jakarta.persistence.*;

@Entity
@Table(name = "products")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    //get variables
    private Integer productID;
    private String name;
    private String category;
    private Double price;


    //add getters

    public Integer getProductID() {
        return productID;
    }

    public String getName() {
        return name;
    }

    public String getCategory() {
        return category;
    }

    public Double getPrice() {
        return price;
    }
}
