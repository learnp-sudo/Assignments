package com.company.springboot.learnspringboot;



import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseController {
	@RequestMapping("/courses")
	public List<Course> retrieveAllCourses()
	{
		return Arrays.asList(
				new Course(1,"Learn AWS","in28minutes"),
				new Course(2,"Learn Devops","in28minutes"),
				new Course(3,"Learn Devtools","in28minutes"),
				new Course(4,"Learn Dev","in28minutes")
				);
	}


}
