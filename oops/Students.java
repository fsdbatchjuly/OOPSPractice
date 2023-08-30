package com.y4j.khaja.oops;

public class Students extends Commonproperties{

	
		int RollNumber;
		String Section;
		long Dob;
		String ClassName;


		int getRollNumber() {

			return RollNumber;
		}
		String  getSection() {

			return Section;
		}
		long getDob() {

			return Dob;
		}
		String  getClassName() {

			return ClassName;
		}


	 void  getStudentDetails() {

			System.out.println("Roll number IS:" +(this.RollNumber));
			System.out.println(  " Section is:" + (this.Section));
		    System.out.println("Date of Birth is:" +(this.Dob));
			System.out.println("Class Name is:" +(this.ClassName));

	}

}
