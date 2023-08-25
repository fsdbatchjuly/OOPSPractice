package com.y4j.oops.states;

public class StatesMain {

	

	

	public static void main(String[] args) {
		  

	       String[]newstates = {"Telangana", "Kerala"," Andhrapradesh", "Tamilnadu","karnataka","Maharastra","Uttarpradesh","Delhi","madhyapradesh","mizoram"};
	       long [] population = {3456721,4567893,3456789,123456,567893,3456786,34568962,4567890,1234567,34567890}; 
	       long []  area    =   {3456789,12345,345612,345689,2456782,5678932,2134890,564897,213907,43567890};
	       String[] capital =  { "hyderabad","kochi","?","chennai","karnataka","Mumbai","Lucknow","DELHI","Bhopal","aizwal"};
	        for(int i=0;i<10;i++) {
	        	System.out.println( newstates[i] +" " + "is with area"+" " + area[i]+" " + "and population is" + population[i]+" " + "and it's capital"+" " + capital[i]);
	        	System.out.println("\n");
	    		
	        }
	            States. displayStateInfo();
	            
	        }
	        }
	    
	

