package gas_mileage;

import java.util.Scanner;

/*
 * Jason Matthew Wiley
 * 12/18/2019
 * Gas Mileage Application
 * 
 * a) Read the problem statement.
 * b) Formulate the algorithm using pseudocode and top-down, stepwise refinement.
 * c) Write a Java program.
 * d) Test, debug and execute the Java program.
 * e) Process three complete sets of data.
 * 
 * Drivers are concerned with the mileage their automobiles get. One driver has kept track 
 * of several trips by recording the miles driven and gallons used for each tankful. 
 * Develop a Java application that will input the miles driven and gallons used (both as 
 * integers) for each trip. The program should calculate and display the miles per gallon 
 * obtained for each trip and print the combined miles per gallon obtained for all trips 
 * up to this point. All averaging calculations should produce floating-point results. 
 * Use class Scanner and sentinel-controlled repetition to obtain the data from the user.
 */

public class GasMileageTest 
{
	public static void main(String[] args) 
	{
		//device to input data from user
		Scanner input = new Scanner(System.in);
		
		//driver objects
		GasMileage gasMileage1 = new GasMileage();
		GasMileage gasMileage2 = new GasMileage();
		GasMileage gasMileage3 = new GasMileage();
		
		//stored variables
		boolean isRunning = true;
		
		//loop through 3 customers
		for(int counter = 1; counter <= 3; counter++) 
		{
			while(isRunning) 
			{
				int milesDriven = askMilesDriven(input, counter);
				
				while(milesDriven <= 0 && milesDriven != -1) 
				{
					milesDriven = askMilesDriven(input, counter);
				}
				System.out.println();
				if( milesDriven > 0) 
				{	
					int gallonsUsed = askGallonsUsed(input, counter);

					while(gallonsUsed <= 0 || gallonsUsed >= milesDriven) 
					{
						gallonsUsed = askGallonsUsed(input, counter);
					}

					if(gallonsUsed > 0) 
					{
						setDriverValues(gasMileage1, gasMileage2, gasMileage3, counter, milesDriven, gallonsUsed);
					}
				}
				isRunning = applicationState(isRunning, milesDriven);
				System.out.println();
			}
			isRunning = true;
			setMilesPerGallonDriverValues(gasMileage1, gasMileage2, gasMileage3, counter);
		}
		//end loop
	}
	private static void setMilesPerGallonDriverValues(GasMileage gasMileage1, GasMileage gasMileage2, GasMileage gasMileage3, int counter) 
	{
		switch (counter) 
		{
			case 1:
				printMilesPerGallon(gasMileage1, counter);
				break;
			case 2:
				printMilesPerGallon(gasMileage2, counter);
				break;
			case 3:
				printMilesPerGallon(gasMileage3, counter);
				break;
		}
	}
	private static void printMilesPerGallon(GasMileage gasMileage1, int counter) 
	{
		System.out.printf("Miles Per Gallon for driver %s: %.02f\n\n", counter, gasMileage1.getMilesPerGallon());
	}
	private static void setDriverValues(GasMileage gasMileage1, GasMileage gasMileage2, GasMileage gasMileage3, int counter, int milesDriven, int gallonsUsed) 
	{
		switch (counter) 
		{
		case 1:
			calculateValues(gasMileage1, milesDriven, gallonsUsed);
			break;
		case 2:
			calculateValues(gasMileage2, milesDriven, gallonsUsed);
			break;
		case 3:
			calculateValues(gasMileage3, milesDriven, gallonsUsed);
			break;
		}
	}
	private static void calculateValues(GasMileage gasMileage1, int milesDriven, int gallonsUsed)
	{
		gasMileage1.setMilesDriven(milesDriven);
		gasMileage1.setGallonsUsed(gallonsUsed);
	}
	private static boolean applicationState(boolean isRunning, int milesDriven) 
	{
		if(milesDriven == -1) 
		{
			isRunning = false;
		}
		return isRunning;
	}
	private static int askGallonsUsed(Scanner input, int counter)
	{
		//print gallonsUsed
		System.out.printf("Enter gallons used for driver %s: ", counter);
		//input gallonsUsed
		int gallonsUsed = input.nextInt();
		return gallonsUsed;
	}
	private static int askMilesDriven(Scanner input, int counter) 
	{
		//print milesDriven
		System.out.printf("Enter -1 to quit or Enter miles driven for driver %s: ", counter);
		//input milesDriven
		int milesDriven = input.nextInt();
		return milesDriven;
	}
}