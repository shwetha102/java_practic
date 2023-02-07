package com.bitlabs.HibernateAnotation;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Employe_Devop")
public class Employeee {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="employee_id") 
private int eid;
	@Column(name="employee_ename")
private String ename;
	@Column(name="employee_num")
private long ephonenum;
	@Column(name="employee_address")
private String eaddress;
	@Column(name="employee_salary")
private int esalary;
	public Employeee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public long getEphonenum() {
		return ephonenum;
	}
	public void setEphonenum(long ephonenum) {
		this.ephonenum = ephonenum;
	}
	public String getEaddress() {
		return eaddress;
	}
	public void setEaddress(String eaddress) {
		this.eaddress = eaddress;
	}
	public int getEsalary() {
		return esalary;
	}
	public void setEsalary(int esalary) {
		this.esalary = esalary;
	}


}
