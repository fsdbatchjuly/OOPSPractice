package com.y4j.khaja.oops.car;

public class Seat {

	String colour;
	int  height; 
	int width;
    int  length;
    int  thickness;
    String material;
    String name;
    int price;

    void forwardFacingSeats() {
    	System.out.println(this.name+"  seat  is forward facing");
    }
    void  rearFacingseats() {
    	System.out.println(this.name+"  seat  is rear facing");
    }
    Seat( String colour,int height, int width, int length,int thickness,String material,  String name,int price){
    	this.colour  = colour;
      	this.height = height;
       	this.width = width;
       	this.length = length;
       	this.material = material;
       	this.thickness = thickness;
       	this.price = price;
       	this.name = name;

		
	}

}
