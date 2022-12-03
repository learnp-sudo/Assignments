package com.java.RestApi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.java.RestApi.Socialmedia.user.Post;

public interface PostRepository extends JpaRepository<Post,Integer > {

}
