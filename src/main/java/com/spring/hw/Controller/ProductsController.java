package com.spring.hw.Controller;

import com.spring.hw.Service.Basket;
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

    private BasketServiceImpl basketServiceImpl;


    public ProductsController(BasketServiceImpl basketServiceImpl) {
        this.basketServiceImpl = basketServiceImpl;
    }

    @GetMapping("/add")
        public ResponseEntity<String> addProducts(@RequestParam String productsList) {
        return ResponseEntity.status(HttpStatus.OK).body("Товар в корзину - добавлен");
    }


    @GetMapping("/get")
    public ResponseEntity<List<String>> getProducts()  {
        return ResponseEntity.ok(Collections.singletonList(basketServiceImpl.getProducts()));
    }
}