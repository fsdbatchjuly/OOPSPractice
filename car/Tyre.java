package com.y4j.khaja.oops.car;

public class Tyre {
	String colour;
	int width;
	int height;
	float thickness;
	int price;
	String   Type;
	String  name;



	void startMoving(){
		System.out.println(this.name + " wheel is moving");
	}	
	void stopMoving(){
		System.out.println(this.name + " wheel is stop moving");
	}


	Tyre(String color, int width, int height, float thinckness, int price, String type, String name){
		this.colour = color;
		this.width = width;
		this.height = height;
		this.thickness = thinckness;
		this.price = price;
		this.Type = type;
		this.name = name;


}

	

	}


