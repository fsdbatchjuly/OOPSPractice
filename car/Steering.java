package com.y4j.khaja.oops.car;

public class Steering {


		String name;
		String colour;
		boolean withpower;
		int angle;

		void  startAngle() {
			System.out.println(this.name + " steering is moving");
		}
		void  stopAngle() {
			System.out.println(this.name + " steering is stop");
		}	

		Steering(String name, String colour, boolean withpower, int angle){

			this.name = name;
			this.colour = colour;
			this.withpower = withpower;
			this .angle = angle;

	}

}
