package com.example.demo.users;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/users")
public class UsersController {

    private List<User> userList = new ArrayList<>();

    @GetMapping
    public String users(Model model) {
        model.addAttribute("users", userList);
        model.addAttribute("user", new User());
        return "users";
    }

    @PostMapping("/add")
    public String addUser(@ModelAttribute User user) {
        userList.add(user);
        return "redirect:/users";
    }

    @PostMapping("/delete/{index}")
    public String deleteUser(@PathVariable int index) {
        if (index >= 0 && index < userList.size()) {
            userList.remove(index);
        }
        return "redirect:/users";
    }
}
