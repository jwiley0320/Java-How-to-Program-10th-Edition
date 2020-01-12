package factorials;

import java.util.Scanner;

public class Factorials
{
	Scanner input = new Scanner(System.in);
	
	long factorial = 1;
	
	public long getFactorial() {
		return factorial;
	}
	public void setFactorial(int counter) {
		this.factorial = this.factorial * counter;
	}
}