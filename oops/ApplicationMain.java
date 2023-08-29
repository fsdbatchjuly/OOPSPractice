package com.y4j.khaja.oops;

public class ApplicationMain {

	public static void main(String[] args) {
		
		Students khaja = new Students();
		
		khaja.FirstName ="Mohammed";
		khaja.LastName = "khaja";
		khaja.age = 27;
		khaja.email = "khaja.142@gmail.com";
		khaja.PhoneNumber = 9985312048L;
		khaja.RollNumber = 401;
		khaja.Section = "A";
		khaja.ClassName = "java class";
		khaja.Dob = 29011996;
		khaja.pincode = 500090;
		khaja.gender = 'M';
		khaja.address = "Hyderabad";
		
		Students kranthi = new Students();
		
		kranthi.FirstName ="saikranthi";
		kranthi.LastName = "kumar";
		kranthi.age = 28;
		kranthi.email = "vanamala.142@gmail.com";
		kranthi.PhoneNumber = 9676726211L;
		kranthi.RollNumber = 402;
		kranthi.Section = "B";
		kranthi.ClassName = "java class";
		kranthi.Dob = 14061994;
		kranthi.pincode = 500090;
		kranthi.gender = 'M';
		kranthi.address = "Hyderabad";
		
		Students mahesh = new Students();
																
		mahesh.FirstName ="venkat";
		mahesh.LastName = "mahesh";
		mahesh.age = 29;
		mahesh.email = "mahesh.142@gmail.com";
		mahesh.PhoneNumber = 9876726256L;
		mahesh.RollNumber = 403;
		mahesh.Section = "C";
		mahesh.ClassName = "java class";
		mahesh.Dob = 14061993;
	    mahesh.pincode = 500090;
	    mahesh.gender = 'M';
		mahesh.address = "Hyderabad";
		
		Teachers Dinesh = new Teachers();
		
		Dinesh.FirstName= "Dinesh";
		Dinesh.LastName = "kothuri";
		Dinesh.age =  49;
		Dinesh.email = "dinesh@gmail.com";
		Dinesh .PhoneNumber = 9875463143L;
		Dinesh.address = "Hyderabad";
		Dinesh.TeacherId = 12345;
		Dinesh.Designation = " java trainer";
		Dinesh. Subject = "Full Stack java";
		Dinesh.gender = 'M';
		Dinesh.salary =  500000;
		Dinesh.pincode = 500040;

		Teachers Anil = new Teachers();
		
		Anil.FirstName= "Anil";
		Anil.LastName = "kumar";
		Anil.age =  31;
		Anil.email = "anil@gmail.com";
		Anil .PhoneNumber = 9567834379L;
		Anil.address = "Hyderabad";
		Anil.TeacherId = 123457;
		Anil.Designation = " java trainer";
		Anil. Subject = "Full Stack java";
	    Anil.gender = 'M';
		Anil.salary =  300000;
		Anil.pincode = 500040;

		Employee sudheer = new Employee();
		
		sudheer.FirstName = "sud";
		sudheer.LastName = "heer";
		sudheer.age =  40;
		sudheer.email = "sudheer@gmail.com";
		sudheer.EmployeeId = 245678;
		sudheer.InsituteName = "youth for jobs";
		sudheer.Designation = "project executive";
		sudheer.PhoneNumber = 8754676545L;
		sudheer.Salary = 40000;
		sudheer.gender =  'M';
		sudheer.address = "Hyderabad";
		sudheer.pincode =500030;

		Employee  bindu = new Employee();
		
		bindu.FirstName = "bin";
		bindu.LastName = "du";
		bindu.age =  45;
		bindu.email = "bindu@gmail.com";
		bindu.EmployeeId = 24567867;
		bindu.InsituteName = "youth for jobs";
		bindu.Designation = " executive";
		bindu.PhoneNumber = 8754532679L;
		bindu.Salary = 20000;
		bindu.gender =  'F';
		bindu.address = "Hyderabad";
		bindu.pincode =500030;
		
		
		  	khaja.FullDetails();
		  	
		  		khaja.getStudentDetails();

		  			System.out.println("\n");

		
		
		  	kranthi.FullDetails();
		  	
		  		kranthi.getStudentDetails();

		  			System.out.println("\n");
		  			
			
		    mahesh .FullDetails();
		    
	        	mahesh.getStudentDetails();
	        	
	        		System.out.println("\n");
	        		
	        
	        Dinesh.FullDetails();
	        
	        	Dinesh.getTeacherDETAILS();
	        		
	        		System.out.println("\n");
	        		

	        Anil.FullDetails();
	        
	        	Anil.getTeacherDETAILS();
	        	
	        		System.out.println("\n");

	        sudheer.FullDetails();
	        
	        	sudheer.getEmpolyeeDETAILS();
	        	
	        		System.out.println("\n");
	        		

	        bindu.FullDetails();
	        
	        	bindu.getEmpolyeeDETAILS();
	      
	}

}
