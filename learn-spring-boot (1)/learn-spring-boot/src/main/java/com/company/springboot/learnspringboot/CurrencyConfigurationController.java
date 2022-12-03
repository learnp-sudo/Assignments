package com.company.springboot.learnspringboot;



import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CurrencyConfigurationController {
	@Autowired
	private CurrencyServiceConfiguaration configuration;
	@RequestMapping("/currency-configuration")
	public CurrencyServiceConfiguaration retrieveAllCourses()
	{
		return configuration;

	}


}
