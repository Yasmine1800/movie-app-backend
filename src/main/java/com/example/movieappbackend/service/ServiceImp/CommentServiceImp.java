package com.example.movieappbackend.service.ServiceImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.movieappbackend.entity.Comment;
import com.example.movieappbackend.repository.commentRepository.CommentRepository;
import com.example.movieappbackend.service.CommentService;

@Service
public class CommentServiceImp implements CommentService {

    @Autowired
    CommentRepository commentRepository;

    @Override
    public Comment addComment(Comment comment) {
        return commentRepository.save(comment);
    }

    @Override
    public List<Comment> getCommentsByFilmId(String filmId) {
        return commentRepository.findAllByFilmId(filmId);
    }

}
