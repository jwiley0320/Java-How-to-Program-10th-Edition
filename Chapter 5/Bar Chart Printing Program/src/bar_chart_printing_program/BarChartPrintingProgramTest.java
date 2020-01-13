package bar_chart_printing_program;

/*
 * Jason Matthew Wiley
 * 01/12/2020
 * Bar Chart Printing Program Application
 * 
 * One interesting application of computers is to display graphs and bar charts. Write an 
 * application that reads five numbers between 1 and 30. For each number that’s read, your 
 * program should display the same number of adjacent asterisks. For example, if your program 
 * reads the number 7, it should display *******. Display the bars of asterisks after you read 
 * all five numbers.
 */

public class BarChartPrintingProgramTest 
{
	public static void main(String[] args) 
	{
		BarChartPrintingProgram barChartPrintingProgram = new BarChartPrintingProgram();
		
		//counter = 1
		//repeat if counter <= 5
		//counter++
		for (int counter = 1; counter <= 5; counter++) 
		{
			//while number <= 0 || number > 30
			while (barChartPrintingProgram.getNumber() <= 0 || barChartPrintingProgram.getNumber() > 30) 
			{
				barChartPrintingProgram.setNum();
			}
			//end loop
			isNumber(barChartPrintingProgram, counter);
			barChartPrintingProgram.setNumber();
		}	
		//end loop
		
		System.out.println();
		
		//counter = 1
		//repeat if counter <= 5
		//counter++
		for (int counter = 1; counter <= 5; counter++) 
		{
			isDisplayed(barChartPrintingProgram, counter);
			System.out.println();
		}	
		//end loop
	}
	private static void isDisplayed(BarChartPrintingProgram barChartPrintingProgram, int counter) {
		switch (counter) {
		case 1:
			//print getNumber1 =
			System.out.printf("%s%4s%3s", barChartPrintingProgram.getNumber1(),"=", "");
			isStar(barChartPrintingProgram.getNumber1());
			break;
		case 2:
			//print getNumber2 =
			System.out.printf("%s%4s%3s", barChartPrintingProgram.getNumber2(),"=", "");
			isStar(barChartPrintingProgram.getNumber2());
			break;
		case 3:
			//print getNumber3 =
			System.out.printf("%s%4s%3s", barChartPrintingProgram.getNumber3(),"=", "");
			isStar(barChartPrintingProgram.getNumber3());
			break;
		case 4:
			//print getNumber4 =
			System.out.printf("%s%4s%3s", barChartPrintingProgram.getNumber4(),"=", "");
			isStar(barChartPrintingProgram.getNumber4());
			break;
		case 5:
			//print getNumber5 =
			System.out.printf("%s%4s%3s", barChartPrintingProgram.getNumber5(),"=", "");
			isStar(barChartPrintingProgram.getNumber5());
			break;
		default:
			System.out.println("An Error Occurred!");
			break;
		}
	}

	private static void isNumber(BarChartPrintingProgram barChartPrintingProgram, int counter) {
		switch (counter) 
		{
			case 1:
				barChartPrintingProgram.setNumber1(barChartPrintingProgram.getNumber());
				break;
			case 2:
				barChartPrintingProgram.setNumber2(barChartPrintingProgram.getNumber());
				break;
			case 3:
				barChartPrintingProgram.setNumber3(barChartPrintingProgram.getNumber());
				break;
			case 4:
				barChartPrintingProgram.setNumber4(barChartPrintingProgram.getNumber());
				break;
			case 5:
				barChartPrintingProgram.setNumber5(barChartPrintingProgram.getNumber());
				break;
			default:
				System.out.println("An Error Occurred!");
				break;
		}
	}
	private static void isStar(int number) {
		//counter = number1
		//repeat if counter >= 1
		//counter--
		for(int counter = number; counter >= 1; counter--) 
		{
			//print *
			System.out.print("*");
		}
		//end loop
	}
}