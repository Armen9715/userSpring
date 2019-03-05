package com.example.springdemo.controller;

import com.example.springdemo.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping ("/user")
public class UserController {

    @PostMapping("/add")
    public String add(@RequestParam("name") String name, @RequestParam("surname") String surname){
       User user = User.builder()
               .name(name)
               .surname(surname)
               .build();
        return "redirect:/home";
    }
}
