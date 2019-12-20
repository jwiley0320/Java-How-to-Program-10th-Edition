package separating_the_digits_in_an_integer;

import java.util.Scanner;

/*
 * Jason Matthew Wiley
 * 12/11/2019
 * Separating the Digits in an Integer
 * 
 * Write an application that inputs one number consisting of five digits from the user, 
 * separates the number into its individual digits and prints the digits separated from 
 * one another by three spaces each. For example, if the user types in the number 42339, 
 * the program should print 
 * 
 * 4   2   3   3   9
 * 
 * Assume that the user enters the correct number of digits. What happens when you enter 
 * a number with more than five digits? What happens when you enter a number with fewer 
 * than five digits? [Hint: It’s possible to do this exercise with the techniques you 
 * learned in this chapter. You’ll need to use both division and remainder operations to 
 * “pick off” each digit.]
 */

public class SeparatingTheDigitsInAnInteger 
{
	public static void main(String[] args) 
	{
		//device to input data
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		//variables _number, _total
		int _number, _total;
		
		//print to user a five digit number:
		System.out.print("Enter a five digit number: ");
		//get input from user and store in variable _number
		_number = input.nextInt();
		
		//calculate _number % 100000 / 10000 and store in _total
		_total = _number % 100000 / 10000;
		//print to user _total
		System.out.printf("%s   ", _total);
		
		//calculate _number % 10000 / 1000 and store in _total
		_total = _number % 10000 / 1000;
		//print to user _total
		System.out.printf("%s   ", _total);
		
		//calculate _number % 1000 / 100 and store in _total
		_total = _number % 1000 / 100;
		//print to user _total
		System.out.printf("%s   ", _total);
		
		//calculate _number % 100 / 10 and store in _total
		_total = _number % 100 / 10;
		//print to user _total
		System.out.printf("%s   ", _total);
		
		//calculate _number % 10 and store in _total
		_total = _number % 10;
		//print to user _total
		System.out.printf("%s", _total);
	}
}