package com.y4j.education.harini;

public class applicationmainemployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee harinibanala= new Employee("harini", "banala", "harini@gmail.com",  789543277, (byte)20,'f', 500000L );
		harinibanala.employeeDetails();
		Employee upendrachary= new Employee("upendra","chary","chary@gmail.com",687957897,(byte)26,'M',900000L );
         upendrachary.employeeDetails();
	}
}