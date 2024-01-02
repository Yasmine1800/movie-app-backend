package com.example.movieappbackend.service;

import com.example.movieappbackend.entity.User;




public interface UserService {
    public User login(User user);
    public User getUserById(String userId);
    public User saveUser(User user);
}

