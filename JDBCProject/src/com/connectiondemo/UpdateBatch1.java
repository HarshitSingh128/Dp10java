package com.connectiondemo;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdateBatch1 {
	void show_batches() throws SQLException, ClassNotFoundException
	{
	Connection con=Connect.getconnect();
	Statement st=con.createStatement();
	st.addBatch("Insert into model values(129,'Pulser',120000)");
	st.addBatch("insert into model values(130,'Activa',40000)");
	System.out.println("item added");
//	
//	st.addBatch("update model set cost=50000 where model_id=127");
//	st.addBatch("delete from model where model_id=127");
	int a[]=st.executeBatch();
	for(int i=0;i<a.length;i++)
	{
		System.out.println(i+" has affected");
	}
	
	}
	public static void main(String[] args) throws ClassNotFoundException, SQLException{
		UpdateBatch1 u=new UpdateBatch1();
		u.show_batches();

	}

}
