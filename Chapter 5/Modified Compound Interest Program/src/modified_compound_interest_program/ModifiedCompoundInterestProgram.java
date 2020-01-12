package modified_compound_interest_program;

public class ModifiedCompoundInterestProgram 
{
	double rate = 0.05;
	double principal = 1000.0;
	double amount;
	
	public double getRate() {
		return rate;
	}
	public void setRate(double rate) {
		this.rate = rate;
	}
	public double getPrincipal() {
		return principal;
	}
	public void setPrincipal(double principal) {
		this.principal = principal;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(int year) {
		this.amount = this.principal * Math.pow(1.0 + this.rate, year);
	}
	public void addIntrest() {
		this.rate = this.rate + .01;
	}
}