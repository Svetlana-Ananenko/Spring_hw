package com.spring.hw.Service;

import org.springframework.web.context.annotation.SessionScope;

public interface BasketService {

    String addProducts(String products);

    String getProducts();
}
