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

    @Column(name = "Category")
    private String category;



    //add getters

    public Integer getProductID() {
        return productID;
    }

    public String getProductName() {
        return productName;
    }

    public String getCategory() {
     return category;
    }

    public Double getUnitPrice() {
        return unitPrice;
    }

    //add setters

    public void setProductID(Integer productID) {
        this.productID = productID;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void setUnitPrice(Double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
