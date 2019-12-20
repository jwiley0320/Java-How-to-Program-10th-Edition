package sales_commission_calculator;

public class SalesCommissionCalculator 
{
	private double earning;

	public double getEarning() {
		return earning;
	}
	public void setEarning(double earning) {
		this.earning += earning;
	}
	public double getTotalEarning(int weekPay, double salePercentEarn) {
		double totalEarning = weekPay + (salePercentEarn * earning);
		return totalEarning;
	}
}