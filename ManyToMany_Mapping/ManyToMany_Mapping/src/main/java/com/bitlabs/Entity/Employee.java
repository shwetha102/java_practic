package com.bitlabs.Entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Employee {

	@Id
	private int id;
	private String eName;
	
	@ManyToMany(mappedBy="e")
	private List<Project> p;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String geteName() {
		return eName;
	}

	public void seteName(String eName) {
		this.eName = eName;
	}

	public List<Project> getP() {
		return p;
	}

	public void setP(List<Project> p) {
		this.p = p;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", eName=" + eName + ", p=" + p + "]";
	}
	
	
	
}
