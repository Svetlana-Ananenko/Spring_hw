package com.spring.hw.Service;

import org.springframework.stereotype.Service;
import java.util.List;


@Service


public class BasketServiceImpl implements BasketService{
    private final Basket basket;

    public BasketServiceImpl(Basket basket) {
        this.basket = basket;
    }


    public void addProducts(List <String> products) {
        basket.addProducts(products);
    }

    public List<String> getProducts() {
        return basket.getProducts();
    }

}
