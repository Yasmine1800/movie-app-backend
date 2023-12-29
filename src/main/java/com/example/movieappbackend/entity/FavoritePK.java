package com.example.movieappbackend.entity;



import java.io.Serializable;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Embeddable
public class FavoritePK implements Serializable{
    private String filmId;
    private String userId;
}
