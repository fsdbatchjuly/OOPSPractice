package com.y4j.oops.Car;

public class Mirror {
	
	String name;
	String colour;
    int height;
    int width;
    int thickness;
    String material;
    
    void mirrorOpen() {
    	 System.out.println(this.name+"  mirror is  open");
	 }
    void mirrorClose() {
   	 System.out.println(this.name+"  mirror is  close");
	 }
    
    Mirror(String name,String colour,int height,int width, int thickness,String material){
    	this.name = name;
    	this.colour = colour;
    	this.height = height;
    	this.width = width;
    	this.thickness = thickness;
    	this.material = material;
    }
    }



