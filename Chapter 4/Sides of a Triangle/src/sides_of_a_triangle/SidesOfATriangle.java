package sides_of_a_triangle;

import java.util.Scanner;

public class SidesOfATriangle 
{
	Scanner input = new Scanner(System.in);
	
	int sideA = 0;
	int sideB = 0;
	int sideC = 0;
	
	public int getSideA() {
		return sideA;
	}
	public void setSideA() {
		askSide("A");
		//get input from user and store in sideA variable
		this.sideA = input.nextInt();
	}
	private void askSide(String side) {
		//print Enter side "side":
		System.out.printf("Enter side %s: ", side);
	}
	public int getSideB() {
		return sideB;
	}
	public void setSideB() {
		askSide("B");
		//get input from user and store in sideB variable
		this.sideB = input.nextInt();
	}
	public int getSideC() {
		return sideC;
	}
	public void setSideC() {
		askSide("C");
		//get input from user and store in sideC variable
		this.sideC = input.nextInt();
	}
	public void getTriangle() {
		if(this.sideA + this.sideB > this.sideC) 
		{
			if(this.sideA + this.sideC > this.sideB)
			{
				if(this.sideB + this.sideC > this.sideA) 
				{
					System.out.println("This is a valid triangle");
				}
				else 
				{
					System.out.println("This is not a valid triangle");
				}
			}
			else 
			{
				System.out.println("This is not a valid triangle");
			}
		}
		else 
		{
			System.out.println("This is not a valid triangle");
		}
	}
}