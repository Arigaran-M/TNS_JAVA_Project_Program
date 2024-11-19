package com.tnsif.day3.Commission;

public class Commission {
	String Name;
	String Address;
	long Phone;
	float Sales_amount;
	
	Commission (String name, String address, long phone, float sales_amount) {
		this.Name = name;
		this.Address = address;
		this.Phone = phone;
		this.Sales_amount = sales_amount;
	}
	
	public double calcualteCommission() {
		if (Sales_amount >= 100000) {
			System.out.println("Commission: 10%");
			return Sales_amount*0.10;
		}
		else if (Sales_amount >= 50000 && Sales_amount < 100000) {
			System.out.println("Commission: 5%");
			return Sales_amount*0.05;
			
		}
		else if (Sales_amount >= 30000 && Sales_amount < 50000) {
			System.out.println("Commission: 3%");
			return Sales_amount*0.03;
		}
		else {
			System.out.println("No Commission");
			return Sales_amount;
		}
	}
}
