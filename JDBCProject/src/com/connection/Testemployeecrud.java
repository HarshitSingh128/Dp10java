package com.connection;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Testemployeecrud {
	static Connection com=null;
	Statement st;
	ResultSet rs;
	
	Testemployeecrud(){
		com=Getconnection.getconnect();
		System.out.println("Connection done");
		try {
			st=com.createStatement();
		}catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public  void employeecrud() {
		try {
			rs=st.executeQuery("select * from departments");
			
			while(rs.next()) {
				System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3)+" "+rs.getInt(4));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	public static void main(String[] args) {
		Testemployeecrud t1=new Testemployeecrud();
		t1.employeecrud();

	}

}
