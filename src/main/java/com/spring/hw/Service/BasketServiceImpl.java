package com.spring.hw.Service;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@Scope("prototype")

public class BasketServiceImpl implements BasketService {
    public List<String> productsList = new ArrayList<>(List.of());

@Override
    public String addProducts(String products) {
    return String.valueOf(productsList.add(products));

    }
    @Override
    public List<String> getProducts() {
        return productsList;
    }

}
