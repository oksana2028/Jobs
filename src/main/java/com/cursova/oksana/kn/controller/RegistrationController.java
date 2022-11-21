package com.cursova.oksana.kn.controller;

import com.cursova.oksana.kn.model.User;
import com.cursova.oksana.kn.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class RegistrationController {

    private final UserServiceImpl userService;

    @Autowired
    public RegistrationController(UserServiceImpl userService) {
        this.userService = userService;
    }

    @GetMapping("/registration")
    public String registration(Model model) {
        model.addAttribute("userForm", new User());
        return "user/registration";
    }

    @PostMapping("/registration")
    public String addUser(@ModelAttribute("userForm") User user) {
        user.setRole("USER");
        userService.create(user);
        return "redirect:/";
    }
}
