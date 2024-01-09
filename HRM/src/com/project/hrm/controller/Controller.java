package com.project.hrm.controller;

import java.util.List;
import java.util.Scanner;

import com.project.hrm.Iservice.IService;
import com.project.hrm.beanEmployee.IAttendance;
import com.project.hrm.beanEmployee.IEmployee;
import com.project.hrm.beanEmployee.IHike;
//import com.project.hrm.beanEmployee.ISalary;
import com.project.hrm.serviceIMPL.ServiceImpl;

public class Controller {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		IService service = new ServiceImpl();
		Controller1 controller = new Controller1();
//		ISalary salary = new ISalary();
		IEmployee employee = null;
		IAttendance attendance = null;
		String userName = null;
		String password = null;
		String name = null;
		IHike hike = null;

		Boolean trans = true;
		Integer choice = null;

		System.out.println("--------Welcome To Human Resource Management---------");
		System.out.println("-------------------------------------------------------");
		System.out.println("Enter User Name.");
		userName = sc.nextLine();
		System.out.println("Enter Password.");
		password = sc.nextLine();

		if (service.login(userName, password)) {
			System.out.println("login succesful");
			System.out.println(" ");
			System.out.println(" ");

			do {
				System.out.println("1:Add Employee.");
				System.out.println("2:Search Employee.");
				System.out.println("3:Update Employee.");
				System.out.println("4:Delete Employee.");
				System.out.println("5:Show Employee.");
				System.out.println("6:Add Attendance/Performance.");
				System.out.println("7:Show Attendance.");
				System.out.println("8:Salary Information.");
				System.out.println("9:Employee Hike.");
				System.out.println("10:Hike History.");
				System.out.println("11:logout.");
				System.out.println("Enter Your Choice.");
				choice = sc.nextInt();
				sc.nextLine();
				switch (choice) {
				case 1: {
					employee = controller.createEmploye(choice);
					if (service.add(employee))
						System.out.println("Employee added succesfully");
					else
						System.out.println("Something went wrong!..");
					break;
				}
				case 2: {
					System.out.println("Enter Employee Name:");
					name = sc.nextLine();
					employee = service.searchEmployeeByName(name);
					System.out.println(employee);
					break;
				}
				case 3: {
					employee = controller.createEmploye(choice);
					if (service.add(employee))
						System.out.println("Employe details updated successfully");
					else {

						System.out.println("Something went wrong..");
					}
					break;
				}
				case 4: {
					System.out.println("Enter Employee name ");
					if (service.deleteEmployee(sc.nextLine()))
						System.out.println("Employee deleted succsefully...");
					else {
						System.out.println("Invalid Employee name...");
					}
					break;
				}
				case 5: {
					List<IEmployee> list = service.getAllEmployees();
					for (IEmployee empl : list) {
						System.out.println(empl);
					}
					break;
				}
				case 6: {
					attendance = controller.addAttendanceAndSalary();
					if (service.addAttendance(attendance)) {
						System.out.println("Attendance uploded successfully.");
					} else {
						System.out.println("Attendance Could'nt Uploded!");
					}
					break;
				}
				case 7: {
					attendance = controller.showAttendance();
					System.out.println(attendance);
					break;
				}
				case 8: {
					System.out.println("1:Add Employee salary Details.");
					System.out.println("2:Get Employee salary Details.");
					System.out.println("Enter Your Choice.");
					choice = sc.nextInt();
					controller.employeeSalary(choice);
					break;
				}
				case 9: {
					System.out.println("Enter Employee-Id to give hike.");
					if (service.hike(sc.nextLine()))
						System.out.println("Employee hike given.");
					else
						System.out.println("this employee already get hike.");
					break;

				}
				case 10: {
					System.out.println("Enter employee-Id to for its Hike Hystory:");
					hike = service.employeeHikeHystory(sc.nextLine());
					if (hike != null) {
						System.out.println(hike);
					} else {
						System.out.println(" Employee-id Does'nt got hike");
					}
					break;

				}
				case 11: {
					System.out.println("Logout Succesful");
					trans = false;
					break;
				}

				default:
					throw new IllegalArgumentException("Unexpected value: " + choice);
				}

			} while (trans);
		} else {
			System.out.println("Invalid Credentials!");

		}
		sc.close();

	}

}
