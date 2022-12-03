package com.java.RestApi;

import org.springframework.stereotype.Component;

@Component
public class UserValidation1 {
	private String username="sreeja";
	  private String password="sreeja123";
	  public boolean find(String username1,String password1)
	  {
	      return username.equals(username1)&&password.equals(password1);
	}

}
