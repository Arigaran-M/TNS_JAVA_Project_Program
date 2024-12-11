package com.tnsif.abstractions;

public abstract class Shape {
	protected float area;
	
	abstract void calArea();
	
	void show() {
		System.out.println("Area of Shape is "+area);
	}
}