package com.ty.crud;

public class StudentCrudDriver2 {
	public static void main(String[] args) {
		StudentCrudDynamic s=new StudentCrudDynamic();
		s.saveStudent(11," vikas", "vikas@123");
		s.deleteStudent(11);
		s.updateStudent(7,"rocky","rocky@123");
		s.printStudentById(7);
	}

}
