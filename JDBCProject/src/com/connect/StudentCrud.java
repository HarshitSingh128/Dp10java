package com.connect;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class StudentCrud {
	static Connection con=null;
	Statement st;
	ResultSet rs;
	
	StudentCrud(){
		con=DNConnect.getConnect();
		System.out.println("Connection Done");
		try {
			st=con.createStatement();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public void fetchStudentDetails() {
		try {
			rs=st.executeQuery("select * from student");
			while(rs.next()) {
				System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getLong(4)+" "+rs.getInt(5)+" "+rs.getString(6));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	public static void main(String[] args) {
		StudentCrud obj=new StudentCrud ();
		obj.fetchStudentDetails();
	

	}

}
