package com.example.demo.products;

import com.example.demo.users.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/products")
public class ProductController {

    private List<User> productList = new ArrayList<>();

    @GetMapping("/showAll")
    public String showAllProducts(Model model) {
        model.addAttribute("products", productList);
        model.addAttribute("product", new Product());
        return "products";
    }
}
