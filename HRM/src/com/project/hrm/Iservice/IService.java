package com.project.hrm.Iservice;

import java.sql.SQLException;
import java.util.List;

import com.project.hrm.beanEmployee.IAttendance;
import com.project.hrm.beanEmployee.IEmployee;
import com.project.hrm.beanEmployee.IHike;
import com.project.hrm.beanEmployee.ISalary;

public interface IService {
	public Boolean login(String userName, String password) throws SQLException, Exception;

	public Boolean add(IEmployee employee) throws Exception;

	public IEmployee searchEmployeeByName(String name) throws Exception;

	public Boolean deleteEmployee(String name) throws Exception;

	public List<IEmployee> getAllEmployees() throws Exception;

	public Boolean addAttendance(IAttendance attendance) throws Exception;

	public int getPerformance(int working_days_in_month, int employee_present_days);

	public IAttendance getAttendance(String string) throws Exception;

	public int getEmployeeNetSalary(String employeeId) throws Exception;

	public Boolean employeeSalary(ISalary salary) throws SQLException;

	public ISalary getEmployeeSalaryDetails(String nextLine) throws SQLException;

	public Boolean hike(String ID) throws SQLException;

	public IHike employeeHikeHystory(String empId) throws SQLException;

}
