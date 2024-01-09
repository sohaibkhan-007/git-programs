package com.project.hrm.hrmDAOImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.project.hrm.DB.DbConnection;
import com.project.hrm.IhrmDAO.IhrmDAO;
import com.project.hrm.beanEmployee.IAttendance;
import com.project.hrm.beanEmployee.IEmployee;
import com.project.hrm.beanEmployee.IHike;
import com.project.hrm.beanEmployee.ISalary;

import java.util.ArrayList;
import java.util.List;
//import com.project.hrm.controller.UUID;
import java.util.UUID;

public class HrmDAOImpl implements IhrmDAO {

	private String TABLE_NAME = null;
	private String sqlQuery = null;
	private PreparedStatement pstmt = null;
	private Integer rawAffected = null;
	private Boolean bool = false;
	private int performancePoints = 10;
	private IEmployee employee = null;
	private IAttendance attendance = null;
	private ISalary salary = null;
	private IHike hike = null;
	private UUID uuid = null;
	private ResultSet rs = null;
	int hikePoints = 0;
	int requiredHikePoints = 25;

	Connection con = null;

	public HrmDAOImpl() {
		super();
		con = DbConnection.getConnection();
	}

	@Override
	public Boolean AdminlogIn(String userName, String password) throws SQLException {
		TABLE_NAME = "admin";
		sqlQuery = " SELECT * FROM  admin WHERE userName = ? AND password = ?";

		pstmt = con.prepareStatement(sqlQuery);
		pstmt.setString(1, userName);
		pstmt.setString(2, password);

		ResultSet rs = pstmt.executeQuery();
		if (rs.next()) {
			if (userName.equals(rs.getString("userName")) && password.equals(rs.getString("password")))
				return true;
		}
		return false;
	}

	@Override
	public Boolean addEmployee(IEmployee employee) throws Exception {
		TABLE_NAME = "employee";
		boolean bool = false;
		if (employee.getId() == null) {
			sqlQuery = "INSERT INTO " + TABLE_NAME
					+ "(eid, ename, edepartment, egender, eaddress, emobile_number, ework_location)"
					+ " VALUES(?,?,?,?,?,?,?)";

			uuid = UUID.randomUUID();
			String uniqueId = uuid.toString();

			employee.setId(uniqueId);
			pstmt = con.prepareStatement(sqlQuery);
			pstmt.setString(1, employee.getId());	
		} else {
			sqlQuery = "UPDATE " + TABLE_NAME + " SET "
					+ "eid=?,ename=?, edepartment=?, egender=?, eaddress=?, emobile_number=?, ework_location=? WHERE eid=?";
			pstmt = con.prepareStatement(sqlQuery);
			pstmt.setString(1, employee.getId());
			pstmt.setString(8, employee.getId());
		}

		pstmt.setString(2, employee.getName());
		pstmt.setString(3, employee.getDepartment());
		pstmt.setString(4, employee.getGender());
		pstmt.setString(5, employee.getAddress());
		pstmt.setString(6, employee.getMobile_number());
		pstmt.setString(7, employee.getWork_Location());
		rawAffected = pstmt.executeUpdate();
		if (rawAffected != 0)
			bool = true;
		return bool;
	}

	@Override
	public IEmployee searchEmployee(String name) throws SQLException {
		TABLE_NAME = "employee";
		sqlQuery = "SELECT * FROM " + TABLE_NAME + " WHERE ename = ?";
		pstmt = con.prepareStatement(sqlQuery);
		pstmt.setString(1, name);
		ResultSet rs = pstmt.executeQuery();
		if (rs.next()) {
			employee = new IEmployee();
			employee.setId(rs.getString("eid"));
			employee.setName(rs.getString("ename"));
			employee.setDepartment(rs.getString("edepartment"));
			employee.setGender(rs.getString("egender"));
			employee.setAddress(rs.getString("eaddress"));
			employee.setMobile_number(rs.getString("emobile_number"));
			employee.setWork_Location(rs.getString("ework_location"));
			employee.setJoining_Date(rs.getString("ejoining_date"));
		}
		return employee;
	}

	public IEmployee searchEmployeeById(String id) throws SQLException {
		TABLE_NAME = "employee";
		sqlQuery = "SELECT * FROM " + TABLE_NAME + " WHERE eid = ?";
		pstmt = con.prepareStatement(sqlQuery);
		pstmt.setString(1, id);
		ResultSet rs = pstmt.executeQuery();
		if (rs.next()) {
			employee = new IEmployee();
			employee.setId(rs.getString("eid"));
			employee.setName(rs.getString("ename"));
			employee.setDepartment(rs.getString("edepartment"));
			employee.setGender(rs.getString("egender"));
			employee.setAddress(rs.getString("eaddress"));
			employee.setMobile_number(rs.getString("emobile_number"));
			employee.setWork_Location(rs.getString("ework_location"));
			employee.setJoining_Date(rs.getString("ejoining_date"));
		}
		return employee;
	}

	@Override
	public Boolean delete(String name) throws Exception {
		TABLE_NAME = "employee";
		sqlQuery = "Delete FROM " + TABLE_NAME + " WHERE ename = ?";
		pstmt = con.prepareStatement(sqlQuery);
		pstmt.setString(1, name);
		if (pstmt.executeUpdate() != 0) {
			bool = true;
		}
		return bool;
	}

	@Override
	public List<IEmployee> getEmployees() throws Exception {
		TABLE_NAME = "employee";
		sqlQuery = "SELECT * FROM " + TABLE_NAME;
		List<IEmployee> empList = new ArrayList<IEmployee>();
		pstmt = con.prepareStatement(sqlQuery);
		ResultSet rs = pstmt.executeQuery();
		while (rs.next()) {
			employee = new IEmployee();
			employee.setId(rs.getString("eid"));
			employee.setName(rs.getString("ename"));
			employee.setDepartment(rs.getString("edepartment"));
			employee.setGender(rs.getString("egender"));
			employee.setAddress(rs.getString("eaddress"));
			employee.setMobile_number(rs.getString("emobile_number"));
			employee.setWork_Location(rs.getString("ework_location"));
			employee.setJoining_Date(rs.getString("ejoining_date"));
			empList.add(employee);
		}
		return empList;
	}

	@Override
	public Boolean attendanceUpload(IAttendance attendance) throws Exception {
		TABLE_NAME = "attendance";
		sqlQuery = " INSERT INTO " + TABLE_NAME
				+ " (employee_id,days_in_month,working_days_in_month,employee_present_days,performance_points,attendance_month,paidSalary)"
				+ "Values(?,?,?,?,?,?,?)";
		pstmt = con.prepareStatement(sqlQuery);
		pstmt.setString(1, attendance.getEmployee_id());
		pstmt.setInt(2, attendance.getDays_in_month());
		pstmt.setInt(3, attendance.getWorking_days_in_month());
		pstmt.setInt(4, attendance.getEmployee_present_days());
		pstmt.setInt(5, attendance.getPerformance_points());
		pstmt.setString(6, attendance.getAttendance_month());
		pstmt.setInt(7, attendance.getPaidSalary());

		rawAffected = pstmt.executeUpdate();
		if (rawAffected != 0)
			bool = true;
		return bool;
	}

	@Override
	public int calculatePerformance(int working_days_in_month, int employee_present_days) {
		int performance = performancePoints - (working_days_in_month - employee_present_days);
		return performance;
	}

	@Override
	public IAttendance getEmployeeAttendance(String employee_id) throws Exception {
		TABLE_NAME = "attendance";
		sqlQuery = "SELECT * FROM " + TABLE_NAME + " WHERE employee_id = ?";
		pstmt = con.prepareStatement(sqlQuery);
		pstmt.setString(1, employee_id);
		ResultSet rs = pstmt.executeQuery();
		if (rs.next()) {
			attendance = new IAttendance();
			attendance.setAttendance_id(rs.getInt("attendance_id"));
			attendance.setEmployee_id(rs.getString("employee_id"));
			attendance.setDays_in_month(rs.getInt("days_in_month"));
			attendance.setWorking_days_in_month(rs.getInt("working_days_in_month"));
			attendance.setEmployee_present_days(rs.getInt("employee_present_days"));
			attendance.setAttendance_month(rs.getString("attendance_month"));
			attendance.setPerformance_points(rs.getInt("performance_points"));
			attendance.setPaidSalary(rs.getInt("paidSalary"));
		}
		return attendance;
	}

	@Override
	public int calculateNetSalary(String employeeId) throws Exception {
		attendance = getEmployeeAttendance(employeeId);
		int absentDays = attendance.getWorking_days_in_month() - attendance.getEmployee_present_days();
		int salaryOfOneDay = attendance.getPaidSalary() / attendance.getWorking_days_in_month();
		int netSalary = attendance.getPaidSalary() - (absentDays * salaryOfOneDay);
		return netSalary;
	}

	@Override
	public Boolean updateSalary(ISalary salary) throws SQLException {
		if (salary.getEmployeeName() == null) {
			employee = searchEmployeeById(salary.getEmployeeId());
			salary.setEmployeeName(employee.getName());
		}
		TABLE_NAME = "salary";
		sqlQuery = "INSERT INTO " + TABLE_NAME + "(employeeid,employeename,basic_salary,net_salary) values(?,?,?,?)";
		pstmt = con.prepareStatement(sqlQuery);
		pstmt.setString(1, salary.getEmployeeId());
		pstmt.setString(2, salary.getEmployeeName());
		pstmt.setInt(3, salary.getEmployeeBasicSalary());
		pstmt.setInt(4, salary.getEmployeeNetSalary());
		rawAffected = pstmt.executeUpdate();
		if (rawAffected != 0) {
			bool = true;
		}
		return bool;
	}

	@Override
	public ISalary getSalary(String employeeId) throws SQLException {
		TABLE_NAME = "salary";
		sqlQuery = "SELECT * FROM " + TABLE_NAME + " WHERE  employeeid = ?";
		pstmt = con.prepareStatement(sqlQuery);
		pstmt.setString(1, employeeId);
		rs = pstmt.executeQuery();
		ISalary salary = null;
		if (rs.next()) {
			salary = new ISalary();
			salary.setEmployeeSalaryId(rs.getInt("sid"));
			salary.setEmployeeId(rs.getString("employeeid"));
			salary.setEmployeeName(rs.getString("employeename"));
			salary.setEmployeeBasicSalary(rs.getInt("basic_salary"));
			salary.setEmployeeNetSalary(rs.getInt("net_salary"));
		}
		return salary;
	}

	@Override
	public Boolean eligibleHike(String Id) throws SQLException {
		salary = getSalary(Id);
		hike = new IHike();
		hike.setEmployeeId(Id);
		hike.setEmployeeName(salary.getEmployeeName());
		hike.setEmployeeBasicSalary(salary.getEmployeeBasicSalary());
		hike.setEmployeeNetSalary(salary.getEmployeeNetSalary());

		TABLE_NAME = "attendance";
		sqlQuery = "SELECT * FROM " + TABLE_NAME;
		pstmt = con.prepareStatement(sqlQuery);
		ResultSet rs = pstmt.executeQuery();
		while (rs.next()) {
			if (rs.getString(2).equals(Id)) {
				hikePoints += rs.getInt("performance_points");
			}
		}
		if (hikePoints >= requiredHikePoints) {
			hike.setEmployeeHikedSalary(hike.getEmployeeBasicSalary() + 5000);

		}

		TABLE_NAME = "hike";
		sqlQuery = " INSERT INTO " + TABLE_NAME
				+ " (employeeId,employeeName,employeeBasicSalary,employeeNetSalary,employeeHikedSalary)"
				+ "Values(?,?,?,?,?)";
		pstmt = con.prepareStatement(sqlQuery);
		pstmt.setString(1, hike.getEmployeeId());
		pstmt.setString(2, hike.getEmployeeName());
		pstmt.setInt(3, hike.getEmployeeBasicSalary());
		pstmt.setInt(4, hike.getEmployeeNetSalary());
		pstmt.setInt(5, hike.getEmployeeHikedSalary());
		rawAffected = pstmt.executeUpdate();
		if (rawAffected != 0)
			bool = true;
		return bool;
	}

	@Override
	public IHike hikeHystory(String empId) throws SQLException {
		TABLE_NAME = "hike";
		sqlQuery = "SELECT * FROM " + TABLE_NAME + " WHERE employeeId = ?";
		pstmt = con.prepareStatement(sqlQuery);
		pstmt.setString(1, empId);
		rs = pstmt.executeQuery();
		hike = new IHike();
		if (rs.next()) {
			hike.setEmployeeName(rs.getString("employeeName"));
			hike.setEmployeeId(rs.getString("employeeId"));
			hike.setEmployeeBasicSalary(rs.getInt("employeeBasicSalary"));
			hike.setEmployeeNetSalary(rs.getInt("employeeNetSalary"));
			hike.setEmployeeHikedSalary(rs.getInt("employeeHikedSalary"));
		}
		if (hike != null) {
			return hike;
		}
		return null;
	}

}
