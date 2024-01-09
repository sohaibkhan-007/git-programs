package com.project.hrm.serviceIMPL;

import java.sql.SQLException;
import java.util.List;

import com.project.hrm.IhrmDAO.IhrmDAO;
import com.project.hrm.Iservice.IService;
import com.project.hrm.beanEmployee.IAttendance;
import com.project.hrm.beanEmployee.IEmployee;
import com.project.hrm.beanEmployee.IHike;
import com.project.hrm.beanEmployee.ISalary;
import com.project.hrm.hrmDAOImpl.HrmDAOImpl;

public class ServiceImpl implements IService {
	IhrmDAO HrmDAO = new HrmDAOImpl();
	private Boolean bool = false;
	IEmployee employee = null;
	ISalary salary = null;
	IHike hike = null;

	@Override
	public Boolean login(String userName, String password) throws Exception {
		bool = HrmDAO.AdminlogIn(userName, password);
		return bool;
	}

	public Boolean add(IEmployee employee) throws Exception {
		bool = HrmDAO.addEmployee(employee);
		return bool;

	}

	@Override
	public IEmployee searchEmployeeByName(String name) throws Exception {
		employee = HrmDAO.searchEmployee(name);
		return employee;
	}

	@Override
	public Boolean deleteEmployee(String name) throws Exception {
		bool = HrmDAO.delete(name);
		return bool;
	}

	@Override
	public List<IEmployee> getAllEmployees() throws Exception {
		return HrmDAO.getEmployees();

	}

	@Override
	public Boolean addAttendance(IAttendance attendance) throws Exception {
		bool = HrmDAO.attendanceUpload(attendance);
		return bool;

	}

	@Override
	public int getPerformance(int working_days_in_month, int employee_present_days) {

		return HrmDAO.calculatePerformance(working_days_in_month, employee_present_days);
	}

	@Override
	public IAttendance getAttendance(String Employee_id) throws Exception {

		return HrmDAO.getEmployeeAttendance(Employee_id);
	}

	@Override
	public int getEmployeeNetSalary(String employeeId) throws Exception {
		return HrmDAO.calculateNetSalary(employeeId);

	}

	@Override
	public Boolean employeeSalary(ISalary salary) throws SQLException {
		bool = HrmDAO.updateSalary(salary);
		return bool;

	}

	@Override
	public ISalary getEmployeeSalaryDetails(String employeeId) throws SQLException {
		return HrmDAO.getSalary(employeeId);

	}

	@Override
	public Boolean hike(String ID) throws SQLException {
		bool = HrmDAO.eligibleHike(ID);
		return bool;
	}

	@Override
	public IHike employeeHikeHystory(String empId) throws SQLException {
		return HrmDAO.hikeHystory(empId);
	}

}
