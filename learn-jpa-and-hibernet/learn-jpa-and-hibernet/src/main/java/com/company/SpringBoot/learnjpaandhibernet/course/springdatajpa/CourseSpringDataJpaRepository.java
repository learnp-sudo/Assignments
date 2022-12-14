package com.company.SpringBoot.learnjpaandhibernet.course.springdatajpa;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.company.SpringBoot.learnjpaandhibernet.course.Course;

public interface CourseSpringDataJpaRepository extends JpaRepository<Course, Long>
{
List<Course>findByAuthor(String author);
List<Course>findByName(String name);
}
