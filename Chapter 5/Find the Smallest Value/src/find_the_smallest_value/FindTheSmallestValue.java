package find_the_smallest_value;

import java.util.Scanner;

public class FindTheSmallestValue 
{
	Scanner input = new Scanner(System.in);
	
	int timesRun = 0;
	String timesRunS;
	String num;
	int number;
	int smallestNumber;
	
	
	public int getSmallestNumber() {
		return smallestNumber;
	}
	public void setSmallestNumber() {
		if(this.number  < this.smallestNumber) 
		{
			this.smallestNumber = this.number;
		}
	}
	public int getNumber() {
		return number;
	}
	public void setNum(int counter) {
		//print Enter a value (counter): 
		System.out.printf("Enter value %s: ", counter);
		//get input from user and store in variable num
		num = input.next();
		
		isNum(counter);
		isSmallestNumber(counter);
	}
	private void isSmallestNumber(int counter) {
		if(counter  == 1) 
		{
			this.smallestNumber = this.number;
		}
	}
	private void isNum(int counter) {
		try 
		{
			this.number = Integer.parseInt(num);
		}
		catch (Exception e) 
		{
			setNum(counter);
		}
	}
	public int getTimesRun() {
		return timesRun;
	}
	public void setTimesRunS() {
		//print to user Enter a positive value: 
		System.out.print("Enter a positive value: ");
		//get input from user and store in variable timesRunS
		this.timesRunS = input.next();
		
		isTimesRun();
	}
	private void isTimesRun() {
		try 
		{
			if(Integer.parseInt(timesRunS) > 0) 
			{
				timesRun = Integer.parseInt(timesRunS);
			}		
		}
		catch (Exception e) 
		{
			timesRun = 0;
		}
	}
}