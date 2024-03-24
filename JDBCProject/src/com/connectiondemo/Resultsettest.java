package com.connectiondemo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Resultsettest {
	static Scanner sc = new Scanner(System.in);
	static Connection con = null;
	Statement st;
	ResultSet rs;
	PreparedStatement pst;

	Resultsettest() {
		con = Connect.getconnect();
		System.out.println("Connection done");
		try {
			st = con.createStatement();
		} catch (SQLException e) {

			e.printStackTrace();
		}
	}
	void forward() throws SQLException{
		st=con.createStatement();
		rs=st.executeQuery("select * from model");
		while(rs.next()) {
			System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getDouble(3));
		}
	}
	void backword() throws SQLException{
		System.out.println("===========Backword========");
		st=con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
		rs=st.executeQuery("select * from model");
		rs.afterLast();
		while(rs.previous()) {
			System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getDouble(3));
		}
	}
	void getThirdRow()  throws SQLException{
		System.out.println("======Third=====");
		System.out.println("------Backword------");
		st=con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
		rs=st.executeQuery("select * from model");
		rs.absolute(3);
		System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getDouble(3));
		System.out.println("----LastRow-------");
		rs.absolute(-1);
		System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getDouble(3));
		System.out.println("-----second last rows----");
		rs.absolute(-2);
		System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getDouble(3));
		
	}
	void delete(int id) throws SQLException{
		System.out.println("Delete 126 row ----");
		st=con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
		rs=st.executeQuery("select * from model");
		rs.beforeFirst();
		while(rs.next()) {
			if(rs.getInt(1)==id) {
				rs.deleteRow();
			}
		}
	}
	void update(int id) throws SQLException
	{
		System.out.println("-----Update row----");
		 st=con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
		 rs=st.executeQuery("select * from model");
		 System.out.println("Enter new cost");
		 double cost=sc.nextInt();
		rs.beforeFirst();
		while(rs.next()) {
			if(rs.getInt(1)==id)
			{
				rs.updateDouble(3, cost);
				
			}
			rs.updateRow();
		}
		
		System.out.println("Uddate sucessfully");
	}
	void insert() throws SQLException
	{
		System.out.println("-----Update row----");
		 st=con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
		 rs=st.executeQuery("select * from model");
		 rs.moveToInsertRow();
		 rs.updateInt(1, 128);
		 rs.updateString(2, "pulsor");
		 rs.updateDouble(3 ,56000);
		 rs.insertRow();
		
	}
	

	public static void main(String[] args)throws SQLException, ClassNotFoundException {
		Resultsettest r1 = new Resultsettest();
		//r1.forward();
		//r1.backword();
		//r1.getThirdRow();
		//r1.delete(126);
		r1.update(127);
		//r1.insert();
		

	}

}
