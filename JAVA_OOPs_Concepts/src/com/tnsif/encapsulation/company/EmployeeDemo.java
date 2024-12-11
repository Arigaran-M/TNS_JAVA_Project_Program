package com.tnsif.encapsulation.company;

public class EmployeeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1 = new Employee();
		Employee e2 = new Employee();
		Employee e3 = new Employee();
		Employee e4 = new Employee();
		
		e1.eid = 4005;
		e1.ename = "Arigaran";
		e1.city = "Villupuram";
		
		e2.eid = 4029;
		e2.ename = "Gnanajothi";
		e2.city = "Cudulore";
		
		e3.eid = 4039;
		e3.ename = "Hariramachandran";
		e3.city = "Coimbatore";
		
		System.out.println("Employee ID: "+e1.eid+"\nEmployee Name: "+e1.ename+"\nEmployee City: "+e1.city);
		System.out.println("\nEmployee ID: "+e2.eid+"\nEmployee Name: "+e2.ename+"\nEmployee City: "+e2.city);
		System.out.println("\nEmployee ID: "+e3.eid+"\nEmployee Name: "+e3.ename+"\nEmployee City: "+e3.city);
		System.out.println("\nEmployee ID: "+e4.eid+"\nEmployee Name: "+e4.ename+"\nEmployee City: "+e4.city);
		// int = 0, String = null, char = , Boolean = false
	}

}