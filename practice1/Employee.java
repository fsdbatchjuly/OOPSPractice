package com.y4j.practice;

public class Employee extends CommonProperties{
	
	String CompanyName;
	int EmpNumber;
	long Salary;
		
    String getCompanyName () {
    	return CompanyName;
    }
    int gatEmpNumber () {
    	return EmpNumber;
    }
     long getSalary () {
    	 return Salary;
    	 
     }
    
     void getEmployeeDetails() {
   	  System.out.println("Company Name:" +" "+this.CompanyName);
   	  System.out.println("EmpNumber:" + " "+this.EmpNumber);
   	  System.out.println("Salary:" +" "+this.Salary);
}	
}    
    

