package com.y4j.oops.dinesh;

public class Student {
	String name; 
	String email; 
	int age; 
	long phoneNumber;
	int subjectMarks[];
	
	
	
	Student(String name, String email, int age, long phoneNumber, int subjectMarks[]){
		this.name = name;
		this.email = email;
		this.age = age;
		this.phoneNumber = phoneNumber;
		this.subjectMarks = subjectMarks;
	}
	Student(String name){
		this.name = name;
	}
	
	 void studentDetails() {
		System.out.println("Student Details");
		System.out.println("Name :" + this.name);
		System.out.println("Email :" + this.email);
		System.out.println("Age :" + this.age);
		System.out.println("Phone Number :" + this.phoneNumber);
				
		float totalMarks = 600;
		int totalMarksGained = 0;
		
		for(int i = 0; i<subjectMarks.length; i++) {
			totalMarksGained = totalMarksGained + subjectMarks[i];
		}
		
		float percentage = (totalMarksGained/totalMarks) * 100;
		System.out.println("Total Marks Gained :" + totalMarksGained);
		System.out.println("Total Percentage Gained :" + percentage);
		
		System.out.println("\n\n");
		
	}
	
}
