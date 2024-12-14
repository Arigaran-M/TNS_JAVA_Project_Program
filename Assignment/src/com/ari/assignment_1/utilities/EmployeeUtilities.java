package com.ari.assignment_1.utilities;
import com.ari.assignment_1.employees.Employee;

public class EmployeeUtilities {

	public static void displayEmployeeDetails(Employee employee) { 
		 /*
		  * It can be called without creating an instance/object of the class
		  * This Method  method can accept any object that is of type Employee or any of its subclasses, such as Manager or Developer.
		  */
		 System.out.println("Name: "+employee.getName());
		 System.out.println("Employee ID: "+employee.getEmployeeId());
		 System.out.println("Salary: Rs."+employee.getSalary());
	}
}
