package com.java.RestApi;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class InformationResources {
	private InformationService service;

	public InformationResources(InformationService service) {
		super();
		this.service = service;
	}

	@GetMapping("/information")
	public List<Information> retrieveAll()
	{
		return service.findAll();
	}
	@GetMapping("/information/{zipcode}")
	public Information retrieveOne(@PathVariable Long zipcode)
	{
		return service.findOne(zipcode);
	}
}

