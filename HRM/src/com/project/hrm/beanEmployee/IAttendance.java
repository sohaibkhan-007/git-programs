package com.project.hrm.beanEmployee;

public class IAttendance {
	private int attendance_id;
	private String employee_id;
	private String attendance_month;
	private int days_in_month;
	private int working_days_in_month;
	private int employee_present_days;
	private int performance_points;
	private int paidSalary;

	public IAttendance() {
		super();

	}

	public int getAttendance_id() {
		return attendance_id;
	}

	public void setAttendance_id(int attendance_id) {
		this.attendance_id = attendance_id;
	}

	public String getEmployee_id() {
		return employee_id;
	}

	public void setEmployee_id(String employee_id) {
		this.employee_id = employee_id;
	}

	public String getAttendance_month() {
		return attendance_month;
	}

	public void setAttendance_month(String attendance_month) {
		this.attendance_month = attendance_month;
	}

	public int getDays_in_month() {
		return days_in_month;
	}

	public void setDays_in_month(int days_in_month) {
		this.days_in_month = days_in_month;
	}

	public int getWorking_days_in_month() {
		return working_days_in_month;
	}

	public void setWorking_days_in_month(int working_days_in_month) {
		this.working_days_in_month = working_days_in_month;
	}

	public int getEmployee_present_days() {
		return employee_present_days;
	}

	public void setEmployee_present_days(int employee_present_days) {
		this.employee_present_days = employee_present_days;
	}

	public int getPerformance_points() {
		return performance_points;
	}

	public void setPerformance_points(int performance_points) {
		this.performance_points = performance_points;
	}

	public int getPaidSalary() {
		return paidSalary;
	}

	public void setPaidSalary(int paidSalary) {
		this.paidSalary = paidSalary;
	}

	@Override
	public String toString() {
		return "IAttendance [attendance_id=" + attendance_id + ", employee_id=" + employee_id + ", attendance_month="
				+ attendance_month + ", days_in_month=" + days_in_month + ", working_days_in_month="
				+ working_days_in_month + ", employee_present_days=" + employee_present_days + ", performance_points="
				+ performance_points + "]";
	}

}
