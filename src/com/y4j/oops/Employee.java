package com.salary;

public class Employee {

	     String fName;
		 String lName;
		 String FullName;
		 String Email;
		 long Mobile;
		 String Subject;
		 char Gender;
		 byte Age;
		 long Salary;	
		

		Employee(String fName,String lName, String Email,  long Mobile, byte Age,  char Gender, String Subject, long Salary){
				this.fName = fName;
				this.lName = lName;
				this.Email = Email;
				this.Age = Age;
				this.Subject = Subject;
			    this.Gender = Gender;
				this.Mobile = Mobile;
				this.Salary = Salary;

		}

		 String getFullName(String fName,String lName) {
			String FullName = fName + " "+lName;
		    return FullName;
		 }		
		 int getageInMonths(int Age ) {
			 int ageInMonths = Age * 12;
			 return ageInMonths;
		 }		 
			
		float calculateSalaryPerMonth(long Salary) {
			float SalaryPerMonth = (float)Salary / 12;
			return SalaryPerMonth;
		}
		
		void employeeDetails() {
			System.out.println("Employee Details:");
			System.out.println("Full Name:" +this.getFullName(this.fName, this.lName));
			System.out.println("Age in Months:" +this.getageInMonths(this.Age));		
		    System.out.println("Gender:" +this.Gender);
			System.out.println("Email:" +this.Email);		
			System.out.println("Phone Number;" +this.Mobile);	
			System.out.println("Subject;" +this.Subject);
			System.out.println("Salary Per Month:" +this.calculateSalaryPerMonth(this.Salary));
			
		}
	}
		

		

	

