package com.y4j.kranthi.oops;

public class CommonProperties {
	String FirstName;
	String LastName;
     int age;
	String email;
	String address;
	long PhoneNumber;
	int pincode;
	char gender;
	

 
	void FullDetails() {
		System.out.println("FullDetails ");
		System.out.println("Full Name:" +(this.FirstName+" " +this.LastName));
		System.out.println("AGE:" +this.age);
	    System.out.println("email is:" +this.email);
		System.out.println("address is:" +this.address);
		System.out.println("phone number:" +this.PhoneNumber);
		System.out.println("Pincode is:" +this.pincode);
		System.out.println("gender is:" +this.gender);
		
}
}