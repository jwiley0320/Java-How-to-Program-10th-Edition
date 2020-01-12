package find_the_smallest_value;

/*
 * Jason Matthew Wiley
 * 01/11/2020
 * Find the Smallest Value Application
 * 
 * Write an application that finds the smallest of several integers. Assume that the first value 
 * read specifies the number of values to input from the user.
 */

public class FindTheSmallestValueTest 
{
	public static void main(String[] args) 
	{
		FindTheSmallestValue smallestValue = new FindTheSmallestValue();
		
		//Repeat if timesRun <= 0
		while (smallestValue.getTimesRun() <= 0)
		{
			smallestValue.setTimesRunS();
		}	
		//end loop
		System.out.println();
		
		//counter = 1
		//Repeat if counter <= timesRun
		//counter++
		for(int counter = 1; counter <= smallestValue.getTimesRun(); counter++) 
		{
			smallestValue.setNum(counter);
			smallestValue.setSmallestNumber();
		}
		//end loop
		
		//print Smallest Number: smallestNumber
		System.out.printf("\nSmallest Number: %s", smallestValue.getSmallestNumber());
	}
}