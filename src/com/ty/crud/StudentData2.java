package com.ty.crud;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class StudentData2 {
	
	MyHelper helper=new MyHelper();
	
	public void saveStudent(Student s)
	{
		System.out.println("student id:" + s.getId());
		System.out.println("student name"+s.getName());
		System.out.println("student email"+s.getEmail());

	}
	
	public List<Student>  getStudent()
	{
		String query="select * from Student";
		List<Student> list=new ArrayList();
		
		PreparedStatement preparedStatementt=connection.preparedStatement(query);
		ResultSet resultSet=PreparedStatement.executeQuery();
		
		try {
		
		} catch (SQLException e) {
			
			
			e.printStackTrace();
		}
		
		
		
	}

}
