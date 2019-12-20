package sales_commission_calculator;

import java.util.Scanner;

/*
 * Jason Matthew Wiley
 * 12/20/2019
 * Sales Commission Calculator Application
 * 
 * a) Read the problem statement.
 * b) Formulate the algorithm using pseudocode and top-down, stepwise refinement.
 * c) Write a Java program.
 * d) Test, debug and execute the Java program.
 * e) Process three complete sets of data.
 * 
 * A large company pays its salespeople on a commission basis. The salespeople receive $200 per 
 * week plus 9% of their gross sales for that week. For example, a salesperson who sells $5,000 
 * worth of merchandise in a week receives $200 plus 9% of $5000, or a total of $650. You’ve been 
 * supplied with a list of the items sold by each salesperson. The values of these items are as 
 * follows: 
 * 
 * Item Value
 * 1 239.99
 * 2 129.75
 * 3 99.95
 * 4 350.89
 * 
 * Develop a Java application that inputs one salesperson’s items sold for last week and calculates 
 * and displays that salesperson’s earnings. There’s no limit to the number of items that can be 
 * sold.
 */

public class SalesCommissionCalculatorTest 
{
	public static void main(String[] args) 
	{
		
		//device used to get input from user
		Scanner input = new Scanner(System.in);
		
		//stored variables
		boolean isRunning = true;
		
		//salesman objects
		SalesCommissionCalculator salesCommissionCalculator1 = new SalesCommissionCalculator();
		SalesCommissionCalculator salesCommissionCalculator2 = new SalesCommissionCalculator();
		SalesCommissionCalculator salesCommissionCalculator3 = new SalesCommissionCalculator();
		
		for (int counter = 1; counter <= 3; counter++)
		{
			while (isRunning) 
			{
				int selection = getSelection(input, counter);
				
				while (selection < 1 && selection > 4 && selection != -1)
				{
					selection = getSelection(input, counter);
				}
				double product = setProductValue(selection);
				setSalesEarnings(salesCommissionCalculator1, salesCommissionCalculator2, counter, product);
				isRunning = applicationState(isRunning, selection);
			}
			isRunning = true;
			System.out.println();
			getSalesmanEarnings(salesCommissionCalculator1, salesCommissionCalculator2, salesCommissionCalculator3, counter);
			System.out.println();
		}
	}
	private static void getSalesmanEarnings(SalesCommissionCalculator salesCommissionCalculator1, SalesCommissionCalculator salesCommissionCalculator2, SalesCommissionCalculator salesCommissionCalculator3, int counter) 
	{
		switch (counter)
		{
			case 1:
				System.out.printf("Sales for salesman %s: $%.02f\n", counter, salesCommissionCalculator1.getTotalEarning(200, .09));
				break;
			case 2:
				System.out.printf("Sales for salesman %s: $%.02f\n", counter, salesCommissionCalculator2.getTotalEarning(200, .09));
				break;
			case 3:
				System.out.printf("Sales for salesman %s: $%.02f\n", counter, salesCommissionCalculator3.getTotalEarning(200, .09));
				break;
		}
	}
	private static boolean applicationState(boolean isRunning, int selection) 
	{
		if(selection == -1) 
		{
			isRunning = false;
		}
		return isRunning;
	}
	private static void setSalesEarnings(SalesCommissionCalculator salesCommissionCalculator1, SalesCommissionCalculator salesCommissionCalculator2, int counter, double product) 
	{
		switch (counter) 
		{
			case 1:
				salesCommissionCalculator1.setEarning(product);
				break;
			case 2:
				salesCommissionCalculator2.setEarning(product);
				break;
			case 3:
				salesCommissionCalculator2.setEarning(product);
				break;
		}
	}
	private static double setProductValue(int selection)
	{
		double product = 0.0;
		switch (selection) 
		{
			case 1:
				product = 239.99;
				break;
			case 2:
				product = 129.75;
				break;
			case 3:
				product = 99.95;
				break;
			case 4:
				product = 350.89;
				break;
		}
		return product;
	}
	private static int getSelection(Scanner input, int counter)
	{
		//print enter -1 to quit or a product 1 - 4 for salesman 1:
		System.out.printf("Enter -1 to quit or a product 1 - 4 for salesman %s: ", counter);
		//get input from user and store in variable selection
		int selection = input.nextInt();
		return selection;
	}
}