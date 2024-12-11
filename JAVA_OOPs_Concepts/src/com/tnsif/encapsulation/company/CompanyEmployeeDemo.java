package com.tnsif.encapsulation.company;

public class CompanyEmployeeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CompanyEmployee e1 = new CompanyEmployee();
		CompanyEmployee e2 = new CompanyEmployee();
		CompanyEmployee e3 = new CompanyEmployee();

		e1.setEid(4005);
		e1.setEname("Arigaran");
		e1.setCity("Villupuram");
		
		e2.setEid(4029);
		e2.setEname("Gnanajothi");
		e2.setCity("Cudulore");
		
		e3.setEid(4039);
		e3.setEname("Hariramachandran");
		e3.setCity("Coimbatore");
		
		System.out.println("Employee ID: "+e1.getEid()+"\nEmployee Name: "+e1.getEname()+"\nEmployee City: "+e1.getCity());
		System.out.println("\nEmployee ID: "+e2.getEid()+"\nEmployee Name: "+e2.getEname()+"\nEmployee City: "+e2.getCity());
		System.out.println("\nEmployee ID: "+e3.getEid()+"\nEmployee Name: "+e3.getEname()+"\nEmployee City: "+e3.getCity());
	}

}