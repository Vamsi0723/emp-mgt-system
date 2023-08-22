package com.sample.empmgtsystem.vo;

public class EmployeeVO {

	int id;
	String firstName;
	String lastName;
	String midName;
	String department;
	String designation;
	String location;
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

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public int getPhoneNum() {
		return phoneNum;
	}

	public void setPhoneNum(int phoneNum) {
		this.phoneNum = phoneNum;
	}

	public EmployeeVO(int id, String firstName, String lastName, String midName, String department,
			String designation, String location, int phoneNum) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.midName = midName;
		this.department = department;
		this.designation = designation;
		this.location = location;
		this.phoneNum = phoneNum;
	}

	public EmployeeVO() {
		super();
	}

	@Override
	public String toString() {
		return "EmployeeVO [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", midName="
				+ midName + ", department=" + department + ", designation=" + designation + ", location=" + location
				+ ", phoneNum=" + phoneNum + "]";
	}

}
