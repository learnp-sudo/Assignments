package com.comoany.microservices.moviecatalogservice.services;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.client.RestTemplate;

import com.comoany.microservices.moviecatalogservice.models.Rating;
import com.comoany.microservices.moviecatalogservice.models.UserRating;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
@Service
public class UserRatingInfo {
		@Autowired
		private RestTemplate restTemplate;
	@HystrixCommand(fallbackMethod ="getFallbackUserRating")
	public UserRating getUserRating(String userId) {
		return restTemplate.getForObject("http://movie-data-service/ratingsdata/users/" + userId,
				UserRating.class);
	}
	public UserRating getFallbackUserRating(@PathVariable("userId") String userId)
	{
		UserRating userRatings=new UserRating();
		userRatings.setUserId(userId);
		userRatings.setRating(Arrays.asList(new Rating("0",0)));
	return userRatings;
	}

}
