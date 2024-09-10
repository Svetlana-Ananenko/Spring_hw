package com.spring.hw.Service;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

public class Basket {
    public List<String> productsList;

    public Basket() {
        this.productsList = new ArrayList<>();
    }

    public void addProducts(String products) {
        productsList.add(products);
    }

    public List<String> getProducts() {
        return productsList;
    }
}


