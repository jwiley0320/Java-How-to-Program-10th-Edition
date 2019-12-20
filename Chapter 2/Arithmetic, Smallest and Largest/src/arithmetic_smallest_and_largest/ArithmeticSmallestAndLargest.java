package arithmetic_smallest_and_largest;

import java.util.Scanner;

/*
 * Jason Matthew Wiley
 * 12/11/2019
 * Arithmetic, Smallest and Largest Application
 * 
 * Write an application that inputs three integers from the user and displays the sum, 
 * average, product, smallest and largest of the numbers. Use the techniques shown in 
 * Fig. 2.15. [Note: The calculation of the average in this exercise should result in an 
 * integer representation of the average. So, if the sum of the values is 7, the average 
 * should be 2, not2.3333….]
*/

public class ArithmeticSmallestAndLargest 
{
	public static void main(String[] args) 
	{
		//device to input data
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		//variables _number1, _number2, _number3, _total
		int _number1, _number2, _number3, _total;
		//declared variables _value1 = 3
		int _value1 = 3;
		
		//print to user Enter a number:
		System.out.print("Enter a number: ");
		//get input from user and store in variable _number1
		_number1 = input.nextInt();
		
		//print to user Enter a number:
		System.out.print("Enter a number: ");
		//get input from user and store in variable _number2
		_number2 = input.nextInt();
		
		//print to user Enter a number:
		System.out.print("Enter a number: ");
		//get input from user and store in variable _number3
		_number3 = input.nextInt();
		
		//calculate _number1 + _number2 + _number3 and store in variable _total
		_total = _number1 + _number2 + _number3;
		//print to user Sum: _number1 + _number2 + _number3 = _total
		System.out.printf("\nSum: %s + %s + %s = %s\n", _number1, _number2, _number3, _total);
		
		//calculate _total / _value1 and store in variable _total
		_total /= _value1;
		//print to user Average: _total / _value1 = _total
		System.out.printf("Average: %s + %s + %s / %s = %s\n", _number1, _number2, _number3, _value1, _total);
		
		//calculate _number1 * _number2 * _number3 and store in variable _total
		_total = _number1 * _number2 * _number3;
		//print to user Sum: _number1 * _number2 * _number3 = _total
		System.out.printf("Product: %s * %s * %s = %s\n", _number1, _number2, _number3, _total);
		
		//determine _number1 > _number2 and _number1 > _number3
		if(_number1 > _number2 && _number1 > _number3)
			//print to user Largest: _number1
			System.out.printf("\nLargest: %s\n", _number1);
		
		//determine _number2 > _number1 and _number2 > _number3
		if(_number2 > _number1 && _number2 > _number3)
			//print to user Largest: _number2
			System.out.printf("\nLargest: %s\n", _number2);
		
		//determine _number3 > _number2 and _number3 > _number1
		if(_number3 > _number2 && _number3 > _number1)
			//print to user Largest: _number3
			System.out.printf("\nLargest: %s\n", _number3);
		
		//determine _number1 < _number2 and _number1 < _number3
		if(_number1 < _number2 && _number1 < _number3)
			//print to user Smallest: _number1
			System.out.printf("Smallest: %s", _number1);
				
		//determine _number2 < _number1 and _number2 < _number3
		if(_number2 < _number1 && _number2 < _number3)
			//print to user Smallest: _number2
			System.out.printf("Smallest: %s", _number2);
				
		//determine _number3 < _number2 and _number3 < _number1
		if(_number3 < _number2 && _number3 < _number1)
			//print to user Smallest: _number3
			System.out.printf("Smallest: %s", _number3);
	}
}