package employee;

/*
 * Jason Matthew Wiley
 * 12/14/2019
 * Employee Application
 * 
 * Create a class called Employee that includes three instance variables—a first name 
 * (type String), a last name (type String) and a monthly salary (double). Provide a 
 * constructor that initializes the three instance variables. Provide a set and a get 
 * method for each instance variable. If the monthly salary is not positive, do not set 
 * its value. Write a test app named EmployeeTest that demonstrates class Employee’s 
 * capabilities. Create two Employee objects and display each object’s yearly salary. 
 * Then give each Employee a 10% raise and display each Employee’s yearly salary again. 
 */

public class EmployeeTest 
{
	public static void main(String[] args) 
	{
		Employee employee = new Employee("Jason", "Wiley", 1580.96);
		Employee employee2 = new Employee("Mike", "Murphy", 1100.00);
		
		//print to user First Name: firstName employee
		System.out.printf("First Name: %s\n", employee.getFirstName());
		//print to user Last Name: lastName employee
		System.out.printf("Last Name: %s\n", employee.getLastName());
		//print to user Monthly Salary: monthlySalary employee
		System.out.printf("Monthly Salary: $%.02f\n", employee.getMonthlySalary());
		//print to user Monthly Salary with Raise of 10%: raise employee
		System.out.printf("Monthly Salary with Raise of 10%%: $%.02f\n\n", employee.getRaise(.10));
		
		//print to user First Name: firstName employee2
		System.out.printf("First Name: %s\n", employee2.getFirstName());
		//print to user Last Name: lastName employee2
		System.out.printf("Last Name: %s\n", employee2.getLastName());
		//print to user Monthly Salary: monthlySalary employee2
		System.out.printf("Monthly Salary: $%.02f\n", employee2.getMonthlySalary());
		//print to user Monthly Salary with Raise of 10%: raise employee2
		System.out.printf("Monthly Salary with Raise of 10%%: $%.02f", employee2.getRaise(.10));
	}
}