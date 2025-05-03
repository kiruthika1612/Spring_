package com.example.demo.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Staff {

	@Id
	private int empID;
	private String firstName;
	private String lastName;
	private String designation;

	public Staff() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Staff(int empID, String firstName, String lastName, String designation) {
		super();
		this.empID = empID;
		this.firstName = firstName;
		this.lastName = lastName;
		this.designation = designation;
	}

	public int getEmpID() {
		return empID;
	}

	public void setEmpID(int empID) {
		this.empID = empID;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

}
