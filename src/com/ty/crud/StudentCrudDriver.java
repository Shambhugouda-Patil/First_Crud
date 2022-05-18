package com.ty.crud;

public class StudentCrudDriver {

	public static void main(String[] args) {
			StudentCrud s=new StudentCrud();
			s.saveStudent(10,"vinod","vinod@123");
			s.deleteStudentById(9);

	}

}
