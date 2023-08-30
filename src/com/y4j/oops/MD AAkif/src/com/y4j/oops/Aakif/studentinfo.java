package com.y4j.oops.Aakif;

public class studentinfo {

	
		// TODO Auto-generated method stub
	 String fname;
     String lname;
     String email;
     String fullName;
     Long mobile;
     int age;
     char gender;
     char section;
     long totalFees;
 
	
       studentinfo(String fName, String lname, String email, long mobile, byte age, char gender, char section, long totalFees){
   		this.fname = fName;
   		this.lname = lname;
   		this.email = email;
   		this.mobile = mobile;
   		this.age = age;
   		this.gender = gender;
   		this.section = section;
   		this.totalFees = totalFees;
   		
   	}
   	 
   	String getfullName(String fname, String lname) {
   		
   		   this.fname = fname + " " +lname;
   		   return this.fullName;
   		  
   	      }
   	
   	int getageinMonths(int age) {
   		int ageinMonths = age * 12;
   		return ageinMonths;
   		
   	}
   	
   	float calculateFeesPaidPerMonth(long totalFees) {
   		float feesPerMonth = (float)totalFees / 12;
   		return feesPerMonth;
   	}
   	
   	void getStudentDetails() {
   		
   		System.out.println("Full Name of the student is: " +this.getfullName(this.fname, this.lname));
   		System.out.println("Email of the student is: " +this.email);
   		System.out.println("Phone number of the student is: " +this.mobile);
   		System.out.println("Age of the student in months is: " +this.getageinMonths(this.age));
   		System.out.println("Gender of the student is: " +this.gender);
   		System.out.println("Section of the student is: " +this.section);
   		System.out.println("Fees paid per month is: " +this.calculateFeesPaidPerMonth(this.totalFees));
   		System.out.println();
   		
   		
   	}

   }
