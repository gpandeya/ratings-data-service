package com.gp.rnd.ratingsdataservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gp.rnd.ratingsdataservice.entity.Rating;

@RestController
@RequestMapping("/ratingsdata")
public class RatingsDataController {

	@GetMapping("/{movieId}")
	public Rating getRating(@PathVariable("movieId") String movieId) {
			return new Rating(movieId, 5);
	}
}

