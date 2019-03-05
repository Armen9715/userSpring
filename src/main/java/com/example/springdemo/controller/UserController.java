package com.example.springdemo.controller;

import com.example.springdemo.model.User;
import com.example.springdemo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserRepository userRepository;

    @PostMapping("/add")
    public String add(@RequestParam("name") String name, @RequestParam("surname") String surname) {
        User user = User.builder().name(name).surname(surname).build();
        userRepository.save(user);
        System.out.println(user);
        return "redirect:/home";
    }
}
