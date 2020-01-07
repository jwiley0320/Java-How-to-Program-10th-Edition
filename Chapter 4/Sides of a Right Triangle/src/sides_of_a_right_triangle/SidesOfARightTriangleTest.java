package sides_of_a_right_triangle;

/*
 * Jason Matthew Wiley
 * 01/06/2020
 * Sides of a Right Triangle Application
 * 
 * Write an application that reads three nonzero integers and determines and prints whether 
 * they could represent the sides of a right triangle.
 */

public class SidesOfARightTriangleTest 
{
	public static void main(String[] args) 
	{
		SidesOfARightTriangle triangle = new SidesOfARightTriangle();
		
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