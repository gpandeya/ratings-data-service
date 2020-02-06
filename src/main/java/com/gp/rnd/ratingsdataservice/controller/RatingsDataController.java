package com.gp.rnd.ratingsdataservice.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gp.rnd.ratingsdataservice.entity.Rating;
import com.gp.rnd.ratingsdataservice.entity.UserRating;

@RestController
@RequestMapping("/ratingsdata")
public class RatingsDataController {

	@GetMapping("/{movieId}")
	public Rating getRating(@PathVariable("movieId") String movieId) {
			return new Rating(movieId, 5);
	}
	
	@GetMapping("/users/{userId}")
	public UserRating getUserRatings(@PathVariable("userId") String userId){
		 List<Rating> ratings = Arrays.asList(
				new Rating("101",1),
				new Rating("550",2),
				new Rating("500",3));
		 return new UserRating(ratings);
	}
	
}

