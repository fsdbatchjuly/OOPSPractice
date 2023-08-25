package com.y4j.oops.kranthi;

public class EmployeeDetails {
	
	String fName;
	String lName;
	String email;
	long phno;
	byte age;
	char gender;
	String subject;
	long salaryPerYear;
	
	EmployeeDetails(String fName, String lName, String email, long phno, byte age, char gender, String subject, long salaryPerYear){
		this.fName = fName;
		this.lName = lName;
		this.email = email;
		this.phno = phno;
		this.age = age;
		this.gender = gender;
		this.subject = subject;
		this.salaryPerYear = salaryPerYear;
	}
	
	String getfullName(String fName, String lName) {
		String fullName = fName +" "+lName;
		return fullName;
	}
	
	int getageinMonths(int age) {
		int ageinMonths = age * 12;
		return ageinMonths;
	}
	
	double calculateSalaryPerMonth(long salaryPerYear) {
		double SalaryPerMonth = (double)salaryPerYear / 12;
		return SalaryPerMonth;
	}
	
	
	
	void getEmployeeDetails() {
		
		System.out.println("Employee Details");
		System.out.println("Full Name of the faculty is: " +this.getfullName(this.fName, this.lName));
		System.out.println("Email of the faculty is: " +this.email);
		System.out.println("Age of the faculty in months is: " +this.getageinMonths(this.age));
		System.out.println("Gender of the faculty is: " +this.gender);
		System.out.println("Subject of the faculty is: " +this.subject);
		System.out.println("Salary of the faculty per month is: " +this.calculateSalaryPerMonth(this.salaryPerYear));
		System.out.println("Phone number of the faculty is: " +this.phno);
		System.out.println();
		
	}
	
	

}


