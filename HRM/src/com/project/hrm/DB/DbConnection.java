package com.project.hrm.DB;

import java.sql.Connection;
import java.sql.DriverManager;

public class DbConnection {
	
	private static final String DB_URL = "jdbc:mysql://localhost:3306/hrm";
	private static final String DB_UNAME = "root";
	private static final String DB_PSW = "sohaibkhan@1234";
	private static Connection con = null;

	public static Connection getConnection() {
		if (con == null) {
			return getConnection(DB_URL, DB_UNAME, DB_PSW);
		}
		return con;
	}

	private static Connection getConnection(String dbUrl, String dbUname, String dbPsw) {

		try {
			// load the driver.
			Class.forName("com.mysql.cj.jdbc.Driver");
			// Get DataBase connection
			con = DriverManager.getConnection(dbUrl, dbUname, dbPsw);

		} catch (Exception e) {
			e.printStackTrace();
		}

		return con;
	}


}
