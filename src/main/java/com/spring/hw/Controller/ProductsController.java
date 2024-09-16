package com.spring.hw.Controller;

import com.spring.hw.Service.Basket;
import com.spring.hw.Service.BasketService;
import com.spring.hw.Service.BasketServiceImpl;
import jakarta.servlet.http.HttpSession;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("/store/order")
public class ProductsController {

    private final BasketService basketService;


    public ProductsController(BasketService basketService) {
        this.basketService = basketService;
    }

    @GetMapping("/add")
        public String addProducts(@RequestParam("products") ArrayList<String> products) {
        basketService.addProducts(products);
        return "Товар "+ products  +" добавлен в корзину";
    }


    @GetMapping("/get")
    public List<String> getProducts()  {
        return  basketService.getProducts();
    }
}