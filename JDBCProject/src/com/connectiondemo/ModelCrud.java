package com.connectiondemo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class ModelCrud {
	static Scanner sc = new Scanner(System.in);
	static Connection con = null;
	Statement st;
	ResultSet rs;
	PreparedStatement pst;

	ModelCrud() {
		con = Connect.getconnect();
		System.out.println("Connection done");
		try {
			st = con.createStatement();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void fetchModelDetails() {
		try {
			rs = st.executeQuery("select * from model");
			while (rs.next()) {
				System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getInt(3));
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void insertModel() {
		System.out.println("Enter model id:");
		int id = sc.nextInt();

		System.out.println("Enter the model name:");
		String mname = sc.next();

		System.out.println("Enter model cost");
		int cost = sc.nextInt();

		try {
			pst = con.prepareStatement("insert into model values(?,?,?)");
			pst.setInt(1, id);
			pst.setString(2, mname);
			pst.setInt(3, cost);

			int noOfRowsInserted = pst.executeUpdate();
			if (noOfRowsInserted > 0) {
				System.out.println("model added..");
				fetchModelDetails();
			} else {
				System.out.println("Error....");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public boolean searchModelById(int id) {
		boolean isFound = false;
		try {
			pst = con.prepareStatement("select * from model where model_id=?");
			pst.setInt(1, id);

			rs = pst.executeQuery();
			while (rs.next()) {
				isFound = true;
				System.out.println("Modelid:" + rs.getInt(1));
				System.out.println("ModelName:" + rs.getString(2));
				System.out.println("cost:" + rs.getInt(3));

			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return isFound;
	}

	public void updateModelbyId() {
		System.out.println("Enter the model id to be updated:");
		int id = sc.nextInt();
		if (searchModelById(id)) {
			System.out.println("---------------------");
			System.out.println("Enter the new cost:");
		int cost = sc.nextInt();

			try {
				pst = con.prepareStatement("update model set cost=? where model_id=?");
				pst.setInt(1, cost);
				pst.setInt(2, id);

				int noOfRowsUpdated = pst.executeUpdate();
				if (noOfRowsUpdated > 0) {
					System.out.println("model updated");
					searchModelById(id);
				} else {
					System.out.println("Error..");
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		} else {
			System.out.println("model not found....");
		}
	}

	public void deleteModel() {
		System.out.println("Enter the model id to be deleted:");
		int id = sc.nextInt();

		try {
			int noOfRowsDeleted = st.executeUpdate("delete from model where model_id=" + id);
			if (noOfRowsDeleted > 0) {
				System.out.println("Model " + id + " is deleted..");
				fetchModelDetails();
			} else {
				System.out.println("Error");
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		ModelCrud obj = new ModelCrud();
		int choice;
		char ch;

		do {
			System.out.println("=========================================================");
			System.out.println("1. Add new Model");
			System.out.println("2. Delete Model");
			System.out.println("3. Update Model Cost");
			System.out.println("4. Show all Model ");
			System.out.println("5. Search Model By id");
			System.out.println("6. Exit");

			System.out.println("Enter your choice:");
			System.out.println("---------------------------------------------------");

			choice = sc.nextInt();

			switch (choice) {
			case 1:
				obj.insertModel();
				break;
			case 2:
				obj.deleteModel();
				break;
			case 3:
				obj.updateModelbyId();
				break;
			case 4:
				obj.fetchModelDetails();
				break;
			case 5:
				System.out.println("Enter the Model id to be searched:");
				int id = sc.nextInt();
				if (!obj.searchModelById(id))
					System.out.println("Model not found....");
				break;
			case 6:
				System.out.println("------------Closing the Model application---------------");
				System.exit(0);
				break;

			default:
				System.out.println("Wrong input");
			}

			System.out.println("Do you want perform more operation please press y");
			ch = sc.next().charAt(0);

		} while (ch == 'y' || ch == 'Y');

	}
}
