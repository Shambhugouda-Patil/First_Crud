package com.ty.crud;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class StudentCrudDynamic {
			
	MyHelper helper=new MyHelper();
	
	public void saveStudent(int id, String name, String email) {
		Connection connection=helper.getConnectionObj();
		String sql="INSERT INTO student VALUES(?,?,?)";
		
		try {
			PreparedStatement preparedStatement=connection.prepareStatement(sql);
			 preparedStatement.setInt(1, id);
			 preparedStatement.setString(2, name);
			 preparedStatement.setString(3,email);
			 
			 preparedStatement.execute();
			 connection.close();
			 System.out.println("data inserted");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void deleteStudent(int id)
	{
		Connection connection=helper.getConnectionObj();
		String sql="DELETE FROM student WHERE id=?";
		
		try {
			PreparedStatement preparedStatement=connection.prepareStatement(sql);
			 preparedStatement.setInt(1, id);
			 preparedStatement.execute();
			 connection.close();
			 System.out.println("data removed");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
		public void updateStudent(int id, String name, String email)
		{
			Connection connection=helper.getConnectionObj();

			String sql="UPDATE student SET name=?, email=? WHERE ID=?";
			try {
				PreparedStatement preparedStatement=connection.prepareStatement(sql);
				 preparedStatement.setString(1, name);
				 preparedStatement.setString(2, email);
				 preparedStatement.setInt(3,id);
				 
				 preparedStatement.execute();
				 connection.close();
				 System.out.println("data updated");
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		public void printStudentById(int id) {
			String sql="SELECT * FROM student WHERE id=?";
			Connection connection=helper.getConnectionObj();
			
			PreparedStatement preparedStatement;
			try {
				preparedStatement = connection.prepareStatement(sql);
				preparedStatement.setInt(1, id);
				ResultSet rs=preparedStatement.executeQuery(sql);
				while(rs.next()) {
					int rid=rs.getInt(1);
					String name=rs.getString(2);
					String email=rs.getNString(3);
					
					System.out.println("ID is "+ rid);
					System.out.println("Name is "+name);
					System.out.println("email is"+email);
					System.out.println("============");
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
	
}
