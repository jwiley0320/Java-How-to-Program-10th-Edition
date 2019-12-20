package multiples;

/*
 * Jason Matthew Wiley
 * 12/11/2019
 * Multiples Application
 * 
 * Write an application that reads two integers, determines whether the first is a 
 * multiple of the second and prints the result. [Hint: Use the remainder operator.]
 */

public class multiples 
{
	public static void main(String[] args) 
	{
		//declared variables _number1, _number2
		int _number1 = 5;
		int _number2 = 10;
		
		//determine _number1 % _number2 = 0
		if(_number1 % _number2 == 0)
			//print to user _number2 is a multiple of _number1
			System.out.printf("%s is a multiple of %s", _number2, _number1);
		//determine _number1 % _number2 ! 0
		else
			//print to user _number2 is not a multiple of _number1
			System.out.printf("%s is not a multiple of %s", _number2, _number1);
	}
}