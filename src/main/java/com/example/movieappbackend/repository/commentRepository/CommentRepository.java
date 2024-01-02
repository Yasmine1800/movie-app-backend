package com.example.movieappbackend.repository.commentRepository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.movieappbackend.entity.Comment;

public interface CommentRepository extends JpaRepository<Comment, Long> {
    public List<Comment> findAllByFilmId(String filmId);
}
