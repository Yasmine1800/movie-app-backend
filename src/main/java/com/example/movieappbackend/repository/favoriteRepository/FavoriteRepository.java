package com.example.movieappbackend.repository.favoriteRepository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.movieappbackend.entity.Favorite;
import com.example.movieappbackend.entity.FavoritePK;


public interface FavoriteRepository extends JpaRepository<Favorite, FavoritePK>{

    @Query("SELECT f.id.filmId FROM Favorite f WHERE f.id.userId = :userId")
    List<String> findAllFilmIdsByUserId(@Param("userId") String userId);

    @Query("SELECT COUNT(f.id) FROM Favorite f WHERE f.id.userId = :userId")
    public int getFavoriteCount(String userId);
    

    @Query("SELECT f.id.filmId FROM Favorite f WHERE f.id.userId = :userId")
    public List<String> getFavoriteFilmIdByUserId(String userId);
}
