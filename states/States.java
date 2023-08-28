package com.y4j.oops.states;

public class States {

	
		 static String StateName;
		 static long Population;
		 static long Area;
		 static String Capital;

		States(String StateName ,  long Population,  long Area , String Capital ){
	         this.StateName = "StateName";
	         this.Population = Population;
	         this.Area = Area;
	         this.Capital = "Capital";
		}

		static void displayStateInfo() {

			System.out.println("State is " + StateName + ", Its population is " + Population +", Its area is " + Area + " Sq..., and " + Capital + " is the capital.");
	
	}

}
