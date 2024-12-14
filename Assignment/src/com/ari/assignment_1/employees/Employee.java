package com.ari.assignment_1.employees;
import java.util.Scanner;
public class Employee {

	private String name;
	private long employeeId;
	private double salary;
	Scanner sc = new Scanner(System.in);
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public long getEmployeeId() {
		return employeeId;
	}
	
	public void setEmployeeId(long employeeId) {
		this.employeeId = employeeId;
	}
	
	public double getSalary() {
		return salary;
	}
	
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
}
