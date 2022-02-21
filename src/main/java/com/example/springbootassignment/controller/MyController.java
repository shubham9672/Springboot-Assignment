package com.example.springbootassignment.controller;

import com.example.springbootassignment.entites.User;
import com.example.springbootassignment.service.UserSerImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MyController {
    @Autowired
    private UserSerImpl userService;

    @GetMapping("/")
    public String home() {
        return "Welcome to spring boot assignment";
    }

    //get users
    @GetMapping("/details")
    public List<User> getUsers(){
        return this.userService.getUsers();
    }
}
