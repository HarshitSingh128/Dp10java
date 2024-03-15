package com.connect;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class CourseCrud {
	static Connection con = null;
	Statement st;
	ResultSet rs;
	static Scanner sc = new Scanner(System.in);

	CourseCrud() {
		con = DNConnect.getConnect();
		System.out.println("Connection done..");
		try {
			st = con.createStatement();

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void fetchCourseDetails() {
		try {
			rs = st.executeQuery("select * from course");
			while (rs.next()) {
				System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getInt(3) + " " + rs.getFloat(4));
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	public void deleteCourse() {
		System.out.println("Enter the course id to be deleted:");
		int id = sc.nextInt();
		try {
			int noofRowsDeleted = st.executeUpdate("Delete from course where courseid =" + id);
			if (noofRowsDeleted > 0) {
				System.out.println("Course " + id + " is deleted..");
				fetchCourseDetails();
			} else {
				System.out.println("Error");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		CourseCrud obj = new CourseCrud();
		obj.fetchCourseDetails();
		obj.deleteCourse();

	}

}
