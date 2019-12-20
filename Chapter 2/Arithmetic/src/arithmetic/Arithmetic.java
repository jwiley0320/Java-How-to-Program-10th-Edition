package arithmetic;

import java.util.Scanner;

/*
 * Jason Matthew Wiley
 * 12/11/2019
 * Arithmetic Application
 * 
 * Write an application that asks the user to enter two integers, obtains them from the user 
 * and prints their sum, product, difference and quotient (division). Use the techniques shown 
 * in Fig. 2.7.
*/

public class Arithmetic 
{
	public static void main(String[] args) 
	{
		//device to input user data
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		//variables _number1, _number2, _total
		int _number1, _number2, _total;	
		
		
		//print to user Enter a number:
		System.out.print("Enter a number: ");
		//get data from user and store it in variable _number1
		_number1 = input.nextInt();
		 
		//print to user Enter a number:
		System.out.print("Enter a number: ");
		//get data from user and store it in variable _number2
		_number2 = input.nextInt();
		
		//calculate _number1 + _number2 and store in variable _total
		_total = _number1 + _number2;
		//print to user Sum: _number1 + _number2 = _total
		System.out.printf("\nSum: %s + %s = %s\n", _number1, _number2, _total);
		
		//calculate _number1 * _number2 and store in variable _total
		_total = _number1 * _number2;
		//print to user Product: _number1 * _number2 = _total
		System.out.printf("Product: %s * %s = %s\n", _number1, _number2, _total);
		
		//calculate _number1 - _number2 and store in variable _total
		_total = _number1 - _number2;
		//print to user Difference: _number1 - _number2 = _total
		System.out.printf("Difference: %s - %s = %s\n", _number1, _number2, _total);
		 
		//calculate _number1 / _number2 and store in variable _total
		_total = _number1 / _number2;
		//print to user Quotient: _number1 / _number2 = _total
		System.out.printf("Quotient: %s / %s = %s", _number1, _number2, _total);
	}
}