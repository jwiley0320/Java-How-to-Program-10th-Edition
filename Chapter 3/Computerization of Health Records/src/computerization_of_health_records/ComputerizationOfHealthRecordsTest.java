package computerization_of_health_records;

import java.util.Scanner;

/*
 * Jason Matthew Wiley
 * 12/14/2019
 * Computerization of Health Records Application
 * 
 * A health-care issue that has been in the news lately is the computerization of health 
 * records. This possibility is being approached cautiously because of sensitive privacy 
 * and security concerns, among others. [We address such concerns in later exercises.] 
 * Computerizing health records could make it easier for patients to share their health 
 * profiles and histories among their various health-care professionals. This could 
 * improve the quality of health care, help avoid drug conflicts and erroneous drug 
 * prescriptions, reduce costs and, in emergencies, could save lives. In this exercise, 
 * you’ll design a “starter” HealthProfile class for a person. The class attributes 
 * should include the person’s first name, last name, gender, date of birth (consisting 
 * of separate attributes for the month, day and year of birth), height (in inches) and 
 * weight (in pounds). Your class should have a constructor that receives this data. For 
 * each attribute, provide set and get methods. The class also should include methods 
 * that calculate and return the user’s age in years, maximum heart rate and 
 * target-heart-rate range (see Exercise 3.16), and body mass index (BMI; see 
 * Exercise 2.33). Write a Java app that prompts for the person’s information, 
 * instantiates an object of class HealthProfile for that person and prints the 
 * information from that object—including the person’s first name, last name, gender, 
 * date of birth, height and weight—then calculates and prints the person’s age in years, 
 * BMI, maximum heart rate and target-heart-rate range. It should also display the BMI 
 * values chart from Exercise 2.33.
 * 
 * BMI VALUES
 * Underweight: less than 18.5
 * Normal: between 18.5 and 24.9
 * Overweight: between 25 and 29.9
 * Obese: 30 or greater
 */

public class ComputerizationOfHealthRecordsTest 
{
	public static void main(String[] args) 
	{
		//device to input data
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		//print to user Enter First Name:
		System.out.print("Enter First Name: ");
		//get input from user and store in variable firstName
		String firstName = input.nextLine();
		
		//print to user Enter Last Name:
		System.out.print("Enter Last Name: ");
		//get input from user and store in variable lastName
		String lastName = input.nextLine();
		
		//print to user Enter Birth Month:
		System.out.print("Enter Birth Month: ");
		//get input from user and store in variable month
		int month = input.nextInt();
		
		//print to user Enter Birth Day:
		System.out.print("Enter Birth Day: ");
		//get input from user and store in variable day
		int day = input.nextInt();
		
		//print to user Enter Birth Year:
		System.out.print("Enter Birth Year: ");
		//get input from user and store in variable year
		int year = input.nextInt();
		
		//print to user Enter Height:
		System.out.print("Enter Height in Inches: ");
		//get input from user and store in variable height
		int height = input.nextInt();
		
		//print to user Enter Birth weight:
		System.out.print("Enter Weight in Pounds: ");
		//get input from user and store in variable weight
		int weight = input.nextInt();
		
		//call constructor ComputerizationOfHealthRecords
		ComputerizationOfHealthRecords computerizationOfHealthRecords = new ComputerizationOfHealthRecords(firstName, lastName, month, day, year, height, weight);
		
		//print to user First Name: firstName
		System.out.printf("\nFirst Name: %s\n", computerizationOfHealthRecords.getFirstName());
		//print to user Last Name: lastName
		System.out.printf("Last Name: %s\n", computerizationOfHealthRecords.getLastName());
		//print to user birthday formatted
		computerizationOfHealthRecords.displayDate();
		//print to user Age: age
		System.out.printf("Age: %s\n", computerizationOfHealthRecords.getAge(2019));
		//print to user Height: height
		System.out.printf("Height in Inches: %s\n", computerizationOfHealthRecords.getHeight());
		//print to user Weight: weight
		System.out.printf("Weight in Pounds: %s\n", computerizationOfHealthRecords.getWeight());
		//print to user Max Heart Rate: maxHeartRate
		System.out.printf("Max Heart Rate: %s\n", computerizationOfHealthRecords.getMaxHeartRate());
		//print to user Target Heart Rate: minTargetHeartRate - maxTargetHeartRate
		System.out.printf("Target Heart Rate: %.0f - %.0f\n", computerizationOfHealthRecords.getMinTargetHeartRate(), computerizationOfHealthRecords.getMaxTargetHeartRate());
		//print to user BMI: bmi
		System.out.printf("BMI: %.01f\n\n", computerizationOfHealthRecords.getBmi());
		
		//print to user BMI VALUES
		System.out.println("BMI VALUES");
		//Underweight: less than 18.5
		System.out.println("Underweight:\tless than 18.5");
		//Normal: between 18.5 and 24.9
		System.out.println("Normal:\t\tbetween 18.5 and 24.9");
		//Overweight: between 25 and 29.9
		System.out.println("Overweight:\tbetween 25 and 29.9");
		//Obese: 30 or greater
		System.out.println("Obese:\t\t30 or greater");
	}
}