package com.java.RestApi;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import org.springframework.stereotype.Component;

import com.java.RestApi.Socialmedia.user.User;
@Component
public class EmployeeService {
	private static List<EmployeeDomain> emp= new ArrayList<>();
	private static int empId=0;
	static {
		emp.add(new EmployeeDomain(++empId,"sreeja","java","Trainer",30000.0));
		emp.add(new EmployeeDomain(++empId,"sreeya","python","Developer",50000.0));
		emp.add(new EmployeeDomain(++empId,"rahul","database","software",50000.0));
	}
	public List<EmployeeDomain> findAll()
	{
		return emp;
	}
	public EmployeeDomain save(EmployeeDomain emp1)
	{
		emp1.setId(++empId);
		emp.add(emp1);
		return emp1;
		}

	public EmployeeDomain findOne(int empId)
	{
		Predicate<? super EmployeeDomain> predicate = user -> user.getId().equals(empId);
	   return emp.stream().filter(predicate).findFirst().orElse(null);
	}
	public void deleteById(int id) {
		Predicate<? super EmployeeDomain> predicate = employee -> employee.getId().equals(id);
	    emp.removeIf(predicate);
	}
	/*public EmployeeDomain updatebyId(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}*/

	}



