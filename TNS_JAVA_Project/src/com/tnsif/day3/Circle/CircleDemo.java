package com.tnsif.day3.Circle;

/*
 Define a class Circle with the following data members:
 (i) Radius
 (ii) Colour
  
 Create these member methods for this class:
 (i) setInput() that accepts the details of the circle.
 (ii) calcArea that calculates the area of the circle using the radius and displays the same.
*/

public class CircleDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle circle = new Circle();
		circle.setInput();
		circle.calcArea();
		circle.getColour();
	}
}