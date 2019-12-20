package credit_limit_calculator;

import java.util.Scanner;

/*
 * Jason Matthew Wiley
 * 12/19/2019
 * Credit Limit Calculator Application
 * 
 * a) Read the problem statement.
 * b) Formulate the algorithm using pseudocode and top-down, stepwise refinement.
 * c) Write a Java program.
 * d) Test, debug and execute the Java program.
 * e) Process three complete sets of data.
 * 
 * Develop a Java application that determines whether any of several department-store 
 * customers has exceeded the credit limit on a charge account. For each customer, the 
 * following facts are available:
 * 
 * a) account number
 * b) balance at the beginning of the month
 * c) total of all items charged by the customer this month
 * d) total of all credits applied to the customer’s account this month
 * e) allowed credit limit.
 * 
 * The program should input all these facts as integers, calculate the new balance 
 * (= beginning balance + charges – credits), display the new balance and determine 
 * whether the new balance exceeds the customer’s credit limit. For those customers 
 * whose credit limit is exceeded, the program should display the message "Credit limit 
 * exceeded".
 */

public class CreditLimitCalculatorTest 
{
	public static void main(String[] args) 
	{
		//device used to get user input
		Scanner input = new Scanner(System.in);
		
		//account objects
		CreditLimitCalculator creditLimitCalculator1 = new CreditLimitCalculator(1, 500, 1000);
		CreditLimitCalculator creditLimitCalculator2 = new CreditLimitCalculator(2, 50, 100);
		CreditLimitCalculator creditLimitCalculator3 = new CreditLimitCalculator(3, 20, 5000);
		
		//stored variables
		boolean isRunning = true;
		
		for(int counter = 1; counter <= 3; counter++) 
		{
			while (isRunning) 
			{
				int charge = 0;
				int credit = setCredit(input, counter);
				
				while (credit < 0 && credit != -1) 
				{
					credit = setCredit(input, counter);
					
				}
				System.out.println();
				if (credit > 0) 
				{
					setAccountCredit(creditLimitCalculator1, creditLimitCalculator2, creditLimitCalculator3, counter, credit);
					charge =setCharge(input, counter);
					
					while (charge < 0 && charge != -1) 
					{
						charge =setCharge(input, counter);
					}
					
					if(charge > 0) 
					{
						setAccountCharge(creditLimitCalculator1, creditLimitCalculator2, creditLimitCalculator3, counter, charge);
					}
				}
				isRunning = applicationState(isRunning, credit, charge);
				System.out.println();
			}
			isRunning = true;
			getAccountValues(creditLimitCalculator1, creditLimitCalculator2, creditLimitCalculator3, counter);
			//display new balance
		}
	}
	private static void setAccountCharge(CreditLimitCalculator creditLimitCalculator1, CreditLimitCalculator creditLimitCalculator2, CreditLimitCalculator creditLimitCalculator3, int counter, int charge) 
	{
		switch (counter) 
		{
			case 1:
				creditLimitCalculator1.setCharges(charge);
				break;
			case 2:
				creditLimitCalculator2.setCharges(charge);
				break;
			case 3:
				creditLimitCalculator3.setCharges(charge);
				break;
		}
	}
	private static void setAccountCredit(CreditLimitCalculator creditLimitCalculator1, CreditLimitCalculator creditLimitCalculator2, CreditLimitCalculator creditLimitCalculator3, int counter, int credit) 
	{
		switch (counter) 
		{
			case 1:
				creditLimitCalculator1.setCredits(credit);
				break;
			case 2:
				creditLimitCalculator2.setCredits(credit);
				break;
			case 3:
				creditLimitCalculator3.setCredits(credit);
				break;
		}
	}
	private static void getAccountValues(CreditLimitCalculator creditLimitCalculator1, CreditLimitCalculator creditLimitCalculator2, CreditLimitCalculator creditLimitCalculator3, int counter) 
	{
		switch (counter) 
		{
			case 1:
				accountValues(creditLimitCalculator1, counter);
				break;
			case 2:
				accountValues(creditLimitCalculator2, counter);
				break;
			case 3:
				accountValues(creditLimitCalculator3, counter);
				break;
		}
	}
	private static void accountValues(CreditLimitCalculator creditLimitCalculator1, int counter) 
	{
		System.out.printf("Account: %s\n", creditLimitCalculator1.getAccountNumber());
		System.out.printf("Starting Balance: $%s\n", creditLimitCalculator1.getStartBalance());
		System.out.printf("Total Credits: $%s\n", creditLimitCalculator1.getCredits());
		System.out.printf("Total Charges: $%s\n", creditLimitCalculator1.getCharges());
		creditLimitCalculator1.getNewBalance(counter);
	}
	private static boolean applicationState(boolean isRunning, int credit, int charge) {
		if(credit == -1 || charge == -1)
		{
			isRunning = false;
		}
		return isRunning;
	}
	private static int setCharge(Scanner input, int counter) 
	{
		//print Enter charges for account 1: $
		System.out.printf("Enter -1 to quit or a charge for account %s: $", counter);
		//get input from user and store in variable charges
		int charge = input.nextInt();
		return charge;
	}
	private static int setCredit(Scanner input, int counter) 
	{
		//print enter -1 to quit or Credit for account 1: $
		System.out.printf("Enter -1 to quit or a credit for account %s: $", counter);
		//get input from user and store in variable credits
		int credit = input.nextInt();
		return credit;
	}
}