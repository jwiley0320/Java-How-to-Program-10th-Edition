package another_dangling_else_problem;

/*
 * Jason Matthew Wiley
 * 12/20/2019
 * Another Dangling-else Problem Application
 * 
 * Modify the given code to produce the output shown in each part of the problem. Use proper 
 * indentation techniques. Make no changes other than inserting braces and changing the 
 * indentation of the code. The compiler ignores indentation in a Java program. We’ve eliminated 
 * the indentation from the given code to make the problem more challenging. [Note: It’s possible 
 * that no modification is necessary for some of the parts.]
 */

public class AnotherDanglingElseProblem
{
	public static void main(String[] args) 
	{
		int x = 5;
		int y = 8;
		
		System.out.println("Set A:\n");
		if (y == 8)
			if (x == 5)
				System.out.println("@@@@@");
			else
				System.out.println("#####");
		System.out.println("$$$$$");
		System.out.println("&&&&&");
		
		System.out.println("\nSet B:\n");
		
		if (y == 8)
		{
			if (x == 5)
			{
				System.out.println("@@@@@");
			}
		}
		else
		{
			System.out.println("#####");
			System.out.println("$$$$$");
			System.out.println("&&&&&");
		}
		
		y = 7;
		
		System.out.println("\nSet C:\n");
		
		if (y == 8)
		{
			if (x == 5)
			{
				System.out.println("@@@@@");
			}
		}
		else
		{
			System.out.println("#####");
			System.out.println("$$$$$");
			System.out.println("&&&&&");
		}
	}
}