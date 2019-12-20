package comparing_integers;

import java.util.Scanner;

/*
 * Jason Matthew Wiley
 * 12/11/2019
 * Comparing Integers Application
 * 
 * Write an application that asks the user to enter two integers, obtains them from 
 * the user and displays the larger number followed by the words "is larger". If the 
 * numbers are equal, print the message "These numbers are equal". Use the techniques 
 * shown in Fig. 2.15.
*/

public class ComparingIntegers 
{
	public static void main(String[] args) 
	{
		//device for user to input data
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		//variables _number1, _number2
		int _number1, _number2;
		
		//print to user Enter a number:
		System.out.print("Enter a number: ");
		//get data from user and store it in _number1
		_number1 = input.nextInt();
		
		//print to user Enter a number:
		System.out.print("Enter a number: ");
		//get data from user and store it in _number2
		_number2 = input.nextInt();
		
		//determine _number1 > _number2
		if(_number1 > _number2)
			//print to user _number1 is larger
			System.out.printf("\n%s is larger", _number1);
		//determine _number2 > _number1
		else if(_number2 > _number1)
			//print to user _number2 is larger
			System.out.printf("\n%s is larger", _number2);
		//determine _number1 = _number2
		else
			//print to user These numbers are equal
			System.out.print("\nThese numbers are equal");
	}
}