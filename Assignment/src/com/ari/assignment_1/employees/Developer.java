package com.ari.assignment_1.employees;

public class Developer extends Employee {

	private String programmingLanguage;
	
	public Developer() {
		
		System.out.println("-------------Enter The Developer Details-------------\n");
		
		System.out.print("Enter the Name: ");
		setName(sc.nextLine());
		
		System.out.print("Enter the Employee ID: ");
		setEmployeeId(sc.nextLong());
		
		System.out.print("Enter the Salary: Rs.");
		setSalary(sc.nextDouble());
		sc.nextLine();
		
		System.out.print("Enter the Programming Language: ");
		setProgrammingLanguage(sc.nextLine());
		System.out.println();
	}

	public String getProgrammingLanguage() {
		return programmingLanguage;
	}

	public void setProgrammingLanguage(String programmingLanguage) {
		this.programmingLanguage = programmingLanguage;
	}
	
}
