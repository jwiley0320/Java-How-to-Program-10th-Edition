package find_the_two_largest_numbers;

import java.util.Scanner;

/*
 * Jason Matthew Wiley
 * 12/20/2019
 * Find the Two Largest Numbers Application
 * 
 * Using an approach similar to that for Exercise 4.21, find the two largest values of the 10 
 * values entered. [Note: You may input each number only once.]
 */

public class FindTheTwoLargestNumbersTest 
{
	public static void main(String[] args) 
	{	
		//device used to input data
		Scanner input = new Scanner(System.in);
		
		//largest number object
		FindTheTwoLargestNumbers findTheTwoLargestNumbers = new FindTheTwoLargestNumbers();
		
		for (int counter = 1; counter <= 10; counter++)
		{
			int number = setNumber(input);
			findTheTwoLargestNumbers.setLargestNumber(number);
		}
		
		//print Largest Number: largestNumber
		System.out.printf("\nLargest Number: %s\n", findTheTwoLargestNumbers.getLargestNumber());
		//print Second Largest Number: secondLargestNumber
		System.out.printf("Second Largest Number: %s", findTheTwoLargestNumbers.getSecondLargestNumber());
	}
	private static int setNumber(Scanner input) 
	{
		//print Enter a Number:
		System.out.print("Enter a Number: ");
		//get input from user and store in variable number
		int number = input.nextInt();
		return number;
	}
}