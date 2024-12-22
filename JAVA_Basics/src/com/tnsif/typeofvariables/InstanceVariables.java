package com.tnsif.typeofvariables;

public class InstanceVariables {

	// Declared Instance Variable
	public String strVar;
	public int i;
	public Integer I;
	
	public InstanceVariables() {
		
		// Initializing Instance Variable
		this.strVar = "Ari";
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InstanceVariables name = new InstanceVariables(); // Object Creation
		
		System.out.println("Name is: " + name.strVar);
		System.out.println("Default Values for int is: " + name.i);
		System.out.println("Default Values for Integer is: " + name.I);
	}

}
