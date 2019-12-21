package salary_calculator;

import java.util.Scanner;

/*
 * Jason Matthew Wiley
 * 12/19/2019
 * Salary Calculator Application
 * 
 * a) Read the problem statement.
 * b) Formulate the algorithm using pseudocode and top-down, stepwise refinement.
 * c) Write a Java program.
 * d) Test, debug and execute the Java program.
 * e) Process three complete sets of data.
 * 
 * Develop a Java application that determines the gross pay for each of three employees. The company 
 * pays straight time for the first 40 hours worked by each employee and time and a half for all 
 * hours worked in excess of 40. You’re given a list of the employees, their number of hours worked 
 * last week and their hourly rates. Your program should input this information for each employee, 
 * then determine and display the employee’s gross pay. Use class Scanner to input the data.
 */

public class SalaryCalculatorTest 
{
	public static void main(String[] args) 
	{
		//device used to get input from user
		Scanner input = new Scanner(System.in);
		
		//grossPay objects
		SalaryCalculator salaryCalculator1 = new SalaryCalculator();
		SalaryCalculator salaryCalculator2 = new SalaryCalculator();
		SalaryCalculator salaryCalculator3 = new SalaryCalculator();
		
		for (int counter = 1; counter <= 3; counter++) 
		{
			//print Employee Set
			System.out.printf("Employee Set %s", counter);
			System.out.println();
			for (int employee = 1; employee <= 3; employee++) 
			{
				System.out.println();
				String name = setName(input);
				double hoursWorked = setHoursWorked(input);
				
				while(hoursWorked < 0.0) 
				{
					hoursWorked = setHoursWorked(input);
				}
				
				double salary = setSalary(input);
				
				while(salary < 0.0) 
				{
					salary = setSalary(input);
				}
				
				setEmployeeValues(salaryCalculator1, salaryCalculator2, salaryCalculator3, employee, name, hoursWorked, salary);
				detemineEmployee(salaryCalculator1, salaryCalculator2, salaryCalculator3, employee);
			}
			System.out.println();
		}
	}
	private static void detemineEmployee(SalaryCalculator salaryCalculator1, SalaryCalculator salaryCalculator2, SalaryCalculator salaryCalculator3, int employee) 
	{
		switch (employee) 
		{
			case 1:
				getEmployeeValues(salaryCalculator1);
				break;
			case 2:
				getEmployeeValues(salaryCalculator2);
				break;
			case 3:
				getEmployeeValues(salaryCalculator3);
				break;
		}
	}
	private static void getEmployeeValues(SalaryCalculator salaryCalculator1)
	{
		//print Employee Name: name
		System.out.printf("\nEmployee Name: %s\n", salaryCalculator1.getName());
		//print Hours Worked: hoursWorked
		System.out.printf("Hours Worked: %.02f\n", salaryCalculator1.getHoursWorked());
		//print Overtime Worked: overtime
		System.out.printf("Overtime Worked: %.02f\n", salaryCalculator1.getOvertime());
		//print Salary: $salary
		System.out.printf("Salary: $%.02f\n", salaryCalculator1.getSalary());
		//print Gross Pay: $grossPay
		System.out.printf("Gross Pay: $%.02f\n", salaryCalculator1.getGrossPay());
	}
	private static void setEmployeeValues(SalaryCalculator salaryCalculator1, SalaryCalculator salaryCalculator2, SalaryCalculator salaryCalculator3, int employee, String name, double hoursWorked, double salary) 
	{
		switch (employee) 
		{
			case 1:
				salaryCalculator1.setName(name);
				salaryCalculator1.setHoursWorked(hoursWorked);
				salaryCalculator1.setSalary(salary);
				break;
			case 2:
				salaryCalculator2.setName(name);
				salaryCalculator2.setHoursWorked(hoursWorked);
				salaryCalculator2.setSalary(salary);
				break;
			case 3:
				salaryCalculator3.setName(name);
				salaryCalculator3.setHoursWorked(hoursWorked);
				salaryCalculator3.setSalary(salary);
				break;
		}
	}
	private static double setSalary(Scanner input) 
	{
		//print Enter Salary:
		System.out.print("Enter Salary: $");
		//get input from user and store in variable salary
		double salary = input.nextDouble();
		return salary;
	}
	private static double setHoursWorked(Scanner input) 
	{
		//print to user Enter Hours Worked:
		System.out.print("Enter Hours Worked: ");
		//get input from user and store in variable hoursWorked
		double hoursWorked = input.nextDouble();
		return hoursWorked;
	}
	private static String setName(Scanner input) 
	{
		//print Enter name:
		System.out.print("Enter Employee ID Name: ");
		//get input from user and store in variable name
		String name = input.next();
		return name;
	}
}