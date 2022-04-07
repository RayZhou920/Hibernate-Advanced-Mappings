package com.luv2code.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class TestJdbc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// update the skema name of the database
		String jdbcUr1 = "jdbc:mysql://localhost:3306/hb-01-one-to-one-uni?useSSL=false&serverTimezone=UTC";
		String user = "hbstudent";
		String pass = "hbstudent";
		
		try {
			System.out.println("Connecting to database: " + jdbcUr1);
			
			Connection myConn = DriverManager.getConnection(jdbcUr1, user, pass);
			System.out.println("Connection Successfully!!!");
		}
		catch (Exception exc) {
			exc.printStackTrace();
		}
	}

}
