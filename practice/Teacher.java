package com.y4j.practice;

public class Teacher extends CommonProperties {
	
	String Subject;
	int NumberOfClassesPerDay;
		
	String getSubject () {
		return Subject;
	}
    int getNumberOfClassesPerDay () {
    	return NumberOfClassesPerDay;
    }
    String Designation () {
		return Designation;
	}
	
    void getTeacherDetails() {
       	  System.out.println("Subject:" +" "+this.Subject);
     	  System.out.println("Number Of Classes Per Day:" +" "+this.NumberOfClassesPerDay);
     	
  }	
}
