package com.edwardoboh.moviemicro.movieratingservice.controller;

import com.edwardoboh.moviemicro.movieratingservice.model.MovieRatingEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rating")
public class MovieRatingController {

    @GetMapping("/{movieId}")
    public ResponseEntity<MovieRatingEntity> getMovieRating(@PathVariable String movieId) {
        return ResponseEntity.ok(
                new MovieRatingEntity(
                        movieId,
                        7,
                        "uernefej"
                )
        );
    }
}
