package com.connectiondemo;

import java.sql.Connection;
import java.sql.DriverManager;

public class Connect {
	static Connection con=null;
	public static final String url="jdbc:mysql://localhost:3306/bike_showroom";
	public static final String user="root";
	public static final String pass="root";
	public static Connection getconnect() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			//System.out.println("Driver lodead");
			con=DriverManager.getConnection(url, user, pass);
			//System.out.println("Connection done");
		}catch(Exception e) {
			System.out.println(e);
		}
		
		return con;
		
	}

	public static void main(String[] args) {
		getconnect();
		

	}

}
