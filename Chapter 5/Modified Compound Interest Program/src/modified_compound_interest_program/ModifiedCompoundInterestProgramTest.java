package modified_compound_interest_program;

/*
 * Jason Matthew Wiley
 * 01/12/2020
 * Modified Compound-Interest Program Application
 * 
 * Modify the compound-interest application of Fig. 5.6 to repeat its steps for interest rates 
 * of 5%, 6%, 7%, 8%, 9% and 10%. Use a for loop to vary the interest rate.
 */

public class ModifiedCompoundInterestProgramTest 
{
	public static void main(String[] args) 
	{
		
		ModifiedCompoundInterestProgram interestProgram  = new ModifiedCompoundInterestProgram();
		
		//display headers
		System.out.printf("%s%31s %.0f%%%n", "Year", "Amount on deposit at", interestProgram.getRate() * 100);
		
		//repeat if counter <= rate * 100
		while(interestProgram.getRate() * 100 <= 10) 
		{
			// calculate amount on deposit for each of ten years
			for (int year = 1; year <= 10; ++year)
			{
				interestProgram.setAmount(year);

				// display the year and the amount
				System.out.printf("%4d%,34.2f%n", year, interestProgram.getAmount());
			}
			//end loop
			
			if(interestProgram.getRate() * 100 <= 8) 
			{
				//display headers
				System.out.printf("\n%s%31s %.0f%%%n", "Year", "Amount on deposit", interestProgram.getRate() * 100 + 1);
			}
			else if(interestProgram.getRate() * 100 == 9) 
			{
				System.out.printf("\n%s%30s %.0f%%%n", "Year", "Amount on deposit", interestProgram.getRate() * 100 + 1);
			}
			interestProgram.addIntrest();
		}
		//end loop
	}
}