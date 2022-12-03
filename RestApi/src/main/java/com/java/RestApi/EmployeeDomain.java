package com.java.RestApi;

public class EmployeeDomain {
	private Integer id;
	private String name;
	private String Department;
	private String designation;
	private Double salary;
	public EmployeeDomain(Integer id, String name, String department, String designation, Double salary) {
		super();
		this.id = id;
		this.name = name;
		Department = department;
		this.designation = designation;
		this.salary = salary;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDepartment() {
		return Department;
	}
	public void setDepartment(String department) {
		Department = department;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public Double getSalary() {
		return salary;
	}
	public void setSalary(Double salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "EmployeeDomain [id=" + id + ", name=" + name + ", Department=" + Department + ", designation="
				+ designation + ", salary=" + salary + "]";
	}


}
