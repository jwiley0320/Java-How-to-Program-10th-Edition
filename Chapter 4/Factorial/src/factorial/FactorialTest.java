package factorial;

/*
 * Jason Matthew Wiley
 * 01/09/2020
 * Factorial Application
 * 
 * The factorial of a nonnegative integer n is written as n! (pronounced “n factorial”) and is 
 * defined as follows:
 * 
 * n! = n · (n – 1) · (n – 2) · … · 1 (for values of n greater than or equal to 1)
 * and
 * n! = 1 (for n = 0)
 * 
 * For example, 5! = 5 · 4 · 3 · 2 · 1, which is 120.
 * 
 * a) Write an application that reads a nonnegative integer and computes and prints its factorial.
 * b) Write an application that estimates the value of the mathematical constant e by using the 
 * following formula. Allow the user to enter the number of terms to calculate.
 * e = 1 + 1/1! + 1/2! + 1/3! + ....
 * c) Write an application that computes the value of e^x by using the following formula. Allow 
 * the user to enter the number of terms to calculate.
 * e^x = 1 + x/1! + x^2/2! + x^3/3! + ....
 */

public class FactorialTest 
{
	public static void main(String[] args) 
	{
		Factorial factorial = new Factorial();
		
		//print Set (letter):
		setLetter("A");
		setFactorial(factorial);
		factorial.setFactorialTotal();
		
		//counter = factorial
		//repeat if counter > 1
		//counter--
		for(int counter = factorial.getFactorial() - 1; counter > 1; counter--) 
		{
			factorial.calculateFactorialTotal(counter);
		}
		//end loop
		
		//print Factorial factorial! Total: factorialTotal
		System.out.printf("\nFactorial %s! Total: %.00f\n\n", factorial.getFactorial(), factorial.getFactorialTotal());
		
		factorial.resetFactorial();
		factorial.resetFactorialTotal();
		
		//print Set (letter):
		setLetter("B");
		setFactorial(factorial);
		
		//counter = 1
		//repeat if counter <= factorial
		//counter++
		for (int counter = 1; counter <= factorial.getFactorial(); counter++) 
		{
			factorial.calculateFactorialTotal(counter);
			factorial.calculateConstant();
		}
		//end loop
		
		//print Constant Total: constant
		System.out.printf("\nConstant Total: %.02f\n\n", factorial.getConstant());
		
		factorial.resetFactorial();
		factorial.resetFactorialTotal();
		factorial.resetConstant();
		
	}
	private static void setFactorial(Factorial factorial) {
		//repeat if factorial <= 0
		while (factorial.getFactorial() <= 0)
		{
			factorial.setFactorial();
		}
		//end loop
	}
	private static void setLetter(String letter) {
		System.out.printf("Set %s:\n", letter);
	}
}