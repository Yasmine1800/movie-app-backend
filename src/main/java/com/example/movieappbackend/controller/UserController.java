package com.example.movieappbackend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.movieappbackend.entity.Comment;
import com.example.movieappbackend.entity.Favorite;
import com.example.movieappbackend.entity.User;
import com.example.movieappbackend.service.CommentService;
import com.example.movieappbackend.service.FavoriteService;
import com.example.movieappbackend.service.UserService;

@RestController
@RequestMapping("/user")
@CrossOrigin(origins = {"http://localhost:4200","https://movie-app-frontend-seven.vercel.app"})
public class UserController {

    @Autowired
    UserService userService;

    @Autowired
    FavoriteService favoriteService;

    @Autowired
    CommentService commentService;

    @PostMapping("/login")
    public ResponseEntity<User> login(@RequestBody User user) {
        return new ResponseEntity<>(userService.login(user), HttpStatus.OK);
    }

    @GetMapping("/{userId}")
    public ResponseEntity<User> getUserById(@PathVariable("userId") String userId) {
        return new ResponseEntity<>(userService.getUserById(userId), HttpStatus.OK);
    }

    @PostMapping("/favorite/add/{userId}/{filmId}")
    public ResponseEntity<Favorite> addFavorite(@PathVariable("userId") String userId, @PathVariable("filmId") String filmId) {
        return new ResponseEntity<>(favoriteService.addFavorite(userId,filmId),HttpStatus.OK);
    }

    @GetMapping("/favorite/{userId}")
    public ResponseEntity<?> getFavoriteListByUserId(@PathVariable("userId") String userId) {
        return new ResponseEntity<>(favoriteService.getFavoriteListByUserId(userId),HttpStatus.OK);
    }

    @GetMapping("/favorite/count/{userId}")
    public ResponseEntity<?> getFavoriteCount(@PathVariable("userId") String userId) {
        return new ResponseEntity<>(favoriteService.getFavoriteCount(userId),HttpStatus.OK);
    }

    @PostMapping("/comment/add")
    public ResponseEntity<HttpStatus> addComment(@RequestBody Comment comment) {
        commentService.addComment(comment);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping("/favorite/ids/{userId}")
        public ResponseEntity<List<String>> getFavoriteFilmIdByUserId(@PathVariable("userId") String userId) {
            return new ResponseEntity<>(favoriteService.getFavoriteFilmIdByUserId(userId),HttpStatus.OK);
        }
    

    @PostMapping("/favorite/delete/{userId}/{filmId}")
    public ResponseEntity<HttpStatus> deleteFavorite(@PathVariable("userId") String userId, @PathVariable("filmId") String filmId) {
        favoriteService.deleteFavorite(userId,filmId);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @PostMapping("/save")
    public ResponseEntity<User> saveUser(@RequestBody User user) {
        return new ResponseEntity<>(userService.saveUser(user),HttpStatus.OK);
    }

}


