package org.student;

//import org.college.College;
//import org.department.Department;

public class Student extends org.department.Department {
	public void studentName() {
		System.out.println("Student name is Swathi");
	}

	public void studentDept() {
		System.out.println("Student department is Computer Science");
	}

	public void studentId() {
		System.out.println("Student id is 56321");

	}
	public static void main(String[] args) {
		System.out.println("Displaying from College class:");
		org.college.College cobj = new org.college.College();
		cobj.collegeName();
		cobj.collegeRank();
		cobj.collegeCode();
		
		System.out.println("Displaying from Department class:");
		org.department.Department dobj = new org.department.Department();
		dobj.deptName();
		dobj.collegeName();
		dobj.collegeCode();
		dobj.collegeRank();
		
		System.out.println("Displaying from Student class:");
		Student sobj = new Student();
		sobj.studentName();
		sobj.studentId();
		sobj.studentDept();
		sobj.deptName();
		sobj.collegeName();
		sobj.collegeCode();
		sobj.collegeRank();
		
			
		}
		
		
	}


