package com.tnsif.abstractions;

public class Square extends Shape {
	private float side;
	
	public Square() {
		side = 2.0f;
	}
	
	public Square(float side) {
		this.side = side;
	}
	
	void calArea() {
		// TODO Auto-generated method stub
		super.area = side*side;
	}

}