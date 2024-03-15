package com.connect;

import java.sql.Connection;
import java.sql.DriverManager;

public class DNConnect {
	
	static Connection con=null;
	public static Connection getConnect() {
		try {
			//Load the driver
			//we dont know the class
			//load without creating the instance
			//creates auto
			Class.forName("com.mysql.cj.jdbc.Driver");
			//System.out.println("Driver id loaded:");
			
			//create connection
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/studentdb", "root", "root");
			//System.out.println("Connection establish:");
			
		}
		catch(Exception e) {
			System.out.println(e);
		}
		
		return con;
	}

	public static void main(String[] args) {
		getConnect();
	}
}
