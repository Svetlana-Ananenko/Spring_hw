package com.spring.hw.Controller;

import com.spring.hw.Service.Basket;
import jakarta.servlet.http.HttpSession;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/store/order")
public class ProductsController {

    @GetMapping("/add")
        public void addProducts(@RequestParam(value = "productsList") String productsList, HttpSession session) {
        Basket basket = (Basket) session.getAttribute("basket");
            if (basket == null) {
                basket = new Basket(); // Создайте новый объект Basket (корзину)
                session.setAttribute("basket", basket); //добавляем корзину в сессию
            }

        if (productsList != null && !productsList.isEmpty()) {
        for (String products : productsList.split(" ")) {
            basket.addProducts(products);  //  Здесь  продукты  будут  добавляться  с  учетом  UTF-8
            }
        }

    }


    @GetMapping("/get")
    public List<String> getProducts(HttpSession session) {
        Basket basket = (Basket) session.getAttribute("basket");
        return basket != null ? basket.getProducts() : new ArrayList<>();
    }
}