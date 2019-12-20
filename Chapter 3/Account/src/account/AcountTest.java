package account;

import java.util.Scanner;

/*
 * Jason Matthew Wiley
 * 12/13/2019
 * Account Test Application
 * 
 * Modify class Account (Fig. 3.8) to provide a method called withdraw that withdraws 
 * money from an Account. Ensure that the withdrawal amount does not exceed the Account’s 
 * balance. If it does, the balance should be left unchanged and the method should print 
 * a message indicating "Withdrawal amount exceeded account balance." Modify class 
 * AccountTest (Fig. 3.9) to test method withdraw.
 */

public class AcountTest 
{
	public static void main(String[] args) 
	{
		//device to input data
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		//create account object and store in variable account
		Account account = new Account("Jane Doe", 50.00);
		//create account object and store in variable account2
		Account account2 = new Account("John Smith", -7.53);
		
		displayAccount(account);
		displayAccount(account2);
		
		//print to user Enter deposit amount for account:
		System.out.print("\nEnter deposit amount for account: $");
		//get user input and store in variable deposit
		double deposit = input.nextDouble();
		//add to account method Deposit
		account.Deposit(deposit);
		
		System.out.println();
		displayAccount(account);
		displayAccount(account2);
		
		//print to user Enter withdraw amount for account:
		System.out.print("\nEnter withdraw amount for account: $");
		//get user input and store in variable withdraw
		double withdraw = input.nextDouble();
		//add to account method Withdraw
		account.Withdraw(withdraw);

		System.out.println();
		displayAccount(account);
		displayAccount(account2);
		
		//print to user Enter deposit amount for account2:
		System.out.print("\nEnter deposit amount for account2: $");
		//get user input and store in variable deposit
		deposit = input.nextDouble();
		//add to account2 method Deposit
		account2.Deposit(deposit);
		
		System.out.println();
		displayAccount(account);
		displayAccount(account2);
		
		//print to user Enter withdraw amount for account:
		System.out.print("\nEnter withdraw amount for account2: $");
		//get user input and store in variable withdraw
		withdraw = input.nextDouble();
		//add to account method Withdraw
		account2.Withdraw(withdraw);		
		
		System.out.println();
		displayAccount(account);
		displayAccount(account2);
	}
	private static void displayAccount(Account account) 
	{
		//print to user current balance for account
		System.out.printf("%s balance: $%.02f\n", account.getName(), account.getBalance());
	}
}