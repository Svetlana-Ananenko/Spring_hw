package com.spring.hw.Service;

import org.springframework.web.context.annotation.SessionScope;

import java.util.ArrayList;
import java.util.List;

public class Basket {
    public List<String> productsList;

    public Basket() {
        this.productsList = new ArrayList<>();
    }
    @SessionScope
    public void addProducts(String products) {
        productsList.add(products);
    }
    @SessionScope
    public String getProducts() {
        return productsList.toString();
    }
}


