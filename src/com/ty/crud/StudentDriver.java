package com.ty.crud;

public class StudentDriver {

	public static void main(String[] args) {
		StudentSave s=new StudentSave();
		StudentData sd=new StudentData();
		sd.setId(1);
		sd.setEmail("raja@123");
		sd.setAddress("bangalore");
		sd.setName("raja");
		
		s.saveStudent(sd);
	}

}
