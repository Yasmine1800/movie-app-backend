package com.example.movieappbackend.service;

import java.util.List;

import com.example.movieappbackend.entity.Favorite;

public interface FavoriteService {
    public List<String> getFavoriteListByUserId(String userId);
    public Favorite addFavorite(String userId, String filmId);
    public int getFavoriteCount(String userId);
    public List<String> getFavoriteFilmIdByUserId(String userId);
    public void deleteFavorite(String userId, String filmId);
}
