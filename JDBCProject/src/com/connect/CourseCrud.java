package com.connect;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class CourseCrud {
	static Connection con = null;
	Statement st;
	ResultSet rs;
	PreparedStatement pst;
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
			
			e.printStackTrace();
		}
	}
public void insertcourse() {
	System.out.println("Enter course id:");
	int id=sc.nextInt();
	System.out.println("Enter course name:");
	String cname=sc.next();
	System.out.println("Enter duration(in months)");
	int dur=sc.nextInt();
	System.out.println("Enter fees");
	float fees=sc.nextFloat();
	try {
		pst=con.prepareStatement("insert into course values(?,?,?,?,?)");
		pst.setInt(1, id);
		pst.setString(2, cname);
		pst.setInt(3, dur);
		pst.setFloat(4, fees);
		pst.setInt(5, 0);
		
		int noofRowsInserted=pst.executeUpdate();
		if(noofRowsInserted>0) {
			System.out.println("Course Added:");
			fetchCourseDetails();
		}
		else {
			System.out.println("Error");
		}
	}catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
public boolean searchCourseById(int id) {
	boolean isFound=false;
	try {
		pst=con.prepareStatement("selelct * from course where courseid=?");
		pst.setInt(1, id);
		rs=pst.executeQuery();
		while(rs.next()){
			isFound=true;
			System.out.println("CourseId"+rs.getInt(1));
			System.out.println("cname"+rs.getString(2));
			System.out.println("cduration:"+rs.getInt(3));
			System.out.println("cfess"+rs.getFloat(4));
			System.out.println("scount"+rs.getInt(5));
		}
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return isFound;
}
public void updateCourseFess() {
	System.out.println("Enter the courseid to be update");
	int id=sc.nextInt();
	if(searchCourseById(id)) {
		System.out.println("-------------------");
		System.out.println("Enter the new fees:");
		float fees=sc.nextFloat();
		
		try {
			pst=con.prepareStatement("update course set fess=? where coursid=?");
			pst.setFloat(1, fees);
			pst.setInt(2, id);
			int noofRowsUpdated=pst.executeUpdate();
			if(noofRowsUpdated>0) {
				System.out.println("Course updated");
				searchCourseById(id);
			}
			else {
				System.out.println("Error");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	else {
		System.out.println("Class not found:");
	}
}
	public static void main(String[] args) {
		CourseCrud obj = new CourseCrud();
		obj.fetchCourseDetails();
//		obj.deleteCourse();
//		obj.insertcourse();
//		System.out.println("Enter the course id:");
//		int id=sc.nextInt();
//		if(!obj.searchCourseById(id)) {
//			System.out.println("Course not found:");
//			
//		}

	}

}
