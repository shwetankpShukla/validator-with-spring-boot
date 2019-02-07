package com.spider.api.dto;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;


public class Person {
	
	@NotNull(message = "The id must not be null")
	private Long id;
	@NotNull(message = "The name must not be null")
	private String name;
	
	@Min(1)
	private int age;
	
	@NotNull(message = "The address must not be null")
	private String address;

	@Min(1)
	@Max(10)
	private int numberBetweenOneAndTen;

	@Pattern(regexp = "^[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}$")
	private String ipAddress;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getNumberBetweenOneAndTen() {
		return numberBetweenOneAndTen;
	}

	public void setNumberBetweenOneAndTen(int numberBetweenOneAndTen) {
		this.numberBetweenOneAndTen = numberBetweenOneAndTen;
	}

	public String getIpAddress() {
		return ipAddress;
	}

	public void setIpAddress(String ipAddress) {
		this.ipAddress = ipAddress;
	}
	
	
	

}
