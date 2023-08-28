package com.y4j.practice;

public class CommonProperties {

	String firstname;
	String lastname;
	String Designation;
	int age;
	char gender;
	String email;
	String PhoneNumber;
	String address;
	
	void getFullDetails () {
		
	System.out.println("Full Information:  ");
	System.out.println(" ");
	System.out.println("Full Name:"+" "  +(this.firstname + " " +this.lastname));
	System.out.println("Designation:" +" " +this.Designation);
	System.out.println("Age:" + " "+this.age);
	System.out.println("Gender:" +" " +this.gender);
	System.out.println("Email:" +" "+this.email);
	System.out.println("Phone Number:" +" "+this.PhoneNumber);
	System.out.println("Address:" +" "+this.address);
	
}
}	
	

	


