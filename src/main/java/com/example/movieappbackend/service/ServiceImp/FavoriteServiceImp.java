package com.example.movieappbackend.service.ServiceImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.movieappbackend.entity.Favorite;
import com.example.movieappbackend.entity.FavoritePK;
import com.example.movieappbackend.repository.favoriteRepository.FavoriteRepository;
import com.example.movieappbackend.service.FavoriteService;

@Service
public class FavoriteServiceImp implements FavoriteService {

    @Autowired
    FavoriteRepository favoriteRepository;

    @Override
    public List<String> getFavoriteListByUserId(String userId) {
        return favoriteRepository.findAllFilmIdsByUserId(userId);
    }

    @Override
    public Favorite addFavorite(String userId, String filmId) {
    return favoriteRepository.save(new Favorite(new FavoritePK(filmId, userId)));
}

    @Override
    public int getFavoriteCount(String userId) {
       return favoriteRepository.getFavoriteCount(userId);
    }

}
