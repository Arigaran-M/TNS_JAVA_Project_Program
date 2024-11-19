package com.tnsif.day4.RectanglePattern;

import java.util.Scanner;

public class RactanglePatternDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
	    System.out.println("Enter the number : ");
	    int num = sc.nextInt();
	    
	    new RactanglePattern(num);
	    
	    sc.close();
	}
}
