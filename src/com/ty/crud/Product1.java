package com.ty.crud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Product1 {

	public static void main(String[] args) {
		String url="jdbc:mysql://localhost:3306/javabatch";
		String userName="root";
		String password="root";
		
		String sql = "INSERT INTO product VALUES(5,'jio','reliance','4g',500)";
		
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection con=DriverManager.getConnection(url, userName, password);
			
			Statement stm=con.createStatement();
			
			stm.execute(sql);
			
			con.close();
			
			System.out.println("data inserted");
			
		}  catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



	}


