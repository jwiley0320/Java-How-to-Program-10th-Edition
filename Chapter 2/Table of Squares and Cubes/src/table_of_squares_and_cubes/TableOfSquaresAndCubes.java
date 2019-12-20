package table_of_squares_and_cubes;

/*
 * Jason Matthew Wiley
 * 12/12/2019
 * Table of Squares and Cubes Application
 * 
 * Using only the programming techniques you learned in this chapter, write an 
 * application that calculates the squares and cubes of the numbers from 0 to 10 and 
 * prints the resulting values in table format
 */

public class TableOfSquaresAndCubes 
{
	public static void main(String[] args) 
	{	
		//print to user Number	Square	Cube
		System.out.println("Number\tSquare\tCube");
		//print to user 0		0		0
		System.out.printf("%s\t%.0f\t%.0f\n", 0, Math.pow(0, 2), Math.pow(0, 3));
		//print to user 1		1		1
		System.out.printf("%s\t%.0f\t%.0f\n", 1, Math.pow(1, 2), Math.pow(1, 3));
		//print to user 2		4		8
		System.out.printf("%s\t%.0f\t%.0f\n", 2, Math.pow(2, 2), Math.pow(2, 3));
		//print to user 3		9		27
		System.out.printf("%s\t%.0f\t%.0f\n", 3, Math.pow(3, 2), Math.pow(3, 3));
		//print to user 4		16		64
		System.out.printf("%s\t%.0f\t%.0f\n", 4, Math.pow(4, 2), Math.pow(4, 3));
		//print to user 5		25		125
		System.out.printf("%s\t%.0f\t%.0f\n", 5, Math.pow(5, 2), Math.pow(5, 3));
		//print to user 6		36		216
		System.out.printf("%s\t%.0f\t%.0f\n", 6, Math.pow(6, 2), Math.pow(6, 3));
		//print to user 7		49		343
		System.out.printf("%s\t%.0f\t%.0f\n", 7, Math.pow(7, 2), Math.pow(7, 3));
		//print to user 8		64		512
		System.out.printf("%s\t%.0f\t%.0f\n", 8, Math.pow(8, 2), Math.pow(8, 3));
		//print to user 9		81		729
		System.out.printf("%s\t%.0f\t%.0f\n", 9, Math.pow(9, 2), Math.pow(9, 3));
		//print to user 10		100		1000
		System.out.printf("%s\t%.0f\t%.0f", 10, Math.pow(10, 2), Math.pow(10, 3));
	}
}