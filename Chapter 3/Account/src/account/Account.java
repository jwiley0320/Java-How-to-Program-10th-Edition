package account;
/*
 * Jason MAtthew Wiley
 * 12/13/2019
 * Account Class Functionality
 * 
 * Account class with a double instance variable balance and a constructor
 * and deposit method that perform validation.
*/

public class Account 
{
	//instance variables
	private String name;
	private double balance;
	
	//construct for class account variables name, balance
	public Account(String name, double balance) 
	{
		this.name = name;
		/*
		 * validate that the balance is greater than 0.0; if it's not,
		 * instance variable balance keeps its default initial value of 0.0
		*/
		if(balance > 0.0)
			this.balance = balance;
	}
	//method deposit to add to current balance
	public void Deposit(double deposit) 
	{
		/*
		 * validate that deposit is greater than 0.0; if its not,
		 * balance remains unchanged and print to user An incorrect value
		 * was entered. if it is greater than 0.0 add deposit to balance
		*/
		if(deposit < 0.0)
			System.out.print("An incorrect value was entered.\n");
		else
			balance += deposit;
	}
	//method withdraw to subtract from current balance 
	public void Withdraw(double withdraw) 
	{
		/*
		 * validate that withdraw is greater than 0.0 and less than or equal to balance;
		 * if its not balance remains unchanged and print to user An incorrect value
		 * was entered. else balance - withdraw 
		 */
		if(withdraw > 0.0 && withdraw <= balance)
			balance -= withdraw;
		else
			System.out.print("Withdrawal amount exceeded account balance.\n");
	}
	//method to get balance object
	public double getBalance() 
	{
		return balance;
	}
	//method to get name object
	public String getName() 
	{
		return name;//return name to user
	}
	//method to set name object
	public void setName(String name) 
	{
		this.name = name;//store name
	}
}