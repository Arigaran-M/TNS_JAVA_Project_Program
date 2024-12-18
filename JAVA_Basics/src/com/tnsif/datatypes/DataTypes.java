package com.tnsif.datatypes;

public class DataTypes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean booleanVar = true;          // Range of values - "true, false" and Size - 8 bits
		byte byteVar = 127; 				 // Range of Values - "-128 to 127" and Size - 8 bits
		short shortVar = 32767;              // Range of Values - "-32,768 to 32,767" and Size - 16 bits
		int intVar = 2147483647;             // Range of Values - "-2,147,483,648 to 2,147,483,647" and Size - 32 bits
		long longVar = 9223372036854775807L; // Range of Values - "-9,223,372,036,854,775,808 to 9,223,372,036,854,775,807" and Size - 64 bits
		float floatVar = 3.14f; 			 // Range of Values - "Upto 7 Decimal Digits" and Size - 32 bits
		double doubleVar = 1.23567d;		 // Range of Values - "Upto 16 Decimal Digits" and Size - 64 bits
		char charVar = 'A';					 // Range of Values - "Characters Representation of ASCII Values 0 to 255" and Size - 16 bits
		
		System.out.println("Boolean = " + booleanVar);
		System.out.println("Byte = " + byteVar);
		System.out.println("Short = " + shortVar);
		System.out.println("Integer = " + intVar);
		System.out.println("Long = " + longVar + "L");
		System.out.println("Float = " + floatVar + "f");
		System.out.println("Double = " + doubleVar + "d");
		System.out.println("Char = '" + charVar + "'");
	}
	
}
