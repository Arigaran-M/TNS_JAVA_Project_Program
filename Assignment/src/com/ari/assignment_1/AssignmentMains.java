package com.ari.assignment_1;
import com.ari.assignment_1.utilities.*;
import com.ari.assignment_1.employees.*;

public class AssignmentMains {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Manager manager = new Manager();
		Developer developer = new Developer();
		
		System.out.println("\n-------------------Manager Details-------------------\n");
		EmployeeUtilities.displayEmployeeDetails(manager);
		/*
		 * When displayEmployeeDetails(manager) is called:
		 *		- Manager is an instance of the Manager class.
		 *		- The Manager object is treated as an Employee because Manager is a subclass of Employee.
		 *		- Inside the method, the attributes of the Manager object (like name, employeeId, salary) are accessed via the getName(), getEmployeeId(), and getSalary() methods inherited from Employee.
		 */
        System.out.println("Department: " + manager.getDepartment());

        System.out.println("\n------------------Developer Details------------------\n");
        EmployeeUtilities.displayEmployeeDetails(developer);
        /*
         * When displayEmployeeDetails(developer) is called:
         *		- Similarly, the Developer object is passed as an argument.
         *		- The Developer object is also treated as an Employee due to inheritance.
         *		- The method accesses the Developer object’s attributes using the same Employee getter methods.
         */
        System.out.println("Programming Language: " + developer.getProgrammingLanguage());
		
	}
	/*
	-----------------------OUTPUT------------------------

	--------------Enter The Manager Details--------------

	Enter the Name: Arigaran M
	Enter the Employee ID: 421121104005
	Enter the Salary: Rs.1500000
	Enter the Department: Programming 

	-------------Enter The Developer Details-------------

	Enter the Name: Gnana Jothi R
	Enter the Employee ID: 421121104029
	Enter the Salary: Rs.600000
	Enter the Programming Language: Java


	-------------------Manager Details-------------------

	Name: Arigaran M
	Employee ID: 421121104005
	Salary: Rs.1500000.0
	Department: Programming 

	------------------Developer Details------------------

	Name: Gnana Jothi R
	Employee ID: 421121104029
	Salary: Rs.600000.0
	Programming Language: Java
	*/
}
