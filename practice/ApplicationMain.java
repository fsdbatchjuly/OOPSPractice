package com.y4j.practice;

public class ApplicationMain {

	public static void main(String[] args) {
		
		Student deepa = new Student();
		deepa.firstname = "Deepa";
		deepa.lastname = "Rani";
		deepa.Designation = "Student";
		deepa.gender = 'F';
		deepa.ClassName = "Bsc";
		deepa.SectionName = "G";
		deepa.StudentRollNumber = 774;
		deepa.age = 22;
		deepa.email = "deepa@gmail.com";
		deepa.PhoneNumber = "9988770044";
		deepa.address = "Tirupati";		
		
		
		Student keerthi = new Student();
		keerthi.firstname = "Keerthi";
		keerthi.Designation = "Student";
		keerthi.lastname = "A";
		keerthi.gender = 'F';
		keerthi.ClassName = "Seventh";
		keerthi.SectionName = "A";
		keerthi.StudentRollNumber = 6;
		keerthi.age = 12;
		keerthi.email = "keerthi@gmail.com";
		keerthi.PhoneNumber = "9988770011";
		keerthi.address = "Kurnool";		
		
		Employee ravi = new Employee ();
		ravi.firstname = "Rivai";
		ravi.lastname = "Kumar";
		ravi.Designation = "Employee";
		ravi.gender = 'M';
		ravi.CompanyName = "Wipro";
		ravi.EmpNumber = 7703;
		ravi.age = 32;
		ravi.Salary = 500500;
		ravi.PhoneNumber = "7766554400";
		ravi.email = "ravi@gmail.com";
		ravi.address = "Hyderabad";
		
		Employee uday = new Employee ();
		uday.firstname = "Uday";
		uday.lastname = "Kiran";
		uday.Designation = "Employee";
		uday.gender = 'M';
		uday.CompanyName = "Wipro";
		uday.EmpNumber = 77024;
		uday.age = 30;
		uday.Salary = 500000;
		uday.PhoneNumber = "7766554411";
		uday.email = "uday@gmail.com";
		uday.address = "Goa";
		
		Teacher chandra = new Teacher ();
		chandra.firstname = "Chandra";
		chandra.lastname = "Shekhar";
		chandra.Designation = "Teacher";
		chandra.gender = 'M';
		chandra.age = 40;
		chandra.Subject = "Maths";
		chandra.NumberOfClassesPerDay = 2;
		chandra.PhoneNumber = "6600550044";
		chandra.email = "chadra@email.com";
		chandra.address = "Vizag";
		
		Teacher kumari = new Teacher ();
		kumari.firstname = "Kumari";
		kumari.lastname = "Radha";
		kumari.Designation = "Teacher";
		kumari.gender = 'F';
		kumari.age = 36;
		kumari.Subject = "Science";
		kumari.NumberOfClassesPerDay = 4;
		kumari.PhoneNumber = "6600550011";
		kumari.email = "kumari@email.com";
		kumari.address = "Vizag";		
	
		
	
	        deepa.getFullDetails();
	        deepa.getStudentDetails();
	        
	        System.out.println("\n");
	        
	        keerthi.getFullDetails();
	        keerthi.getStudentDetails();
	        
	        System.out.println("\n");
	        
	        ravi.getFullDetails();
	        ravi.getEmployeeDetails();
	        
	        System.out.println("\n");
	        
	        uday.getFullDetails();
	        uday.getEmployeeDetails();
	        
            System.out.println("\n");
	        
	        chandra.getFullDetails();
	        chandra.getTeacherDetails();
	            
            System.out.println("\n");
	        
	        kumari.getFullDetails();
	        kumari.getTeacherDetails();
	        
	}
}
	        
	        
	        
	        
	        


		
		
		
		
		

	


