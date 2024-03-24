package com.connectiondemo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Customercrud {
	static Scanner sc=new Scanner(System.in);
	static Connection con = null;
	Statement st;
	ResultSet rs;
	PreparedStatement pst;
	Customercrud() {
		con = Connect.getconnect();
		System.out.println("Connection done");
		try {
			st = con.createStatement();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void fetchDetails() {
		try {
			rs=st.executeQuery("Select * from customer");
			while(rs.next()) {
				System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3));
						//" "+rs.getLong(4)+" "+rs.getString(5)+" "+rs.getString(6)+" "+rs.getString(7));
				//System.out.println(rs.getInt(1)+" "+rs.getInt(2)+" "+rs.getInt(3)+" "+rs.getDouble(4)+" "+rs.getInt(5)+ " "+rs.getDate(6)+" "+rs.getInt(7));
			}
		}catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public void insertcustomer() {
		System.out.println("Enter Customer id");
		int id=sc.nextInt();
		System.out.println("Enter Customer first Name:");
		String first=sc.next();
		System.out.println("Enter Customer Last Name");
		String last=sc.next();
		try {
			pst=con.prepareStatement("insert into customer values(?,?,?");
			pst.setInt(1, id);
			pst.setString(2, first);
			pst.setString(3, last);
			int noofRowsInserted=pst.executeUpdate();
			if(noofRowsInserted>0) {
				System.out.println("Course Added:");
				fetchDetails();
			}
			else {
				System.out.println("Error");
			}
		}catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	public static void main(String[] args) {
		Customercrud c1=new Customercrud();
		c1.fetchDetails();
		
		c1.insertcustomer();

	}

}
