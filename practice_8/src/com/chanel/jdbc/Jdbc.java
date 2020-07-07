package com.chanel.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class Jdbc {

	public static void main(String[] args) {

		String jdbcUrl = 
				"jdbc:mysql://localhost:3306/employees_db?useJDBCCompliantTimezoneShift=true&useSSL=false&serverTimezone=UTC";
		String user = "employee";
		String pass = "employee";
		try {
			
		System.out.println("Connecting to employee DB: " + jdbcUrl);
		
		Connection myConn = 
				DriverManager.getConnection(jdbcUrl,user,pass);
			
		System.out.println("Connection Succesfull!!!");
		}catch(Exception exc) {
			exc.printStackTrace();
		}
	}

}
