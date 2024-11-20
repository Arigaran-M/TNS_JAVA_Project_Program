package com.pvr.shopping;
import com.pvr.shopping.imp_ording.*;
import com.pvr.shopping.entity.Customer;
import com.pvr.shopping.interfacesample.Order;

public class ShoppingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer c1 = new Customer();
		c1.setCid(101);
		c1.setCname("Arigaran");
		c1.setCity("Villupuram");
		c1.setProduct("Computertools");
		
		Order order;
		String choice = c1.getProduct();
		if(choice.equals("Mobiletools")) {
			order = MobileTools.getMobiletools();
		}
		else {
			order = ComputerTools.getComputertools();
		}
		System.out.println(c1);
		order.ordering();
	}
}
