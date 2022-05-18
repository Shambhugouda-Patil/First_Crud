package com.ty.crud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Product11 {

	public static void main(String[] args) {
		String url="jdbc:mysql://localhost:3306/javabatch";
		String userName="root";
		String password="root";
		
		String res= "DELETE FROM product WHERE id=2";
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection con=DriverManager.getConnection(url, userName, password);
			
			Statement stm=con.createStatement();
			
           stm.execute(res);
			
			con.close();
			
			System.out.println("record deleted");
			
			
	} catch(ClassNotFoundException e) {
		e.printStackTrace();
	}catch(SQLException e) {
		e.printStackTrace();
	}
	}


		

	}


