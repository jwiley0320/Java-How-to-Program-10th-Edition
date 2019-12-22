package square_of_asterisks;

import java.util.Scanner;

/*
 * Jason Matthew Wiley
 * 12/20/2019
 * Square of Asterisks Application
 * 
 * Write an application that prompts the user to enter the size of the side of a square, then 
 * displays a hollow square of that size made of asterisks. Your program should work for squares 
 * of all side lengths between 1 and 20.
 */

public class SquareOfAsterisksTest 
{
	public static void main(String[] args) 
	{
		//device used to input data
		Scanner input = new Scanner(System.in);
		
		//star objects
		SquareOfAsterisks squareOfAsterisks = new SquareOfAsterisks();
		
		int square = setSquare(input);
		
		while (square < 1 || square > 20) 
		{
			square = setSquare(input);
		}
		System.out.println();
		squareOfAsterisks.setNumberStars(square);
		for (int row = 1; row <= squareOfAsterisks.getNumberStars(); row++)
		{
			if(row == 1 || row == squareOfAsterisks.getNumberStars()) 
			{
				setTopAndBottom(squareOfAsterisks);
			}
			else 
			{
				setMiddle(squareOfAsterisks);
			}
			System.out.println();			
		}
	}
	private static void setMiddle(SquareOfAsterisks squareOfAsterisks)
	{
		for (int asterisk = 2; asterisk >= 1; asterisk--) 
		{
			System.out.print("*");
			for(int space = squareOfAsterisks.getNumberStars() - 2; space >= 1; space--) 
			{
				System.out.print(" ");
			}
		}
	}
	private static void setTopAndBottom(SquareOfAsterisks squareOfAsterisks) 
	{
		for (int astrisk = squareOfAsterisks.getNumberStars(); astrisk >= 1; astrisk--) 
		{
			System.out.print("*");
		}
	}
	private static int setSquare(Scanner input)
	{
		//print Enter size of side of square
		System.out.print("Enter Size of Side of Square 1 - 20: ");
		//get input from user and store in variable square
		int square = input.nextInt();
		return square;
	}
}