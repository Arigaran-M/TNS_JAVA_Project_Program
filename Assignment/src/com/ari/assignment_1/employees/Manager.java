package com.ari.assignment_1.employees;

public class Manager extends Employee {

	private String department;
	
	public Manager() {
		
		System.out.println("--------------Enter The Manager Details--------------\n");
		
		System.out.print("Enter the Name: ");
		setName(sc.nextLine());
		
		System.out.print("Enter the Employee ID: ");
		setEmployeeId(sc.nextLong());
		
		System.out.print("Enter the Salary: Rs.");
		setSalary(sc.nextDouble());
		sc.nextLine();
		
		System.out.print("Enter the Department: ");
		setDepartment(sc.nextLine());
		System.out.println();
	}
	
	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}
	
}
