package palindromes;

import java.util.Scanner;

/*
 * Jason Matthew Wiley
 * 12/23/2019
 * Palindromes Application
 * 
 * A palindrome is a sequence of characters that reads the same backward as forward. For example, 
 * each of the following five-digit integer is a palindrome: 12321, 55555, 45554 and 11611. 
 * Write an application that reads in a five-digit integer and determines whether it’s a 
 * palindrome. If the number is not five digits long, display an error message and allow the 
 * user to enter a new value.
 */

public class PalindromesTest 
{
	public static void main(String[] args) 
	{
		//device used to input data from user
		Scanner input = new Scanner(System.in);
		
		//object palindrome
		Palindromes palindromes = new Palindromes();
		
		String number = setNumber(input);
		
		while (number.length() != 5)
		{
			number = setNumber(input);
		}
		
		palindromes.setNumber(number);		
		determinPalindrome(palindromes);
	}
	private static void determinPalindrome(Palindromes palindromes) 
	{
		if(palindromes.getNumber().charAt(0) == palindromes.getNumber().charAt(4) && palindromes.getNumber().charAt(1) == palindromes.getNumber().charAt(3)) 
			System.out.printf("\nThis is a palidrome: %s",  palindromes.getNumber());
		else
			System.out.printf("\nThis is not a palidrome: %s",  palindromes.getNumber());
	}
	private static String setNumber(Scanner input) 
	{
		//print Enter a five digit value:
		System.out.print("Enter a five digit value: ");
		//get input from user and store in variable number
		String number = input.next();
		return number;
	}
}