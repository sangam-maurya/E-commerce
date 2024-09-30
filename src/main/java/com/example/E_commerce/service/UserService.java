package com.example.E_commerce.service;

import com.example.E_commerce.Model.User;
import com.example.E_commerce.reposetry.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository repository;
    @Autowired
    private PasswordEncoder encoder;

    public void createData(User user){
        user.setPassword(encoder.encode(user.getPassword()));
        repository.save(user);
    }

}
