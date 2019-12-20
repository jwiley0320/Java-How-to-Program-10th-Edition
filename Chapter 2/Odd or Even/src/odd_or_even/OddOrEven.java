package odd_or_even;

/*
 * Jason Matthew Wiley
 * 12/11/2019
 * Odd or Even Application
 * 
 * Write an application that reads an integer and determines and prints whether it’s odd 
 * or even. [Hint: Use the remainder operator. An even number is a multiple of 2. 
 * Any multiple of 2 leaves a remainder of 0 when divided by 2.]
 */

public class OddOrEven 
{
	public static void main(String[] args) 
	{
		//declared variable _number
		int _number = 5;
		
		//determine _number % 2 = 0
		if(_number % 2 == 0)
			//print to user Even
			System.out.print("Even");
		//determine _number % 2 ! 0
		else
			//print to user Odd
			System.out.print("Odd");
	}
}