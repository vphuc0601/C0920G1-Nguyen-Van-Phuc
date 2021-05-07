package com.example.demo.services;

import com.example.demo.entities.User;

import java.util.List;

public interface UserService {
    List<User> findAll();

    User findByUsername(String username);

    void save(User user);
}
