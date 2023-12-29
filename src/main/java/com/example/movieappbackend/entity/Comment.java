package com.example.movieappbackend.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "comments")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Comment {

    @Id()
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long commentId;

    @Column(name = "film_id")
    private String filmId;

    @Column(name = "user_id")
    private String userId;

    @Column(name = "comment_body")
    private String commentBody;

    public Comment(String userId, String filmId, String commentBody) {
        this.userId = userId;
        this.filmId = filmId;
        this.commentBody = commentBody;
    }


    @Override
    public String toString() {
        return "{" +
            " commentId='" + getCommentId() + "'" +
            ", filmId='" + getFilmId() + "'" +
            ", userId='" + getUserId() + "'" +
            ", commentBody='" + getCommentBody() + "'" +
            "}";
    }

}
