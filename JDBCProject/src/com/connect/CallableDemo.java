package com.connect;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Types;
import java.util.Scanner;

public class CallableDemo {
	static Scanner sc = new Scanner(System.in);
	Connection con;
	Statement st;
	ResultSet rs;
	CallableStatement cst;

	CallableDemo() {
		con = DNConnect.getConnect();
		System.out.println("Connection done....");

		try {
			st = con.createStatement();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void getfacultysalary() {// function
		System.out.println("Enter faculty id:");
		int id = sc.nextInt();
		try {
			cst = con.prepareCall("{?=call facultyInfo(?)}");
			cst.registerOutParameter(1, Types.FLOAT);
			cst.setInt(2, id);

			cst.execute();
			System.out.println("salary is :" + cst.getFloat(1));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void getStudentByCourseProcedure() {
		System.out.println("Enter the Course Name");
		String name = sc.next();
		try {
			cst = con.prepareCall("{call  getStudentBycourse(?)}");
			cst.setString(1, name);
			boolean status = cst.execute();
			boolean isRecord = false;
			if (status) {
				rs = cst.getResultSet();
				while (rs.next()) {
					isRecord = true;
					System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getString(3) + " "
							+ rs.getLong(4) + " " + rs.getString(5) + " " + rs.getString(6));
				}
			}
			if (!isRecord) {
				System.out.println("No record found in this course");
			}
		} catch (SQLException e) {

			e.printStackTrace();
		}

	}

	public void studentCountProc() {
		System.out.println("Enter the course id:");
		int id = sc.nextInt();

		try {
			cst = con.prepareCall("{call getstudentcount(?,?,?)}");
			cst.setInt(1, id);
			cst.registerOutParameter(2, Types.VARCHAR);
			cst.registerOutParameter(3, Types.INTEGER);
			cst.execute();

			System.out.println("Course id:" + id);
			System.out.println("Course Name:" + cst.getString(2));
			System.out.println("Number od students:" + cst.getInt(3));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		CallableDemo c1 = new CallableDemo();
		// c1.getfacultysalary();
		// c1.getStudentByCourseProcedure();
		c1.studentCountProc();
	}

}
