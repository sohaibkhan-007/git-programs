package com.project.hrm.controller;

import java.util.Scanner;

import com.project.hrm.IhrmDAO.IhrmDAO;
import com.project.hrm.Iservice.IService;
import com.project.hrm.beanEmployee.IAttendance;
import com.project.hrm.beanEmployee.IEmployee;
import com.project.hrm.beanEmployee.ISalary;
import com.project.hrm.hrmDAOImpl.HrmDAOImpl;
import com.project.hrm.serviceIMPL.ServiceImpl;

public class Controller1 {
	Scanner sc = new Scanner(System.in);
	IEmployee employee = null;
	IAttendance attendance = null;
	IhrmDAO hrmDAO = new HrmDAOImpl();
	String name = null;
	String id = null;
	IService service = new ServiceImpl();
	ISalary salary = null;
	Boolean bool = false;

	public Controller1() {
		super();

	}

	public IEmployee createEmploye(Integer choice) throws Exception {

		if (choice == 1) {

			employee = new IEmployee();
		}
		if (choice == 3) {
			System.out.println("Enter Employee Name for updation:");
			employee = service.searchEmployeeByName(sc.nextLine());
			System.out.println(employee);
			if (employee != null) {
				id = employee.getId();
				employee = new IEmployee();
				employee.setId(id);
			}
		}
		System.out.println("Enter Employee Name");
		employee.setName(sc.nextLine());

		System.out.println("Enter Employee Department");
		employee.setDepartment(sc.nextLine());

		System.out.println("Enter Employee Gender");
		System.out.println("M:[male] ,F:[female]");

		employee.setGender(sc.nextLine().charAt(0) + "");

		System.out.println("Enter Employee Address ");
		employee.setAddress(sc.nextLine());

		System.out.println("Enter Employee Mobile_number");
		employee.setMobile_number(sc.nextLine());

		System.out.println("Enter Employee work_Location");
		employee.setWork_Location(sc.nextLine());

		return employee;

	}

	public IAttendance addAttendanceAndSalary() {
		attendance = new IAttendance();
		System.out.println("Enter Employee-ID:");
		attendance.setEmployee_id(sc.nextLine());

		System.out.println("Enter Attendance month:");
		attendance.setAttendance_month(sc.nextLine());

		System.out.println("Enter Day's in month:");
		attendance.setDays_in_month(sc.nextInt());

		System.out.println("Enter working Day's in month:");
		attendance.setWorking_days_in_month(sc.nextInt());

		System.out.println("Enter Employee Present Day's in month:");
		attendance.setEmployee_present_days(sc.nextInt());

		System.out.println("Enter Employee Paid_Salary:");
		attendance.setPaidSalary(sc.nextInt());

		attendance.setPerformance_points(
				service.getPerformance(attendance.getWorking_days_in_month(), +attendance.getEmployee_present_days()));

		return attendance;
	}

	public IAttendance showAttendance() throws Exception {
		System.out.println("Enter Employee Id:");
		return service.getAttendance(sc.nextLine());
	}

	public void employeeSalary(Integer choice) throws Exception {
		if (choice == 1) {
			salary = new ISalary();
			System.out.println("Enter Employee-ID:");
			salary.setEmployeeId(sc.nextLine());
			attendance = service.getAttendance(salary.getEmployeeId());
			salary.setEmployeeBasicSalary(attendance.getPaidSalary());
			salary.setEmployeeNetSalary(service.getEmployeeNetSalary(salary.getEmployeeId()));
			{
				if (service.employeeSalary(salary)) {
					System.out.println("Salary uploded successfully..");
				} else {
					System.out.println("Something went wrong..");

				}
				return;
			}
		} else if (choice == 2) {
			System.out.println("Enter Employee-ID:");
			salary = service.getEmployeeSalaryDetails(sc.nextLine());
			if (salary != null) {
				System.out.println(salary);
			}
		 else
			System.out.println("Invalid input...");
			return;
		}
	}
}
