package com.edwardoboh.moviemicro.movieratingservice.repository;

import com.edwardoboh.moviemicro.movieratingservice.model.MovieRatingEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

@Repository
@EnableJpaRepositories
public interface MovieRatingRepository extends JpaRepository<MovieRatingEntity, String> {
}
