package com.company.SpringBoot.learnjpaandhibernet.course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.company.SpringBoot.learnjpaandhibernet.course.Course;
import com.company.SpringBoot.learnjpaandhibernet.course.jpa.CourseJpaRepository;
import com.company.SpringBoot.learnjpaandhibernet.course.springdatajpa.CourseSpringDataJpaRepository;
@Component
public class CourseCommandLineRunner implements CommandLineRunner{
    //@Autowired
	//private CourseJdbcRepository repository;
	//@Autowired
	//private CourseJpaRepository repository;
@Autowired
private CourseSpringDataJpaRepository repository;

	@Override
	public void run(String... args) throws Exception {
		repository.save(new Course(1,"JPA","in28minutes"));
		repository.save(new Course(2,"JDBC!","in28minutes"));
		repository.save(new Course(3,"SPRINGBOOT","in28minutes"));
		repository.save(new Course(4,"SPRINGMVC","in28minutes"));
	/*repository.insert(new Course(1,"JPA","in28minutes"));
	repository.insert(new Course(2,"JDBC!","in28minutes"));
	repository.insert(new Course(3,"SPRINGBOOT","in28minutes"));
	repository.insert(new Course(4,"SPRINGMVC","in28minutes"));*/
	repository.deleteById(4l);
	System.out.println(repository.findById(2l));
	System.out.println(repository.findById(3l));
	System.out.println(repository.findAll());
	System.out.println(repository.count());
	System.out.println(repository.findByAuthor("in28minutes"));
	System.out.println(repository.findByName("JDBC!"));
	System.out.println(repository.findByName("Jdbc!"));
	/*repository.deleteById(4);
	System.out.println(repository.findById(2));
	System.out.println(repository.findById(3));*/
	}




}
