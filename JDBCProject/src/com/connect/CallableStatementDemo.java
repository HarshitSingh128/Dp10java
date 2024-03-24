package com.connect;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;
import java.util.Scanner;

public class CallableStatementDemo {
	static Scanner sc = new Scanner(System.in);
	static Connection con = null;
	static CallableStatement cst = null;
	static ResultSet rs;

	CallableStatementDemo() throws ClassNotFoundException, SQLException {

		con = DNConnect.getConnect();
		System.out.println("Connection done");

	}

	public void show_Data() throws SQLException {
		cst = con.prepareCall("{call getStudentCourse()}");
		boolean b = cst.execute();
		if (b == true) {
			rs = cst.getResultSet();
			while (rs.next()) {
				System.out
						.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getString(3) + " " + rs.getString(10));
			}
		}

	}

	public void show_Data1() throws SQLException {
		System.out.println("Enter course id:");
		int cid = sc.nextInt();
		cst = con.prepareCall("{call getStudentCount(?,?,?)}");
		cst.setInt(1, cid);
		cst.registerOutParameter(2, Types.VARCHAR);
		cst.registerOutParameter(3, Types.INTEGER);
		cst.execute();
		System.out.println(cid + " " + cst.getString(2) + " " + cst.getInt(3));

	}
	public void show_Data2() throws SQLException {
		System.out.println("Enter course cname:");
	   String cname=sc.next();
	   cst=con.prepareCall("{call getStudentBycourse(?)}");
	   cst.setString(1, cname);
	   boolean b=cst.execute();
	   if(b==true) {
		   rs=cst.getResultSet();
		   while(rs.next()) {
			   System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getLong(4)+" "+rs.getString(5)+" "+rs.getString(6));
		   }
	   }
	   
	   
		
		
	}
	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		CallableStatementDemo c = new CallableStatementDemo();
		c.show_Data();
		System.out.println("====================================");
		c.show_Data1();
		System.out.println("************************************");
		c.show_Data2();

	}

}
