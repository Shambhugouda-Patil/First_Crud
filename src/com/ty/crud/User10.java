package com.ty.crud;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;

public class User10 {

	public static void main(String[] args) {
		String url="jdbc:mysql://localhost:3306/javabatch";
		String userName="root";
		String password="root";
		
		String sql = "INSERT INTO user VALUES(6,'shridhar','shri@123','shri123',67890)";
	
		try {
				Driver d=new Driver();
				DriverManager.registerDriver(d);
			
			Connection con=DriverManager.getConnection(url, userName, password);
			
			Statement stm=con.createStatement();
			
			stm.execute(sql);
			
			con.close();
			
			System.out.println("data inserted");
			
		}  catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


	}


