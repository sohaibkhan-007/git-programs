package com.project.hrm.beanEmployee;



public class IEmployee {
	private String id;
	private String name;
	private String department;
	private String gender;
	private String address;
	private String mobile_number;
	private String work_Location;
	private String   joining_Date;
	
	public IEmployee() {
		super();
	}
	public String getId() {
		return id;
	}
	public void setId(String uniqueId) {
		this.id = uniqueId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getWork_Location() {
		return work_Location;
	}
	public void setWork_Location(String work_Location) {
		this.work_Location = work_Location;
	}
	public String getJoining_Date() {
		return joining_Date;
	}
	public void setJoining_Date(String string) {
		this.joining_Date = string;
	}
	public String getMobile_number() {
		return mobile_number;
	}
	public void setMobile_number(String mobile_number) {
		this.mobile_number = mobile_number;
	}
	@Override
	public String toString() {
		return "IEmployee [id=" + id + ", name=" + name + ", department=" + department + ", gender=" + gender
				+ ", address=" + address + ", mobile_number=" + mobile_number + ", work_Location=" + work_Location
				+ ", joining_Date=" + joining_Date + "]";
	}
	
	
	

}
