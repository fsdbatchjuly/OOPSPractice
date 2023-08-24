package com.y4j.education.khaja;

public class ApplictionMain {
	
	public static void main(String[] args) {
		StudentDetails khaja = new StudentDetails("mohammed", "Khaja", "mohammeddkha3888ja@gmail.com", 9985312048L, (byte)27, 'M', 'B', 300000);
		StudentDetails mahesh = new StudentDetails("Venkat", "Mahesh", "mahesh.venkat222@gmail.com", 9704647127L, (byte)28, 'M', 'A', 100000);
		StudentDetails kranthi = new StudentDetails("Kranthi", "Kumar", "kranthikumar@gmail.com", 7381230942L, (byte)29, 'M', 'B', 200000);
		EmployeeDetails zunaira = new EmployeeDetails("zunaira", "tanveer", "zunairatanveer@gmail.com", 1234567890L, (byte)24, 'F', "Java", 1000000);
		
		khaja.getStudentDetails();
		mahesh.getStudentDetails();
		kranthi.getStudentDetails();
		zunaira.getEmployeeDetails();
		
		
	}

	}


