package credit_limit_calculator;

public class CreditLimitCalculator 
{
	private int accountNumber;
	private int startBalance;
	private int charges;
	private int credits;
	private int allowedLimit;
	private int newBalance;
	
	public CreditLimitCalculator(int account, int startBalance, int allowedLimit) 
	{
		this.startBalance = startBalance;
		this.allowedLimit = allowedLimit;
		this.accountNumber = account;
	}
	public int getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	public int getStartBalance() {
		return startBalance;
	}
	public void setStartBalance(int startBalance) {
		this.startBalance = startBalance;
	}
	public int getCharges() {
		return charges;
	}
	public void setCharges(int charges) {
		this.charges += charges;
	}
	public int getCredits() {
		return credits;
	}
	public void setCredits(int credits) {
		this.credits += credits;
	}
	public int getAllowedLimit() {
		return allowedLimit;
	}
	public void setAllowedLimit(int allowedLimit) {
		this.allowedLimit = allowedLimit;
	}
	public void getNewBalance(int counter)
	{
		newBalance = startBalance + charges - credits;
		
		if(newBalance > allowedLimit) 
			System.out.printf("Credit limit exceeded for account %s\n\n", counter);
		else 
			System.out.printf("New Balance for account %s: $%s\n\n", counter, newBalance);
	}
}