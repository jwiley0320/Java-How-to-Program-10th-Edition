package calculating_the_product_of_odd_integers;

/*
 * Jason Matthew Wiley
 * 01/11/2020
 * Calculating the Product of Odd Integers Application
 * 
 * Write an application that calculates the product of the odd integers from 1 to 15.
 */

public class CalculatingTheProductOfOddIntegersTest 
{
	public static void main(String[] args) 
	{
		CalculatingTheProductOfOddIntegers oddIntegers = new CalculatingTheProductOfOddIntegers();
		
		//counter = 1
		//repeat if counter <= 15
		//counter++
		for (int counter = 1; counter <= 15; counter++) 
		{
			oddIntegers.setNumber(counter);
			//if counter % 2 != 0
			if(oddIntegers.getNumber() % 2 != 0) 
			{
				oddIntegers.setTotal();
			}
			//end if
		}
		//end loop
		
		//print The product of odd numbers 1 - 15 is: total
		System.out.printf("The product of odd numbers 1 - 15 is: %,d", oddIntegers.getTotal());
	}
}