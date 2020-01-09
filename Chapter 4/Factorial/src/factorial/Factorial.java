package factorial;

import java.util.Scanner;

public class Factorial 
{
	Scanner input = new Scanner(System.in);
	
	int factorial = 0;
	double factorialTotal;
	double constant = 1;
	
	public double getConstant() {
		return constant;
	}
	public void calculateConstant() {
		this.constant = this.constant + (1 / this.factorialTotal);
	}
	public  void resetFactorial() {
		this.factorial = 0;
	} 
	public  void resetConstant() {
		this.factorial = 1;
	} 
	public void resetFactorialTotal() {
		this.factorialTotal = 1.0;
	}
	public double getFactorialTotal() {
		return factorialTotal;
	}
	public void setFactorialTotal() {
		this.factorialTotal = this.factorial;
	}
	public void calculateFactorialTotal(int counter) {
		this.factorialTotal = this.factorialTotal * counter;
	}
	public int getFactorial() {
		return factorial;
	}
	public void setFactorial() {
		//print Enter a non zero number:
		System.out.print("Enter a non zero number: ");
		//get input from user and store in variable factorial
		this.factorial = input.nextInt();
	}
}