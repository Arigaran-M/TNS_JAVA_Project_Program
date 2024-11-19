package com.tnsif.day3.StudentDetials;

/*
 Write a java program to get all your details like your full name with initial, Roll number, Grade and Percentage.
 
 Sample Input:
 Aryan S
 5220365
 A
 9.5%
 
 Sample Output:
 Aryan S
 5220365
 A
 9.5%
*/

public class StudentDetialsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentDetials s1 = new StudentDetials();
		s1.setSname();
		s1.setSroll();
		s1.setSgrade();
		s1.setPercentage();
		System.out.println("\nThe Student Name: "+s1.getSname()+"\nThe Student Roll No.: "+s1.getSroll()+"\nThe Student Grade: "+s1.getSgrade()+"\nThe Student Presentage: "+s1.getPercentage()+"%");
		s1.Close();
	}

}