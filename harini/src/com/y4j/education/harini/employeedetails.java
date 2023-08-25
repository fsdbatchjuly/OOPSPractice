package com.y4j.education.harini;

public class employeedetails {
	
	String fName;
	String lName;
	String email;
	long phno;
	byte age;
	char gender;
	String subjects;
	long salaryperyear;
	 
	 employeedetails (String fName,String lName,String email,long phno,byte age,char gender,String subjects,long salaryperyear){
	
	    this.fName=fName;
		this.lName=lName;
		this.email= email;
		this.phno=phno;
		this.age= age;
	    this.gender= gender;
		this.subjects= subjects;
		this.salaryperyear= salaryperyear;
}
    String getfullname(String fName,String lName) {
	 String fullname=fName + ""+lName;
	 return fullname;
    }
    
    int getageinmonths(int age) {
    	int ageinmonths =age * 12;
    	return ageinmonths;
    }
    
    double calculatesalarypermonth(long salaryperyear) {
    	double salarypermonth = (double)salaryperyear/12;
    	return salarypermonth;
    }
    
    void getemployeedetails() {
    	System.out.println("fullname:" +this.getfullname(this.fName, this.lName));
    	System.out.println("email:" +this.email);
    	System.out.println("ageinmonths:" +this.getageinmonths(this.age));
    	System.out.println("gender:" +this.gender);
    	System.out.println("studentsdetails the subjects:" +this.subjects);
    	System.out.println("salaryof the employeespermonths:" +this.calculatesalarypermonth(this.salaryperyear));
    }
    
    }
    