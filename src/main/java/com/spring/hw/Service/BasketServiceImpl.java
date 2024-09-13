package com.spring.hw.Service;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.SessionScope;

import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;

@Service


public class BasketServiceImpl implements BasketService {
    public List<String> productsList = new ArrayList<>(List.of());
    private Files session;

    @Override

    public String addProducts(String products) {
        for (String product : productsList) {
            productsList.add(products);
        }
        return String.valueOf(productsList.add(products));

    }
    @Override

    public String getProducts() {
        productsList.toString();
        return productsList.toString();
    }

}
