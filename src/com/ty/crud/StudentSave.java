package com.ty.crud;

public class StudentSave {
	public void saveStudent(StudentData s) {
		System.out.println("student id : "+ s.getId());
		System.out.println(("student name : "+ s.getName()));
		System.out.println(("student email : "+ s.getEmail()));
		System.out.println(("student address : "+ s.getAddress()));
		
	}

}
