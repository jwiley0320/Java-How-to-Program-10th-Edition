package tabular_output;

/*
 * Jason Matthew Wiley
 * 12/20/2019
 * Tabular Output Application
 * 
 * Write a Java application that uses looping to print the following table of values:
 * 
 * N 10*N 100*N 1000*N
 * 1 10 100 1000
 * 2 20 200 2000
 * 3 30 300 3000
 * 4 40 400 4000
 * 5 50 500 5000
 */

public class TabularOutput 
{
	public static void main(String[] args) 
	{
		//stored variables
		int multiple = 10;
		
		//print N	multiple * N	multiple(2) * N		multiple(3) * N
		System.out.printf("N\t%s*N\t%.0f*N\t%.0f*N\n\n", multiple, Math.pow(multiple, 2), Math.pow(multiple, 3));
		
		for (int counter = 1; counter <= 5; counter++) 
		{
			//print counter multiples
			System.out.printf("%s\t%s\t%.0f\t%.0f\n",counter, counter * multiple, Math.pow(multiple, 2) * counter, Math.pow(multiple, 3) * counter);
		}
	}
}