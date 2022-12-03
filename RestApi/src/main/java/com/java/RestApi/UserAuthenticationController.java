package com.java.RestApi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserAuthenticationController {
	private UserValidation1 result;

	   public UserAuthenticationController(UserValidation1 result) {
		super();
		this.result = result;
	}

	@GetMapping("/login/{name}/{password}")
	   public String solution(@PathVariable String name,@PathVariable String password)
	   {
	       boolean sol=result.find(name,password);
	       if(sol)
	       {
	           return "valid user";
	       }
	       else
	       {
	           return "Invalid user";
	       }
	   }
}

