package sides_of_a_right_triangle;

import java.util.Scanner;

public class SidesOfARightTriangle 
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
	private void askSide(String side) {
		//print Enter side "side":
		System.out.printf("Enter side %s: ", side);
	}
	public void getTriangle() {
		if(this.sideA > this.sideC && this.sideA > this.sideB) 
		{
			if(Math.pow(this.sideB, 2) + Math.pow(this.sideC, 2) == Math.pow(this.sideA, 2)) 
			{
				validTriangle();
			}
			else 
			{
				notTriangle();
			}
		}
		else if(this.sideB > this.sideA && this.sideB > this.sideC) 
		{
			if(Math.pow(this.sideA, 2) + Math.pow(this.sideC, 2) == Math.pow(this.sideB, 2)) 
			{
				validTriangle();
			}
			else 
			{
				notTriangle();
			}
		}
		else if(this.sideC > this.sideA && this.sideC > this.sideB) 
		{
			if(Math.pow(this.sideA, 2) + Math.pow(this.sideB, 2) == Math.pow(this.sideC, 2)) 
			{
				validTriangle();
			}
			else 
			{
				notTriangle();
			}
		}
		else 
		{
			notTriangle();
		}
	}
	private void notTriangle() {
		//print This is not a valid right triangle
		System.out.println("This is not a valid right triangle");
	}
	private void validTriangle() {
		//print This is a valid right triangle
		System.out.println("This is a valid right triangle");
	}
}