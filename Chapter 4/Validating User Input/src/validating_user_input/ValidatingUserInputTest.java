package validating_user_input;

import java.util.Scanner;

/*
 * Jason Matthew Wiley
 * 12/20/2019
 * Validating User Input Application
 * 
 * Modify the program in Fig. 4.12 to validate its inputs. For any input, if the value entered is 
 * other than 1 or 2, keep looping until the user enters a correct value.
 */

public class ValidatingUserInputTest 
{
	public static void main(String[] args) 
	{
		//device used to input data
		Scanner input = new Scanner(System.in);
		
		//validate objects
		ValidatingUserInput validatingUserInput = new ValidatingUserInput();
		
		for(int studentCounter = 1; studentCounter <= 10; studentCounter++) 
		{
			int result = setResult(input);
			
			while(result != 1 || result != 2) 
			{
				result = setResult(input);
			}
			
			validatingUserInput.setResult(result);
		}
		getResults(validatingUserInput);	
		getInstructorBonus(validatingUserInput);
	}
	private static void getResults(ValidatingUserInput validatingUserInput) 
	{
		//print Passed: passes
		System.out.printf("Passed: %d%n", validatingUserInput.getPasses());
		//print Failures: failures
		System.out.printf("Failures: %d%n",validatingUserInput.getFailures());
	}
	private static void getInstructorBonus(ValidatingUserInput validatingUserInput) 
	{
		if (validatingUserInput.getPasses() > 8)
			//print Bonus to instructor!
			 System.out.println("Bonus to instructor!");
	}
	private static int setResult(Scanner input) 
	{
		//print Enter result (1 = pass, 2 = fail): 
		System.out.print("Enter result (1 = pass, 2 = fail): ");
		//get input from user and store in variable result
		int result = input.nextInt();
		return result;
	}
}