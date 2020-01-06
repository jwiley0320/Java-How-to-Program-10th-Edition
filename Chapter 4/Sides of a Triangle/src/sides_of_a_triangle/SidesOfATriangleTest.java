package sides_of_a_triangle;

/*
 * Jason Matthew Wiley
 * 01/06/2020
 * Sides of a Triangle Application
 * 
 * Write an application that reads three nonzero values entered by the user and determines and 
 * prints whether they could represent the sides of a triangle.
 */
public class SidesOfATriangleTest 
{
	public static void main(String[] args) 
	{
		
		SidesOfATriangle triangle = new SidesOfATriangle();
	
		//repeat if sideA <= 0
		while(triangle.getSideA() <= 0) 
		{
			triangle.setSideA();
		}
		//end loop
		System.out.println();
		//repeat if sideB <= 0
		while (triangle.getSideB() <= 0)
		{
			triangle.setSideB();
		}
		//end loop
		System.out.println();
		//repeat if sideC <= 0
		while(triangle.getSideC() <= 0) 
		{
			triangle.setSideC();
		}
		//end loop
		System.out.println();
		
		triangle.getTriangle();
	}
}