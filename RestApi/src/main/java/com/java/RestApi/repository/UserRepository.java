package com.java.RestApi.repository;

import org.springframework.data.jpa.repository.JpaRepository;


import com.java.RestApi.Socialmedia.user.User;

public interface UserRepository extends JpaRepository<User,Integer>
{

}
