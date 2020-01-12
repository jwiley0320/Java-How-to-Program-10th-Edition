package factorials;

/*
 * Jason Matthew Wiley
 * 01/11/2020
 * Factorials Application
 * 
 * Factorials are used frequently in probability problems. The factorial of a positive integer n 
 * (written n! and pronounced “n factorial”) is equal to the product of the positive integers 
 * from 1 to n. Write an application that calculates the factorials of 1 through 20. Use type 
 * long. Display the results in tabular format. What difficulty might prevent you from calculating
 * the factorial of 100? //overflows past the long variable holder limit at 21
 */

public class FactorialsTest
{
	public static void main(String[] args) 
	{
		Factorials factorials = new Factorials();
		
		//print header Factorial	Total
		System.out.printf("%s%20s\n\n", "Factorial", "Total");
		
		//counter = 1
		//repeat if counter < 20
		//counter++
		for (int counter = 1; counter <= 20; counter++) 
		{
			//calculate factorial
			factorials.setFactorial(counter);
			//print tabular counter!	factorial
			System.out.printf("%s!\t\t\t%,d\n", counter, factorials.getFactorial());
		}
		//end loop
	}
}