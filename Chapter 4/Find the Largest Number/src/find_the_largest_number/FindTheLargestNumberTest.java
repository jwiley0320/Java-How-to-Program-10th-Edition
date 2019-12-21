package find_the_largest_number;

import java.util.Scanner;

/*
 * Jason Matthew Wiley
 * 12/20/2019
 * Find the Largest Number Application
 * 
 * The process of finding the largest value is used frequently in computer applications. For 
 * example, a program that determines the winner of a sales contest would input the number of 
 * units sold by each salesperson. The salesperson who sells the most units wins the contest. 
 * Write a pseudocode program, then a Java application that inputs a series of 10 integers and 
 * determines and prints the largest integer. Your program should use at least the following 
 * three variables:
 * 
 * a) counter: A counter to count to 10 (i.e., to keep track of how many numbers have been input 
 * and to determine when all 10 numbers have been processed).
 * b) number: The integer most recently input by the user.
 * c) largest: The largest number found so far.
 */

public class FindTheLargestNumberTest 
{
	public static void main(String[] args) 
	{
		//device to input data
		Scanner input = new Scanner(System.in);
		
		//largest number object
		FindTheLargestNumber findTheLargestNumber = new FindTheLargestNumber();
		
		for (int counter = 1; counter <= 10; counter++)
		{
			int number = setNumber(input);
			findTheLargestNumber.setLargestNumber(number);
		}
		System.out.printf("\nLargest Number: %s", findTheLargestNumber.getLargestNumber());
	}
	private static int setNumber(Scanner input)
	{
		//print Enter a number:
		System.out.print("Enter a Number: ");
		//get input from user and store in variable number
		int number = input.nextInt();
		return number;
	}
}