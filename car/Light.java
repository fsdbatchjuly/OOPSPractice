package com.y4j.khaja.oops.car;

public class Light {

	
		String name;
		 String colour;
		  int thickness;
		 int price;

		 void  switchOn() {
			 System.out.println(this.name+"  light is  switch on");
		 }
		 void  switchOff() {
			 System.out.println(this.name+"  light is  switch off");
		 }

		Light(String name,String colour,int thicknes,int price){
	     this.name = name;
	     this.colour = colour;
	     this.thickness = thickness;
	     this.price = price;

	}

}
