package checkerboard_pattern_of_asterisks;

/*
 * Jason Matthew Wiley
 * 01/02/2020
 * Checkerboard Pattern of Asterisks Application
 * 
 * Write an application that uses only the output statements
 * 
 * System.out.print("* ");
 * System.out.print(" ");
 * System.out.println();
 * 
 * to display the checkerboard pattern that follows. A System.out.println method call with no 
 * arguments causes the program to output a single newline character. [Hint: Repetition 
 * statements are required.]
 */
public class CheckerboardPatternOfAsterisksTest 
{
	public static void main(String[] args) 
	{
		CheckerboardPatternOfAsterisks asterisks = new CheckerboardPatternOfAsterisks();
		
		//counter = 1
		//repeat if counter <= 8
		//counter++
		for(int counter = 1; counter <= 8; counter++) 
		{
			asterisks.setSpace(counter);
			asterisks.setAstrisk();
		
			//print new line
			System.out.println();	
		}
		//end loop
	}
}