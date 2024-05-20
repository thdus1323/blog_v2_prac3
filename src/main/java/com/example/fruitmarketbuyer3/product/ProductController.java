package com.example.fruitmarketbuyer3.product;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ProductController {

    @GetMapping("/")
    public String list(){

        return "product/list";
    }
}
