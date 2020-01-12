package triangle_printing_program;

/*
 * Jason Matthew Wiley
 * 01/12/2020
 * Triangle Printing Program Application
 * 
 * Write an application that displays the following patterns separately, one below the other. Use 
 * for loops to generate the patterns. All asterisks (*) should be printed by a single statement 
 * of the form System.out.print('*'); which causes the asterisks to print side by side. A 
 * statement of the form System.out.println(); can be used to move to the next line. A statement 
 * of the form System.out.print(' '); can be used to display a space for the last two patterns. 
 * There should be no other output statements in the program. [Hint: The last two patterns 
 * require that each line begin with an appropriate number of blank spaces.] 
 */

public class TrianglePrintingProgramTest 
{
	public static void main(String[] args)
	{
		TrianglePrintingProgram trianglePrintingProgram  = new TrianglePrintingProgram();
		TrianglePrintingProgram trianglePrintingProgram2 = new TrianglePrintingProgram(1, 1);
		TrianglePrintingProgram trianglePrintingProgram3 = new TrianglePrintingProgram(1, 10);
		TrianglePrintingProgram trianglePrintingProgram4 = new TrianglePrintingProgram(10, 1);
		
		setSet("A");	
		//counter = 1
		//repeat if counter <= 10
		//counter++
		for(int counter = 1; counter <= 10; counter++) 
		{
			isStar(trianglePrintingProgram);
			
			System.out.println();
			trianglePrintingProgram.subStar();			
		}
		//end loop
		
		System.out.println();
		setSet("B");
		//counter = 1
		//repeat if counter <= 10
		//counter++
		for(int counter = 1; counter <= 10; counter++) 
		{
			isStar(trianglePrintingProgram2);
			
			System.out.println();
			trianglePrintingProgram2.addStar();
		}
		//end loop
		
		System.out.println();
		setSet("C");
		//counter = 1
		//repeat if counter <= 10
		//counter++
		for(int counter = 1; counter <= 10; counter++) 
		{	
			isSpace(trianglePrintingProgram3);
			isStar(trianglePrintingProgram3);
			
			System.out.println();
			trianglePrintingProgram3.subSpace();
			trianglePrintingProgram3.addStar();
		}
		//end loop
		
		System.out.println();
		setSet("D");
		//counter = 1
		//repeat if counter <= 10
		//counter++
		for(int counter = 1; counter <= 10; counter++) 
		{	
			isSpace(trianglePrintingProgram4);
			isStar(trianglePrintingProgram4);
					
			System.out.println();
			trianglePrintingProgram4.addSpace();
			trianglePrintingProgram4.subStar();
		}
		//end loop
	}
	private static void isSpace(TrianglePrintingProgram trianglePrintingProgram) {
		//spaces = space
		//repeat if spaces > 10
		//spaces++
		for(int spaces = trianglePrintingProgram.getSpace(); spaces < 10; spaces++) 
		{
			//print " "
			System.out.print(" ");
		}
		//end loop
	}
	private static void isStar(TrianglePrintingProgram trianglePrintingProgram) {
		//stars = star
		//repeat if stars <= 10
		//stars++
		for(int stars = trianglePrintingProgram.getStar(); stars <= 10; stars++) 
		{
			//print *
			System.out.print("*");
		}
		//end loop
	}
	private static void setSet(String set) {
		//print Set (set):
		System.out.printf("Set %s:\n\n", set);
	}
}