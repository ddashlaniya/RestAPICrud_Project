package com.crudonapi.CrudOperation.bean;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Employee_Hibernate") 
public class Employee {

	@Id
	private Integer id;
	private String name;
	private String email;
	private String number;
	private String city;
	public Employee() {
	
	}
	public Employee(Integer id, String name, String email, String number, String city) {
		super();
		this.id= id;
		this.name = name;
		this.email = email;
		this.number = number;
		this.city = city;
	}
	
	
	public int getId() {
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getCity() {
		return city;
	}
	public void setCuty(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", email=" + email + ", number=" + number + ", cuty=" + city + "]";
	}
	
	
}
