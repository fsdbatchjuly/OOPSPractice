package com.y4j.education.mahesh;

public class ApplicationMain {
	
	public static void main(String[] args) {
		
		StudentDetails mahesh = new StudentDetails("Venkat", "Mahesh", "mahesh.venkat222@gmail.com", 9704647127L, (byte)30, 'M', 'A', 100000);
		StudentDetails kranthi = new StudentDetails("Kranthi", "Kumar", "kranthikumar@gmail.com", 7381230942L, (byte)28, 'M', 'B', 200000);
		StudentDetails khaja = new StudentDetails("mohammed", "Khaja", "mohdkhaja@gmail.com", 1234567890L, (byte)27, 'M', 'B', 300000);
		EmployeeDetails dinesh = new EmployeeDetails("Dinesh", "Kothuri", "dineshkothuri@gmail.com", 1234567890L, (byte)33, 'M', "Java", 1000000);
		mahesh.getStudentDetails();
		kranthi.getStudentDetails();
		khaja.getStudentDetails();
		dinesh.getEmployeeDetails();
		
	}

}
