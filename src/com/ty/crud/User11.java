package com.ty.crud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class User11 {

	public static void main(String[] args) {
		String url="jdbc:mysql://localhost:3306/javabatch";
		String userName="root";
		String password="root";
		
		String res= "DELETE FROM user WHERE id=5";
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver"); //class name along with pathname (fully qualified name)
			
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
