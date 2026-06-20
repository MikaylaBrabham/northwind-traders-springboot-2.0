package com.pluralsight.northwind_traders_springboot_20.model;

import jakarta.persistence.*;

@Entity
@Table(name = "products")
public class Product {

    @Id
    @Column(name = "ProductID")
    private Integer productID;
    //get variables


    @Column(name = "ProductName")
    private String productName;


    @Column(name = "UnitPrice")
    private Double unitPrice;

    @Column(name = "CategoryID")
    private Integer CategoryID;

    public Product() {
    }


    //add getters

    public Integer getProductID() {
        return productID;
    }

    public String getProductName() {
        return productName;
    }

    public Double getUnitPrice() {
        return unitPrice;
    }

    public Integer getCategoryID() {
        return CategoryID;
    }
}

