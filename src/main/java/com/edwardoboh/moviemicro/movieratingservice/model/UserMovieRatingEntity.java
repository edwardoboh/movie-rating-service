package com.edwardoboh.moviemicro.movieratingservice.model;

import java.util.List;

public record UserMovieRatingEntity(List<MovieRatingEntity> ratings){};