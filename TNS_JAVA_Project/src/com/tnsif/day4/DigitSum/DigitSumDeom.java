package com.tnsif.day4.DigitSum;

import java.util.*;

public class DigitSumDeom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the Starting Number : ");
		int Start = sc.nextInt();
		System.out.print("Enter the Ending  Number : ");
		int End = sc.nextInt();
		System.out.print("Enter the Target Number : ");
		int Target = sc.nextInt();
		
		new DigitSum(Start, End, Target);
		
		sc.close();
	}
}
