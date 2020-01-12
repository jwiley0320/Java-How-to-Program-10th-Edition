package calculating_the_product_of_odd_integers;

public class CalculatingTheProductOfOddIntegers 
{
	int total = 1;
	int number;
	
	public int getTotal() {
		return total;
	}
	public void setTotal() {
		this.total = this.total * number;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
}