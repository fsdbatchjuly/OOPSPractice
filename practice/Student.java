package com.y4j.practice;

public class Student extends CommonProperties {

	String ClassName;
	int StudentRollNumber;
	String SectionName;
	 
	String getClassName () {
		return ClassName;
	}
	int getStudentRollNumber() {
		return StudentRollNumber;
	}
	String getSectionName () {
		return SectionName;
		
	}
	void getStudentDetails() {
	  System.out.println("Class:" +" " +this.ClassName);
	  System.out.println("Roll Number:"+" " +this.StudentRollNumber);
	  System.out.println("Section:" +" "+this.SectionName);
	}
	public void FullDetails() {
		// TODO Auto-generated method stub
		
	}
}
 