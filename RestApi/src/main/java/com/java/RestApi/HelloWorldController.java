package com.java.RestApi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
	@GetMapping(path="/helloworld")
public String helloWorld()
{
	return "Hello World";
}
	@GetMapping(path="/helloworldbean")
	public HelloWorldBean helloWorldBean()
	{
		return new HelloWorldBean("Hello World");
	}
}
