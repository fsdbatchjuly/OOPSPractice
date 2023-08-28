package com.y4j.kranthi.oops;

public class ApplicationMain {

	public static void main(String[] args) {
		
		Students kranthi = new Students();
		kranthi.FirstName ="saikranthi";
		kranthi.LastName = "kumar";
		kranthi.age = 28;
		kranthi.email = "vanamala.142@gmail.com";
		kranthi.PhoneNumber = 9676726211L;
		kranthi.RollNumber = 00042;
		kranthi.Section = "A";
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
		mahesh.RollNumber = 00041;
		mahesh.Section = "B";
		mahesh.ClassName = "java class";
		mahesh.Dob = 14061993;
	    mahesh.pincode = 500090;
	    mahesh.gender = 'M';
		mahesh.address = "Hyderabad";
		
		Students khaja = new Students();
		khaja.FirstName ="Mohammad";
		khaja.LastName = "khaja";
		khaja.age = 27;
		khaja.email = "khaja.142@gmail.com";
		khaja.PhoneNumber = 9743568915L;
		khaja.RollNumber = 00043;
		khaja.Section = "c";
		khaja.ClassName = "java class";
		khaja.Dob = 14061995;
		khaja.pincode = 500090;
		khaja.gender = 'M';
		khaja.address = "Hyderabad";
		
		Students  nagarjuna = new Students();
		nagarjuna.FirstName ="nagar";
		nagarjuna.LastName = "juna";
		nagarjuna.age = 33;
		nagarjuna.email = "nagarjuna.142@gmail.com";
		nagarjuna.PhoneNumber = 9654378937L;
		nagarjuna.RollNumber = 00040;
		nagarjuna.Section = "B";
		nagarjuna.ClassName = "java class";
		nagarjuna.Dob = 14061990;
	    nagarjuna.pincode = 500090;
		nagarjuna.gender = 'M';
		nagarjuna.address = "Hyderabad";
		
		Students tanweer = new Students();
		tanweer.FirstName ="tan";
		tanweer.LastName = "weer";
		tanweer.age = 31;
		tanweer.email = "tanweer.142@gmail.com";
	    tanweer.PhoneNumber = 7848768972L;
		tanweer.RollNumber = 00044;
		tanweer.Section = "C";
		tanweer.ClassName = "java class";
		tanweer.Dob = 14-06-1992;
		tanweer.pincode = 500090;
		tanweer.gender = 'M';
		tanweer.address = "Hyderabad";
		
		Teacher Dinesh = new Teacher();
		Dinesh.FirstName= "Dinesh";
		Dinesh.LastName = "kothuri";
		Dinesh.age =  33;
		Dinesh.email = "dinesh@gmail.com";
		Dinesh .PhoneNumber = 9875463465L;
		Dinesh.address = "Hyderabad";
		Dinesh.TeacherId = 12345;
		Dinesh.Designation = " java trainer";
		Dinesh. Subject = "Full Stack java";
		Dinesh.gender = 'M';
		Dinesh.salary =  500000;
		Dinesh.pincode = 500040;
		
		Teacher  Anil = new Teacher();
		Anil.FirstName= "Anil";
		Anil.LastName = "kumar";
		Anil.age =  31;
		Anil.email = "anil@gmail.com";
		Anil .PhoneNumber = 9567834256L;
		Anil.address = "Hyderabad";
		Anil.TeacherId = 123457;
		Anil.Designation = " java trainer";
		Anil. Subject = "Full Stack java";
	    Anil.gender = 'M';
		Anil.salary =  300000;
		Anil.pincode = 500040;
		
		employee sudheer = new employee();
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
		
		employee  bindu = new employee();
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
	
		
		kranthi.FullDetails();
		kranthi.getStudentDetails();
		
		System.out.println("\n");
        
        mahesh .FullDetails();
        mahesh.getStudentDetails();
        System.out.println("\n");
        
      khaja.FullDetails();
      khaja.getStudentDetails();
      
      System.out.println("\n");
      
      nagarjuna.FullDetails();
      nagarjuna.getStudentDetails();
      System.out.println("\n");
      
      tanweer.FullDetails();
       tanweer.getStudentDetails();
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
