//Program to demonstrate Overloading - Compile Time Polymorphism
package com.tnsif.dayseven.overloading.v1;

public class ConstructorOverloadingDemo {

	public static void main(String[] args) {

		System.out.println("------------------------ Constructor Overloading -----------------------");

		Point p = new Point(); // default constructor invoked
		System.out.println(p);

		Point p1 = new Point(14.5f); // single parameter constructor
		System.out.println(p1);

		Point p2 = new Point(12.5f, 20.50f); // two parameters constructor
		System.out.println(p2);

	}
}