package com.spring.hw.Service;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.SessionScope;

import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;

@Service
@Scope("prototype")

public class BasketServiceImpl implements BasketService {
    public List<String> productsList = new ArrayList<>(List.of());
    private Files session;

    @Override
@SessionScope
    public String addProducts(String products) {
    return String.valueOf(productsList.add(products));

    }
    @Override
    @SessionScope
    public String getProducts() {
        return productsList.toString();
    }

}
