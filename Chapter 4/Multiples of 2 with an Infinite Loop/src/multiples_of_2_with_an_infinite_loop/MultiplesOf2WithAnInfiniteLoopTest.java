package multiples_of_2_with_an_infinite_loop;

/*
 * Jason Matthew Wiley
 * 01/03/2020
 * Multiples of 2 with an Infinite Loop Application
 * 
 * Write an application that keeps displaying in the command window the multiples of the integer 
 * 2—namely, 2, 4, 8, 16, 32, 64, and so on. Your loop should not terminate (i.e., it should 
 * create an infinite loop). What happens when you run this program?
 */

public class MultiplesOf2WithAnInfiniteLoopTest 
{
	public static void main(String[] args) 
	{
		//declared variables
		boolean isRuning = true;
		int multiplier = 2;
		
		MultiplesOf2WithAnInfiniteLoop counter = new MultiplesOf2WithAnInfiniteLoop();
				
		//endless loop multiply by 2
		while(isRuning) 
		{
			System.out.println(multiplier * counter.getCounter());
			counter.setCounter();
		}
	}
}