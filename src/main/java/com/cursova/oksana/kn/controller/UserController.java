package com.cursova.oksana.kn.controller;

import com.cursova.oksana.kn.model.User;
import com.cursova.oksana.kn.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class UserController {
    private final UserServiceImpl userService;


    @Autowired
    public UserController(UserServiceImpl userService) {
        this.userService = userService;
    }

    @GetMapping("/{userId}")
    public String getById(@PathVariable int userId, Model model) {
        model.addAttribute("userModel", userService.findById(userId));
        return "user/user";
    }

    @GetMapping("/all")
    public String showAllUsers(Model model) {
        List<User> user = userService.findAll();
        model.addAttribute("userModel", user);
        return "user/allUsers";
    }

}
