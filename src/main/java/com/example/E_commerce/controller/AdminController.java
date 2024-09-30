package com.example.E_commerce.controller;

import com.example.E_commerce.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class AdminController {
    @Autowired
    private UserService service;

    @GetMapping("/manageproduct")
    public String productMangae(){
        return "manageProduct";
    }


}
