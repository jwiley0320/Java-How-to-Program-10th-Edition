package target_heart_rate_calculator;

import java.util.Scanner;

/*
 * Jason Matthew Wiley
 * 12/14/2019
 * Target Heart Rate Calculator Application
 * 
 * While exercising, you can use a heart-rate monitor to see that your heart rate stays 
 * within a safe range suggested by your trainers and doctors. According to the American 
 * Heart Association (AHA) (www.americanheart.org/presenter.jhtml?identifier=4736), the 
 * formula for calculating your maximum heart rate in beats per minute is 220 minus your 
 * age in years. Your target heart rate is a range that’s 50–85% of your maximum heart 
 * rate. [Note: These formulas are estimates provided by the AHA. Maximum and target heart 
 * rates may vary based on the health, fitness and gender of the individual. Always 
 * consult a physician or qualified health-care professional before beginning or 
 * modifying an exercise program.] Create a class called HeartRates. The class attributes 
 * should include the person’s first name, last name and date of birth (consisting of 
 * separate attributes for the month, day and year of birth). Your class should have a 
 * constructor that receives this data as parameters. For each attribute provide set and 
 * get methods. The class also should include a method that calculates and returns the 
 * person’s age (in years), a method that calculates and returns the person’s maximum 
 * heart rate and a method that calculates and returns the person’s target heart rate. 
 * Write a Java app that prompts for the person’s information, instantiates an object of 
 * class HeartRates and prints the information from that object—including the person’s 
 * first name, last name and date of birth—then calculates and prints the person’s age 
 * in (years), maximum heart rate and target-heart-rate range.
 */
public class TargetHeartRateCalculatorTest 
{
	public static void main(String[] args) 
	{
		//device used to input data
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		//print to user Enter First Name:
		System.out.print("Enter First Name: ");
		//get data from user and store in variable firstName
		String firstName = input.nextLine();
		
		//print to user Enter Last Name: 
		System.out.print("Enter Last Name: ");
		//get data from user and store in variable lastName
		String lastName = input.nextLine();
		
		//print to user Enter Birth Month: 
		System.out.print("Enter Birth Month: ");
		//get data from user and store in variable month
		int month = input.nextInt();
		
		//print to user Enter Birth Day: 
		System.out.print("Enter Birth Day: ");
		//get data from user and store in variable day
		int day = input.nextInt();
				
		//print to user Enter Birth Year: 
		System.out.print("Enter Birth Year: ");
		//get data from user and store in variable year
		int year = input.nextInt();
		
		//call constructor TargetHeartRate
		TargetHeartRateCalculator targetHeartRateCalculator = new TargetHeartRateCalculator(firstName, lastName, month, day, year);
		
		//print to user First Name: firstName
		System.out.printf("\nFirst Name: %s\n", targetHeartRateCalculator.getFirstName());
		//print to user Last Name: lastName
		System.out.printf("Last Name: %s\n", targetHeartRateCalculator.getLastName());
		//print to user Birth date: month/day/year
		targetHeartRateCalculator.displayDate();
		//print to user Age: age
		System.out.printf("Age: %s\n", targetHeartRateCalculator.getAge(2020));
		//print to user Max Heart Rate: maxHeartRate
		System.out.printf("Max Heart Rate: %s\n", targetHeartRateCalculator.getMaxHeartRate());
		//print to user Target Heart Rate: minTargetHeartRate - maxTargetHeartRate
		System.out.printf("Target Heart Rate: %.0f - %.0f", targetHeartRateCalculator.getMinTargetHeartRate(), targetHeartRateCalculator.getMaxTargetHeartRate());
	}
}