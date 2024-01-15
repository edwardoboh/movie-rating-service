package com.edwardoboh.moviemicro.movieratingservice;

import com.edwardoboh.moviemicro.movieratingservice.model.MovieRatingEntity;
import com.edwardoboh.moviemicro.movieratingservice.repository.MovieRatingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class MovieRatingServiceApplication implements CommandLineRunner {

	@Autowired
	MovieRatingRepository movieRatingRepository;

	public static void main(String[] args) {
		SpringApplication.run(MovieRatingServiceApplication.class, args);
	}

	public void run(String ...args) {
		List<MovieRatingEntity> movieRatingsList = new ArrayList<>();

		for (int i = 0; i<5; i++) {
			int randomRating = (int)Math.rint(Math.random() * 10);
			movieRatingsList.add(
					new MovieRatingEntity(randomRating, Integer.toString(i))
			);
		}
		movieRatingRepository.saveAll(movieRatingsList);
	}
}
