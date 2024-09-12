package com.spring.hw.Service;

import org.springframework.web.context.annotation.SessionScope;

public interface BasketService {
    @SessionScope
    String addProducts(String products);
    @SessionScope
    String getProducts();
}
