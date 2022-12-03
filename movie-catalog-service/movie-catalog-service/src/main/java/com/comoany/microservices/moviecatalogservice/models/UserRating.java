package com.comoany.microservices.moviecatalogservice.models;

import java.util.List;

public class UserRating {
	private String userId;
	private List<Rating> rating;
	private List<Rating> userRating;

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public List<Rating> getRating() {
		return rating;
	}

	public void setRating(List<Rating> list) {
		this.rating = list;
	}

	public List<Rating> getUserRating() {
		return userRating;
	}

	public void setUserRating(List<Rating> userRating) {
		this.userRating = userRating;
	}




}
