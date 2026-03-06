package com.example.phonepeclone.repository;

import com.example.phonepeclone.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}