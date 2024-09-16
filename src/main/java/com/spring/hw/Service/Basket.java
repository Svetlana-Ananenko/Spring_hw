package com.spring.hw.Service;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.SessionScope;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
@Component
@SessionScope

public class Basket {

    private final List<String> productsList = new ArrayList<>();


    public void addProducts(List<String> products) {
        productsList.addAll(products);
    }

    public List<String> getProducts() {
        return Collections.unmodifiableList(productsList);
    }
}


