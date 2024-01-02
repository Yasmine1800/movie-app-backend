package com.example.movieappbackend.repository.userRepository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.movieappbackend.entity.User;




public interface UserRepository extends JpaRepository<User,String> {
    boolean existsByUsername(String username);

    User findByUsername(String username);

    
    
}
