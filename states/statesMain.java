package com.y4j.oops.states;

public class statesMain {

	public static void main(String[] args) {
		String[]newstates = {"Telangana", "Kerala"," Andhrapradesh", "Tamilnadu","karnataka","Maharastra","Uttarpradesh","Delhi","madhyapradesh","mizoram"};
		long [] population = {7954389,76443,3456789,123456,567893,3456786,345689626,4567890,1653345,375433}; 
	    long []  area    =   {8543249,98765,345612,345689,2456782,75433326,21348905,56654975,213907,86547853};
	    String[] capital =  { "hyderabad","kochi","?","chennai","karnataka","Mumbai","Lucknow","DELHI","Bhopal","aizwal"};
	       
	       for(int i=0;i<10;i++) {
	    	   System.out.println( newstates[i] +" " + "is with area"+" " + area[i]+" " + "and population is" + population[i]+" " + "and it's capital"+" " + capital[i]);
	    	   System.out.println("\n");
		
	

	        }
	            States. displayStateInfo();

    }

}   

	        




