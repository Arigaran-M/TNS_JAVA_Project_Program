package com.tnsif.day3.Commission;

/*
 Create a default constructor in the class Student that prints a message "Student object is created" when the program is run.
 Define a class Commission described as follows:
 
 Data Members: Name, Address, Phone, Sales_amount
 
 Member methods:
 (i) To accept details of the sales employee
 (ii) To calculate the commission as follows: Sales_amount >= 100000, commission = 10%; 
 	  50000 <= Sales_amount < 100000, commission = 5%; 30000 <= Sales_amount < 50000, commission = 3%;
 	  Sales_amount < 30000, no commission.
 	  
 Write the main method to create an object of a class and call the above member method.
*/

import java.util.*;

public class CommissionDemo {

	public static void main(String[] args) {
		
		new Student();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Name of the Sales Employee: ");
		String name = sc.nextLine();
		System.out.println("Enter the Address of the Sales Employee: ");
		String address = sc.nextLine();
		System.out.println("Enter the Phone Number of the Sales Employee: ");
		long phone = sc.nextLong();
		System.out.println("Enter the Sales Amount: ");
		float sales_amount = sc.nextFloat();
		
		Commission commission = new Commission(name, address, phone, sales_amount);
		
		System.out.println("\nSales Employee Details:");
		System.out.println("Name: " + name);
		System.out.println("Address: " + address);
		System.out.println("Phone: " + phone);
		System.out.println("Sales Amount: " + sales_amount);
		System.out.println("Commission: " +commission.calcualteCommission());
		
		sc.close();
	}
}
