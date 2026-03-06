package com.example.phonepeclone.repository;

import com.example.phonepeclone.model.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransactionRepository extends JpaRepository<Transaction, Long> {
}