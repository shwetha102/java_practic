package com.bitlabs.Entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Project {

	@Id
	private int id;
	private String pName;
	
	@ManyToMany
	private List<Employee> e;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getpName() {
		return pName;
	}

	public void setpName(String pName) {
		this.pName = pName;
	}

	public List<Employee> getE() {
		return e;
	}

	public void setE(List<Employee> e) {
		this.e = e;
	}

	@Override
	public String toString() {
		return "Project [id=" + id + ", pName=" + pName + ", e=" + e + "]";
	}
	
	
}
