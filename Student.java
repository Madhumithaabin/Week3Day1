package org.student;

import org.department.Department;

public class Student extends Department {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student stud = new Student();
		stud.collegeName();
		stud.collegeCode();
		stud.collegeRank();
		stud.deptName();
		stud.studentId();
		stud.studentName();
		stud.studentDept();
		 
	}

	public void studentName() {
		System.out.println("Student Name is : Jennifer");
	}

	public void studentDept() {
		System.out.println("Student Department is : Computer Science");
	}

	public void studentId() {
		System.out.println("Student Id is : 51792626");
	}

}
