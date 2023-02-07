package com.bitlabs.My_First_Hibernate;

import javax.persistence.Entity;
import javax.persistence.Id;

//to create table
@Entity

public class Employee {
	@Id
	private int id;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	private String name;
	private int salary;

}
