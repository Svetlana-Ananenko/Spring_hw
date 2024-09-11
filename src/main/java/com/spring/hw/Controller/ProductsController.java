package com.spring.hw.Controller;

import com.spring.hw.Service.Basket;
import com.spring.hw.Service.BasketServiceImpl;
import jakarta.servlet.http.HttpSession;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/store/order")
public class ProductsController {

    private BasketServiceImpl basketServiceImpl;


    public ProductsController(BasketServiceImpl basketServiceImpl) {
        this.basketServiceImpl = basketServiceImpl;
    }

    @GetMapping("/add")
        public ResponseEntity<String> addProducts(@RequestParam String productsList, HttpSession session) {
        BasketServiceImpl basket = (BasketServiceImpl) session.getAttribute("basket");
            if (basket == null) {
                basket = new BasketServiceImpl(); // Создайте новый объект Basket (корзину)
                session.setAttribute("basket", basket); //добавляем корзину в сессию
            }

        if (productsList != null && !productsList.isEmpty()) {
        for (String products : productsList.split(" ")) {
            basket.addProducts(products);  //  Здесь  продукты  будут  добавляться  с  учетом  UTF-8
            }
        }
        return ResponseEntity.status(HttpStatus.OK).body("Товар в корзину - добавлен");
    }


    @GetMapping("/get")
    public ResponseEntity<List<String>> getProducts(HttpSession session)  {
        BasketServiceImpl basket = (BasketServiceImpl) session.getAttribute("basket");
        if (basket == null) {
            basket = new BasketServiceImpl();
            session.getAttribute("basket");
        }
        return ResponseEntity.ok(basket.getProducts());
    }
}