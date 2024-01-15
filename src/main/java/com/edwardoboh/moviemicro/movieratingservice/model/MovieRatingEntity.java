package com.edwardoboh.moviemicro.movieratingservice.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class MovieRatingEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;
    private int rating;
    private String movieId;

    public MovieRatingEntity() {}

    public MovieRatingEntity(String id, int rating, String movieId) {
        this.id = id;
        this.rating = rating;
        this.movieId = movieId;
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public String getMovieId(){
        return this.movieId;
    }

    public void setMovieId(String movieId) {
        this.movieId = movieId;
    }

    @Override
    public String toString() {
        return "MovieRatingEntity{" +
                "id='" + id + '\'' +
                ", rating=" + rating +
                ", movieId='" + movieId + '\'' +
                '}';
    }
}
