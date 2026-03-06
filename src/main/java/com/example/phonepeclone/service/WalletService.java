package com.example.phonepeclone.service;

import com.example.phonepeclone.model.User;
import com.example.phonepeclone.model.Wallet;
import com.example.phonepeclone.repository.UserRepository;
import com.example.phonepeclone.repository.WalletRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WalletService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private WalletRepository walletRepository;

    // REGISTER USER
    public User registerUser(User user) {

        User savedUser = userRepository.save(user);

        Wallet wallet = new Wallet();
        wallet.setUser(savedUser);
        wallet.setBalance(0);

        walletRepository.save(wallet);

        return savedUser;
    }

    // ADD MONEY
    public Wallet addMoney(Long userId, double amount) {

        Wallet wallet = walletRepository.findByUserId(userId);

        wallet.setBalance(wallet.getBalance() + amount);

        return walletRepository.save(wallet);
    }
}