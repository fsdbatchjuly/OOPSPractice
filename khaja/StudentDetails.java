package com.y4j.education.khaja;

public class StudentDetails {

	
		String firstName;
		String lastName;
		String fullName;
		String email; 
		long phno;
		byte age;
		char gender;
		char section;
		long totalFees;
		
		StudentDetails(String firstName, String lastName, String email, long phno, byte age, char gender, char section, long totalFees){
			this.firstName = firstName;
			this.lastName = lastName;
			this.email = email;
			this.phno = phno;
			this.age = age;
			this.gender = gender;
			this.section = section;
			this.totalFees = totalFees;
		}
		 
		String getfullName(String firstName, String lastName) {
			
			   this.fullName = firstName + " " +lastName;
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
			
			System.out.println("Full Name of the student is: " +this.getfullName(this.firstName, this.lastName));
			System.out.println("Email of the student is: " +this.email);
			System.out.println("Phone number of the student is: " +this.phno);
			System.out.println("Age of the student in months is: " +this.getageinMonths(this.age));
			System.out.println("Gender of the student is: " +this.gender);
			System.out.println("Section of the student is: " +this.section);
			System.out.println("Fees paid per month is: " +this.calculateFeesPaidPerMonth(this.totalFees));
			System.out.println();
			
			
		}

	}
			
			
		

	
		

	