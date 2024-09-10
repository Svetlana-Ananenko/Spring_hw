package com.spring.hw.Service;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BasketServiceImpl implements BasketService {
    //private final List<String> productsList = new ArrayList<>(List.of());

    private List<String> productsList;

    public void addProducts(String products) {
        productsList.add(products);
    }

    public List<String> getProducts() {
        return productsList;
    }

}
