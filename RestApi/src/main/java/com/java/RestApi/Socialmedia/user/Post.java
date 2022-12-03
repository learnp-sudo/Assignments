package com.java.RestApi.Socialmedia.user;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Post {
	protected Post()
	{

	}
	@Id
	@GeneratedValue
	private Integer id;
	@Size(min=10)
	private String description;
	@ManyToOne(fetch = FetchType.LAZY)
	@JsonIgnore
	private User user;
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public Post(Integer id, String description) {
		super();
		this.id = id;
		this.description = description;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	@Override
	public String toString() {
		return "Post [id=" + id + ", description=" + description + "]";
	}
}
