package com.pluralsight.northwind_traders_springboot_20.model;

import jakarta.persistence.*;
import java.math.BigDecimal;

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
    private BigDecimal unitPrice;

    @Column(name = "CategoryID")
    private Integer categoryID;

    public Product() {
    }


    //add getters

    public Integer getProductID() {
        return productID;
    }

    public String getProductName() {
        return productName;
    }

    public BigDecimal getUnitPrice() {
        return unitPrice;
    }

    public Integer getCategoryID() {
        return categoryID;
    }

    //setters

    public void setProductID(Integer productID) {
        this.productID = productID;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void setUnitPrice(BigDecimal unitPrice) {
        this.unitPrice = unitPrice;
    }

    public void setCategoryID(Integer categoryID) {
        this.categoryID = categoryID;
    }
}

