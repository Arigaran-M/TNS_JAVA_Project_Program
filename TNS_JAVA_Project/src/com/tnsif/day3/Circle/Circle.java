package com.tnsif.day3.Circle;

import java.util.*;

public class Circle {
	private double radius;
	private String colour;
	
	public void setInput() {
		Scanner sn = new Scanner(System.in);
		System.out.println("Enter the Radius of the Circle: ");
		this.radius = sn.nextDouble();
		sn.nextLine();
		System.out.println("Enter the Colour of the Circle: ");
		this.colour = sn.nextLine();
		sn.close();
	}
	
	public void calcArea() {
		double area = Math.PI * radius * radius;
		System.out.println("The area of the Circle is: " + area);
	}
	
	public void getColour() {
		System.out.println("The Colour of the Circle is: " + this.colour);
	}
}
