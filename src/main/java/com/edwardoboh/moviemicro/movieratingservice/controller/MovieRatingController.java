package com.edwardoboh.moviemicro.movieratingservice.controller;

import com.edwardoboh.moviemicro.movieratingservice.model.MovieRatingEntity;
import com.edwardoboh.moviemicro.movieratingservice.model.UserMovieRatingEntity;
import com.edwardoboh.moviemicro.movieratingservice.repository.MovieRatingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/rating")
public class MovieRatingController {

    @Autowired
    MovieRatingRepository movieRatingRepository;

//    @GetMapping("/{userId}")
//    public ResponseEntity<List<MovieRatingEntity>> getMovieRating(@PathVariable String userId) {
//        List<MovieRatingEntity> movieRatingEntities = movieRatingRepository.findAll();
//        return ResponseEntity.ok(movieRatingEntities);
//    }

    @GetMapping("/user/{userId}")
    public ResponseEntity<UserMovieRatingEntity> getUserMovieRating (@PathVariable String userId) {
        List<MovieRatingEntity> movieRating = movieRatingRepository.findAll();
        UserMovieRatingEntity userMovieRating = new UserMovieRatingEntity(movieRating);
        return ResponseEntity.ok(userMovieRating);
    }
}
