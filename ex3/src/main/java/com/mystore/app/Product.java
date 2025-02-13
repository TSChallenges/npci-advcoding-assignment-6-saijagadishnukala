package com.mystore.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
class Product {
    
    private int id;
    private String name;
    private String barcode;

    @Autowired
    Barcode barcode1;

    public Product() {
        System.out.println("In Product constructor");
    }
    
    public Product(String name, Barcode barcode) {
        this.name = name;
        this.barcode1 = barcode;
    }

    // Getter methods
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getBarcode() {
        return barcode;
    }

    // Setter methods
    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBarcode() {
        this.barcode = barcode1.createBarcode(this);
    }

    @Override
    public String toString() {
        return "Product{id=" + id + ", name='" + name + "', barcode='" + barcode + "'}";
    }

}
