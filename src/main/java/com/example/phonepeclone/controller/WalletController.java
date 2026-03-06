package com.example.phonepeclone.controller;

import com.example.phonepeclone.model.Wallet;
import com.example.phonepeclone.service.WalletService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/wallet")
public class WalletController {

    @Autowired
    private WalletService walletService;

    @PostMapping("/add-money")
    public Wallet addMoney(@RequestParam Long userId,
                           @RequestParam double amount) {

        return walletService.addMoney(userId, amount);
    }
}