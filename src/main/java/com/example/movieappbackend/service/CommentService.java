package com.example.movieappbackend.service;

import java.util.List;

import com.example.movieappbackend.entity.Comment;

public interface CommentService {
    public Comment addComment(Comment comment);
    public List<Comment> getCommentsByFilmId(String filmId);
    
}
