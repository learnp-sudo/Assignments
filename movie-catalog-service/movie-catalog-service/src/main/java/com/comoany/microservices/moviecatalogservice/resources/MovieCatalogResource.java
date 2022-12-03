package com.comoany.microservices.moviecatalogservice.resources;

import java.util.Arrays;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;

import com.comoany.microservices.moviecatalogservice.models.CatalogItem;
import com.comoany.microservices.moviecatalogservice.models.Movie;
import com.comoany.microservices.moviecatalogservice.models.Rating;
import com.comoany.microservices.moviecatalogservice.models.UserRating;
import com.comoany.microservices.moviecatalogservice.services.MovieInfo;
import com.comoany.microservices.moviecatalogservice.services.UserRatingInfo;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@RestController
@RequestMapping("/catalog")
public class MovieCatalogResource {
	@Autowired
	private RestTemplate restTemplate;
	@Autowired
	private WebClient.Builder webClientBuilder;

	@Autowired
	MovieInfo movieInfo;

	@Autowired
	UserRatingInfo userRatingInfo;

	@RequestMapping("/{userId}")
	//@HystrixCommand(fallbackMethod ="getFallbackCatalog")
	public List<CatalogItem> getCatalog(@PathVariable("userId") String userId) {
		WebClient.Builder builder =WebClient.builder();
		UserRating ratings = userRatingInfo.getUserRating(userId);

		return ratings.getUserRating().stream().map(rating ->
			 movieInfo.getCatalogItem(rating))
				.collect(Collectors.toList());
	}
}
	/*@HystrixCommand(fallbackMethod ="getFallbackCatalogItem")
	private CatalogItem getCatalogItem(Rating rating) {
		Movie movie = restTemplate.getForObject("http://movie-info-service/movies/" + rating.getMovieId(),
				Movie.class);

		return new CatalogItem(movie.getName(), movie.getDescription(), rating.getRating());
	}
	private CatalogItem getFallbackCatalogItem(Rating rating)
	{
		return new CatalogItem("Movie name not found", "", rating.getRating());
	}


	@HystrixCommand(fallbackMethod ="getFallbackUserRating")
	private UserRating getUserRating(String userId) {
		return restTemplate.getForObject("http://movie-data-service/ratingsdata/users/" + userId,
				UserRating.class);
	}
	private UserRating getFallbackUserRating(@PathVariable("userId") String userId)
	{
		UserRating userRatings=new UserRating();
		userRatings.setUserId(userId);
		userRatings.setRating(Arrays.asList(new Rating("0",0)));
	return userRatings;
	}*/

	//public List<CatalogItem> getFallbackCatalog(@PathVariable("userId") String userId)
	//{
		//return Arrays.asList(new CatalogItem("no movie","",0));
	//}

//get all rated movieIds
		//for each movie id, call movie info service and get details
		//put them all together
	//return Collections.singletonList(new CatalogItem("Transfromer","test",4));
//RestTemplate restTemplate=new RestTemplate();
//List<Rating> ratings=Arrays.asList(new Rating("1234",4),
//new Rating("5678",3),new Rating("5789",2));
/*Movie movie =webClientBuilder.build()
.get()
.uri("http://localhost:8081/movies/" +rating.getMovieId())
.retrieve()
.bodyToMono(Movie.class)
.block();*/
/*UserRating ratings = restTemplate.getForObject("http://movie-data-service/ratingsdata/users/" + userId,
		UserRating.class);

return ratings.getUserRating().stream().map(rating -> {
	Movie movie = restTemplate.getForObject("http://movie-info-service/movies/" + rating.getMovieId(),
			Movie.class);

	return new CatalogItem(movie.getName(), "Desc", rating.getRating());*/




