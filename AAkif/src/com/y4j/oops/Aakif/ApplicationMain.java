package com.y4j.oops.Aakif;

public class ApplicationMain {
	public static void main(String[] args) {
	studentinfo tabish = new studentinfo("khan", "tabish", "tabish2@gmail.com", 97604647127l, (byte)30, 'F', 'A', 300000);
	studentinfo kareem = new studentinfo("Kareem", "Khan", "kareem@gmail.com", 8781230942L, (byte)28, 'M', 'B', 400000);
	studentinfo raja = new studentinfo("md", "raja", "mdraja@gmail.com", 23334567890L, (byte)27, 'M', 'B', 500000);
	
	tabish.getStudentDetails();
	kareem.getStudentDetails();
	raja.getStudentDetails();
}
}