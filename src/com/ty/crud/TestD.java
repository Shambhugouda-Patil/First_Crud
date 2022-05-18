package com.ty.crud;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

import com.mysql.cj.jdbc.Driver;

public class TestD {

	public static void main(String[] args) {
      String url="jdbc:mysql://localhost:3306/javabatch";
		
		
		String sql = "INSERT INTO student VALUES(9,'hemanth','hemu@123')";
		
		
		try {
			Driver d=new Driver();
			DriverManager.registerDriver(d);
			
			Properties properties=new Properties();
			InputStream InputStream = new FileInputStream("mydbinfo.properties");
			properties.load(InputStream);
			Connection con=DriverManager.getConnection(url,properties);
			
			
			Statement stm=con.createStatement();
			
			stm.execute(sql);
			
			con.close();
			
			System.out.println("data inserted");
			
		}  catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


	}


