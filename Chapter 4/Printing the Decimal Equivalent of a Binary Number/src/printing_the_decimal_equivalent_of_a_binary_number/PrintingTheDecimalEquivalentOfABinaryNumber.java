package printing_the_decimal_equivalent_of_a_binary_number;

import java.util.Scanner;

public class PrintingTheDecimalEquivalentOfABinaryNumber 
{
	Scanner input = new Scanner(System.in);
	
	int number;
	int binaryNumber;
	int binaryTotal;
	
	public int getBinaryTotal() {
		return binaryTotal;
	}
	public void setBinaryTotal(int counter) {
		this.binaryTotal = this.binaryTotal + this.binaryNumber * (int) Math.pow(2, counter - 1);
	}
	public int getBinaryNumber() {
		return binaryNumber;
	}
	public void setBinaryNumber(int multiplier1, int multiplier2) {
		this.binaryNumber = this.number / multiplier1;
		this.binaryNumber = this.binaryNumber % multiplier2;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber() {
		//print Enter a number containing only 1's and 0's
		System.out.print("Enter a number containing only 1's and 0's: ");
		//get input form user and store in variable number
		this.number = input.nextInt();
	}
}