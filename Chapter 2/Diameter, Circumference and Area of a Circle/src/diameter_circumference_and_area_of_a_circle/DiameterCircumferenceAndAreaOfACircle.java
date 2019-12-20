package diameter_circumference_and_area_of_a_circle;

import java.util.Scanner;

/*
 * Jason Matthew Wiley
 * 12/11/2019
 * Diameter, Circumference and Area of a Circle Application
 * 
 * Here’s a peek ahead. In this chapter, you learned about integers and the type int. 
 * Java can also represent floating-point numbers that contain decimal points, such as 
 * 3.14159. Write an application that inputs from the user the radius of a circle as an 
 * integer and prints the circle’s diameter, circumference and area using the 
 * floating-point value 3.14159 for PI. Use the techniques shown in Fig. 2.7. [Note: 
 * You may also use the predefined constant Math.PI for the value of PI. This constant 
 * is more precise than the value 3.14159. Class Math is defined in package java.lang. 
 * Classes in that package are imported automatically, so you do not need to import class 
 * Math to use it.] Use the following formulas (r is the radius):
 * 
 * diameter = 2r 
 * circumference = 2PIr 
 * area = PIr2
 * 
 * Do not store the results of each calculation in a variable. Rather, specify each 
 * calculation as the value that will be output in a System.out.printf statement. The 
 * values produced by the circumference and area calculations are floating-point numbers. 
 * Such values can be output with the format specifier %f in a System.out.printf statement. 
 * You’ll learn more about floating-point numbers in Chapter 3.
 */

public class DiameterCircumferenceAndAreaOfACircle 
{
	public static void main(String[] args) 
	{
		//device to input data
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		//variable _radius
		int _radius;
		
		//print to user Enter radius:
		System.out.print("Enter radius: ");
		//get input from user and store it in _radius
		_radius = input.nextInt();
		
		//print to user Diameter: 2 * _raduis
		System.out.printf("\nDiameter: %s\n", 2 * _radius);
		//print to user Circumference: 2 * PI * _raduis
		System.out.printf("Circumference: %.02f\n", 2 * Math.PI * _radius);
		//print to user Area: Pi * _radius * _raduis
		System.out.printf("Area: %.02f", Math.PI * (_radius * _radius));
	}
}