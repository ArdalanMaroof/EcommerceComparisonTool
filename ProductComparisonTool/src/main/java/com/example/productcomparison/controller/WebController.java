package com.example.productcomparison.controller;

import com.example.productcomparison.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class WebController {
    @Autowired
    private ProductService productService;

    @GetMapping("/search")
    public String searchPage() {
        return "search";
    }

    @GetMapping("/search/results")
    public String searchProducts(@RequestParam String name, Model model) {
        model.addAttribute("products", productService.searchProductsByName(name));
        return "search";
    }
}

