package com.example.movieappbackend.service.ServiceImp;

import com.example.movieappbackend.entity.User;
import com.example.movieappbackend.repository.userRepository.UserRepository;
import com.example.movieappbackend.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UserServiceImp implements UserService {

    @Autowired
    UserRepository userRepository;
    @Override
    public User login(User user) {
        if(userRepository.existsByUsername(user.getUsername())) {
            return userRepository.findByUsername(user.getUsername());
        }
        return userRepository.save(user);
    }
    @Override
    public User getUserById(String userId) {
        return userRepository.findByUserIdAsString(userId);
    }
}
