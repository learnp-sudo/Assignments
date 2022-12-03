package com.java.RestApi.admin;

public class ProductDetails {
	private Integer id;
	private String Name;
	private Integer cost;
	private String brand;
	public ProductDetails( Integer id,String name, Integer cost, String brand) {
	    super();
	    this.id=id;
	    this.Name = name;
	    this.cost = cost;
	    this.brand = brand;
	}
	public String getName() {
	    return Name;
	}
	public void setName(String name) {
	    Name = name;
	}
	public Integer getCost() {
	    return cost;
	}
	public void setCost(Integer cost) {
	    this.cost = cost;
	}
	public String getBrand() {
	    return brand;
	}
	public void setBrand(String brand) {
	    this.brand = brand;
	}
	public Integer getId() {
	    return id;
	}
	public void setId(Integer id) {
	    this.id = id;
	}
	@Override
	public String toString() {
	    return String.format("id  is %d ,name is %s ,cost is %d,brand is %s",+id,Name,+cost,brand);
	}
	}


