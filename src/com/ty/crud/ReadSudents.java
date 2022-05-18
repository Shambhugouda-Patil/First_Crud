package com.ty.crud;

import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class ReadSudents {
		Properties properties=new Properties();
		InputStream inputstream=new FileInputStream("mydbinfo.properties");
		properties.load(inputstream);
		String url=properties.getProperty("url");
		String driver=properties.getProperty("driver");
		Class.forName(driver);
		Connection con=DriverManager.getConnection(url);
		Statement st=con.createStatement();
		String sql="SELECT * FROM student";
		ResultSet rs=st.executeQuery(sql);
		while(rs.next())
		{
			int id=rs.getInt(1);
			String name=rs.getString(2);
			String email
		}
		
}

public void getStudent()
{
	Connection conn=helper.getConnectionObj();
	try
	{
		Statement stm=create.Statement();
		String sql="SELECT * FROM student";
		ResultSet rs=stm.executeQuery(sql);
		while(rs.next()) {
			int id=rs.getInt(1);
			String name=rs.getString(2);
			String email=rs.getNString(3);
			
			System.out.println("ID is:"+id);
			System.out.println("Name is:"+name);
			System.out.println("email is"+email);
			
			System.out.println("++++++++++++++++++");
		}
		con.close();
		}catch(SQLException e) {
			e.printStackTrace();
	}
}

void printStudentById(int id) {
	
}
