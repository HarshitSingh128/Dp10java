package com.connection;

import java.sql.Connection;
import java.sql.DriverManager;

public class Getconnection {
	static Connection com=null;
	public static Connection getconnect() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			//System.out.println("Driver is loded");
			com=DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb", "root", "root");
			//System.out.println("Connection is establish");
			
		}catch(Exception e) {
			System.out.println(e);
		}
		
		return com;
	}
	public static void main(String[] args) {
		getconnect();
		
	}

}
