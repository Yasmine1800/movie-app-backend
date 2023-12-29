package com.example.movieappbackend.repository.userRepository;

import com.example.movieappbackend.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;




public interface UserRepository extends JpaRepository<User,Long> {
    boolean existsByUsername(String username);

    User findByUsername(String username);
    
    @Query("SELECT u FROM User u WHERE CAST(u.userId AS string) = :userId")
    User findByUserIdAsString(@Param("userId") String userId);
}
