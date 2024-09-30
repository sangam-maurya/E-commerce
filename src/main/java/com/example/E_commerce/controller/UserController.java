package com.example.E_commerce.controller;

import com.example.E_commerce.Model.User;
import com.example.E_commerce.reposetry.UserRepository;
import com.example.E_commerce.service.UserService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@Controller
public class UserController {

    @Autowired
    private UserService service;
    @Autowired
    UserRepository repository;
    @GetMapping("/index")
    public String create(){
        return "create";
    }

    @PostMapping("/register")
    public String saveReg(@Valid @ModelAttribute User user ,
                          BindingResult result){
        if(result.hasErrors()){
            return "create";
        }
        service.createData(user);
        return "login";
    }
    @GetMapping("/login")
    public String login(){
        return "login";
    }


    @GetMapping("/welcome")
    public String welcom(){
        return "welcome";
    }

    @GetMapping("/admin")
    public String admin(){
        return "Admin/admin";
    }

    @GetMapping("/product")
    public String product(){
        return "product";
    }


}
