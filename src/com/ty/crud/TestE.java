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

public class TestE {

	public static void main(String[] args) {
		Properties properties=new Properties();
	
		InputStream inputstream;
		try {
			inputstream = new FileInputStream("mydbinfo1.properties");
			properties.load(inputstream);
			
			String url=properties.getProperty("url");
			String driver=properties.getProperty("driver");
			
			Class.forName(driver);
			
			Connection connection=DriverManager.getConnection(url,properties);
			Statement statement=connection.createStatement();
			
			statement.execute("INSERT INTO student VALUES(7,'raghu','raghu@123')");
			
			connection.close();
			System.out.println("data inserted");
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}
	
}
