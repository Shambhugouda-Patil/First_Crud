package com.ty.crud;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class StudentCrud {
	
	MyHelper helper=new MyHelper();
	public void saveStudent(int id, String name,String email)
	{
		
		
		try {
		     Connection con=helper.getConnectionObj();
			Statement stm=con.createStatement();
			
			String sql="INSERT INTO student values("+id+",'"+name+"','"+email+"')";
					
			stm.execute(sql);
			
			con.close();
			System.out.println("data saved");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	public void deleteStudentById(int id) {
		
		
		try {
			Connection con=helper.getConnectionObj();			
			Statement stm=con.createStatement();
			
			String sql="DELETE FROM student WHERE id="+id;
					
			stm.execute(sql);
			
			con.close();
			System.out.println("data deleted");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
