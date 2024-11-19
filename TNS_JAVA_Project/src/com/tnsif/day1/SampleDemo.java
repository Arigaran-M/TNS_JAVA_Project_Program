package com.tnsif.day1;

import java.util.*;

public class SampleDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,c;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the First Numer: ");
		a = sc.nextInt();
		System.out.print("Enter the Second NUmber: ");
		b = sc.nextInt();
		c = a+b;
		System.out.println("The Addition of "+a+" + "+b+" = "+c);
		
		sc.close();
	}

}
