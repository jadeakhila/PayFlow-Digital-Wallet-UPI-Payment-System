package com.example.phonepeclone.controller;

import com.example.phonepeclone.model.User;
import com.example.phonepeclone.service.WalletService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private WalletService walletService;

    @PostMapping("/register")
    public User register(@RequestBody User user) {
        return walletService.registerUser(user);
    }

}