package com.project.hrm.beanEmployee;

public class IHike {
	private String employeeId;
	private String employeeName;
	private int employeeBasicSalary;
	private int employeeNetSalary;
	private int employeeHikedSalary;

	public IHike() {
		super();

	}

	public String getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public int getEmployeeBasicSalary() {
		return employeeBasicSalary;
	}

	public void setEmployeeBasicSalary(int employeeBasicSalary) {
		this.employeeBasicSalary = employeeBasicSalary;
	}

	public int getEmployeeNetSalary() {
		return employeeNetSalary;
	}

	public void setEmployeeNetSalary(int employeeNetSalary) {
		this.employeeNetSalary = employeeNetSalary;
	}

	public int getEmployeeHikedSalary() {
		return employeeHikedSalary;
	}

	public void setEmployeeHikedSalary(int employeeHikedSalary) {
		this.employeeHikedSalary = employeeHikedSalary;
	}

	@Override
	public String toString() {
		return "Hike [employeeId=" + employeeId + ", employeeName=" + employeeName + ", employeeBasicSalary="
				+ employeeBasicSalary + ", employeeNetSalary=" + employeeNetSalary + ", employeeHikedSalary="
				+ employeeHikedSalary + "]";
	}

}
