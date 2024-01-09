package com.project.hrm.IhrmDAO;

import java.sql.SQLException;
import java.util.List;

import com.project.hrm.beanEmployee.IAttendance;
import com.project.hrm.beanEmployee.IEmployee;
import com.project.hrm.beanEmployee.IHike;
import com.project.hrm.beanEmployee.ISalary;

public interface IhrmDAO {
	public Boolean AdminlogIn(String userName, String password) throws SQLException;

	public Boolean addEmployee(IEmployee employee) throws Exception;

	public IEmployee searchEmployee(String name) throws SQLException;

	public Boolean delete(String name) throws Exception;

	public List<IEmployee> getEmployees() throws Exception;

	public Boolean attendanceUpload(IAttendance attendance) throws Exception;

	public int calculatePerformance(int working_days_in_month, int employee_present_days);

	public IAttendance getEmployeeAttendance(String employee_id) throws Exception;

	public int calculateNetSalary(String employeeId) throws Exception;

	public Boolean updateSalary(ISalary salary) throws SQLException;

	public IEmployee searchEmployeeById(String id) throws SQLException;

	public ISalary getSalary(String employeeId) throws SQLException;

	public Boolean eligibleHike(String iD) throws SQLException;

	public IHike hikeHystory(String empId) throws SQLException;
}
