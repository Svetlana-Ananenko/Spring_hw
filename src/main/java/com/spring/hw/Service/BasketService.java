package com.spring.hw.Service;

import java.util.List;

public interface BasketService {

    void addProducts(List<String> products);

    List<String> getProducts();

}
