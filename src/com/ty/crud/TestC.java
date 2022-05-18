package com.ty.crud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;

public class TestC {

	public static void main(String[] args) {
		
		String url="jdbc:mysql://localhost:3306/javabatch?user=root&password=root";
		
		
		String sql = "INSERT INTO student VALUES(8,'sanjay','sanjay@123')";
		
		
		try {
			Driver d=new Driver();
			
			Connection con=DriverManager.getConnection(url);
			
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


