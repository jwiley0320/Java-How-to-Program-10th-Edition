package body_mass_index_calculator;

import java.util.Scanner;

/*
 * Jason Matthew Wiley
 * 12/12/2019
 * Body Mass Index Calculator Application
 * 
 * The formula for calculating BMI:
 * 
 * BMI = (wieghtPounds * 703) / (hieghtInches * hieghtInches)
 * 
 * Create a BMI calculator that reads the user’s weight in pounds and height in inches 
 * (or, if you prefer, the user’s weight in kilograms and height in meters), then 
 * calculates and displays the user’s body mass index. Also, display the following 
 * information from the Department of Health and Human Services/National Institutes of 
 * Health so the user can evaluate his/her BMI:
 * 
 * BMI VALUES
 * Underweight: less than 18.5
 * Normal: between 18.5 and 24.9
 * Overweight: between 25 and 29.9
 * Obese: 30 or greater
 */
public class BodyMassIndexCalculator 
{
	public static void main(String[] args) 
	{
		//device to input data
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		//stored variables _hieght, _weight, _bmi
		double _height, _weight, _bmi;
		
		//print to user Enter height in inches:
		System.out.print("Enter height in inches: ");
		//get data from user and store in variable _height
		_height = input.nextDouble();
		
		//print to user Enter weight in pounds:
		System.out.print("Enter weight in pounds: ");
		//get data from user and store in variable _weight
		_weight = input.nextDouble();
		
		//calculate (_weight * 703) / (_height * _height) and store in variable _bmi
		_bmi = (_weight * 703) / (_height * _height);
		
		//print to user BMI: _bmi
		System.out.printf("\nBMI: %.01f\n\n", _bmi);
		
		//print to user BMI VALUES
		System.out.println("BMI VALUES");
		//print to user Underweight: less than 18.5
		System.out.println("Underweight:\t\tless than 18.5");
		//print to user Normal: between 18.5 and 24.9
		System.out.println("Normal:\t\t\tbetween 18.5 and 24.9");
		//print to user Overweight: between 25 and 29.9
		System.out.println("Overweight:\t\tbetween 25 and 29.9");
		//print to user Obese: 30 or greater 
		System.out.print("Obese:\t\t\t30 or greater");
	}
}