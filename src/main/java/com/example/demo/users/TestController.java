package com.example.demo.users;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller
 public class TestController {

    @Controller
    public class HomeController {

        @GetMapping("/home")
        public String home() {
            return "home";
        }

        @GetMapping("/products")
        public String products() {
            return "products";
        }

        @GetMapping("/about")
        public String about() {
            return "about";
        }

        @GetMapping("/contact")
        public String contact() {
            return "contact";
        }

        @GetMapping("/cart")
        public String cart() {
            return "cart";
        }

        @PostMapping("/contact")
        public String handleContactForm(
                @RequestParam("name") String name,
                @RequestParam("email") String email,
                @RequestParam("message") String message,
                Model model) {

            // Przetwarzanie danych formularza, np. zapis do bazy danych, wysłanie emaila, itp.
            model.addAttribute("message", "Wiadomość została wysłana pomyślnie!");
            return "contact";
        }
    }
}
