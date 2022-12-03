package com.java.RestApi;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class Information {
	private String state;
	private String city;
	private String Country;
	@JsonIgnore
	private Long zipcode;
	public Information(String state, String city, String country, Long zipcode) {
		super();
		this.state = state;
		this.city = city;
		this.Country = country;
		this.zipcode = zipcode;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getCountry() {
		return Country;
	}
	public void setCountry(String country) {
		this.Country = country;
	}
	public Long getZipcode() {
		return zipcode;
	}
	/*public void setZipcode(Long zipcode) {
		this.zipcode = zipcode;
	}*/
	@Override
	public String toString() {
		return "Information [state=" + state + ", city=" + city + ", Country=" + Country + "]";
	}


}
