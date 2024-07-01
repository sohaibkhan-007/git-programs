package com.project.hrm.beanEmployee;

public class ISalary {
	private String employeeId;
	private String employeeName;
	private int employeeBasicSalary;
	private int employeeNetSalary;
	private int employeeSalaryId;
	private String hikeHystory;

	public ISalary() {
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


	public int getEmployeeSalaryId() {
		return employeeSalaryId;
	}

	public void setEmployeeSalaryId(int employeeSalaryId) {
		this.employeeSalaryId = employeeSalaryId;
	}

	public String getHikeHystory() {
		return hikeHystory;
	}

	public void setHikeHystory(String hikeHystory) {
		this.hikeHystory = hikeHystory;
	}

	@Override
	public String toString() {
		return "ISalary [employeeId=" + employeeId + ", employeeName=" + employeeName + ", employeeBasicSalary="
				+ employeeBasicSalary + ", employeeNetSalary=" + employeeNetSalary + ", employeeSalaryId="
				+ employeeSalaryId + ", hikeHystory=" + hikeHystory + "]";
	}
	
}
