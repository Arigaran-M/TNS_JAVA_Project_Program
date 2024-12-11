package com.tnsif.encapsulation.customer;

public class CustomerDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer c1 = new Customer();
		Customer c2 = new Customer();
		Customer c3 = new Customer();
		Customer c4 = new Customer();
		Customer c5 = new Customer();
		
		c1.setCid (4001);
		c1.setCname ("Abu");
		c1.setAddress ("NO. 792, Pondy main road, Kandamangalam");
		c1.setCity ("Villupuram");
		
		c2.setCid (4004);
		c2.setCname ("Alwin");
		c2.setAddress ("NO. 1A, Pallavan Street, Vengateshwara Nagar, Vikravandi");
		c2.setCity ("Villupuram");
		
		c3.setCid (4005);
		c3.setCname ("Ari");
		c3.setAddress ("NO. 304, Bharathi Street, Periya Babu Samuthiram");
		c3.setCity ("Villupuram");
		
		c4.setCid (4029);
		c4.setCname ("Jothi");
		c4.setAddress ("NO. 30, Vellipillaiyar Koil Street, Sellangkuppam");
		c4.setCity ("Cuddalore");
		
		c5.setCid (4039);
		c5.setCname ("Hariram");
		c5.setAddress ("NO. B2, South potter street, Block-16");
		c5.setCity ("Neyveli");
		
		System.out.println("Customer ID: "+c1.getCid()+"\nCustomer Name: "+c1.getCname()+"\nCustomer Address: "+c1.getAddress()+"\nCustomer City: "+c1.getCity());
		System.out.println("\nCustomer ID: "+c2.getCid()+"\nCustomer Name: "+c2.getCname()+"\nCustomer Address: "+c2.getAddress()+"\nCustomer City: "+c2.getCity());
		System.out.println("\nCustomer ID: "+c3.getCid()+"\nCustomer Name: "+c3.getCname()+"\nCustomer Address: "+c3.getAddress()+"\nCustomer City: "+c3.getCity());
		System.out.println("\nCustomer ID: "+c4.getCid()+"\nCustomer Name: "+c4.getCname()+"\nCustomer Address: "+c4.getAddress()+"\nCustomer City: "+c4.getCity());
		System.out.println("\nCustomer ID: "+c5.getCid()+"\nCustomer Name: "+c5.getCname()+"\nCustomer Address: "+c5.getAddress()+"\nCustomer City: "+c5.getCity());
	}

}
