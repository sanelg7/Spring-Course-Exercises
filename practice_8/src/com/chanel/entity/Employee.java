package com.chanel.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="employee")
public class Employee {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column
	private int id;
	@Column(name="first_name")
	private String firsName;

	@Column(name="last_name")
	private String lastName;

	@Column(name="company")
	private String company;
	
	public Employee() {}

	public Employee(String firsName, String lastName, String company) {
		super();
		this.firsName = firsName;
		this.lastName = lastName;
		this.company = company;
	}

	public String getFirsName() {
		return firsName;
	}

	public void setFirsName(String firsName) {
		this.firsName = firsName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", firsName=" + firsName + ", lastName=" + lastName + ", company=" + company
				+ "]";
	}

	
	
	

}
