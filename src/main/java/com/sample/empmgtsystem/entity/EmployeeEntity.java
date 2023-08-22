package com.sample.empmgtsystem.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.DynamicUpdate;

@Entity
@Table(name = "EMPLOYEE")
@DynamicUpdate
public class EmployeeEntity {

	@Id
	@Column(name = "ID")
	int id;
	@Column(name = "FIRST_NAME")
	String firstName;
	@Column(name = "LAST_NAME")
	String lastName;
	@Column(name = "MID_NAME")
	String midName;
	@Column(name = "LOCATION")
	String location;
	@Column(name = "DESIGNATION")
	String designation;
	@Column(name = "DEPARTMENT")
	String department;
	@Column(name = "PHONE_NUM")
	int phoneNum;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public String getMidName() {
		return midName;
	}

	public void setMidName(String midName) {
		this.midName = midName;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public int getPhoneNum() {
		return phoneNum;
	}

	public void setPhoneNum(int phoneNum) {
		this.phoneNum = phoneNum;
	}

	public EmployeeEntity() {
		super();
	}

	public EmployeeEntity(int id, String firstName, String lastName, String midName, String location,
			String designation, String department, int phoneNum) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.midName = midName;
		this.location = location;
		this.designation = designation;
		this.department = department;
		this.phoneNum = phoneNum;
	}

	@Override
	public String toString() {
		return "EmployeeEntity [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", midName="
				+ midName + ", location=" + location + ", designation=" + designation + ", department=" + department
				+ ", phoneNum=" + phoneNum + "]";
	}

}
