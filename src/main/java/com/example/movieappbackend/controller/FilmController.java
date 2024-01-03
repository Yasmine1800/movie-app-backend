package com.example.movieappbackend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.movieappbackend.service.CommentService;
import java.util.List;
import com.example.movieappbackend.entity.Comment;

@RestController
@RequestMapping("/film")
@CrossOrigin(origins = {"http://localhost:4200","https://movie-app-frontend-seven.vercel.app","http://localhost"})
public class FilmController {
    
    @Autowired
    CommentService commentService;

    @GetMapping("/comments/{filmId}")
    public List<Comment> getCommentsByFilmId(@PathVariable String filmId) {
        return commentService.getCommentsByFilmId(filmId);
        
    }

}
