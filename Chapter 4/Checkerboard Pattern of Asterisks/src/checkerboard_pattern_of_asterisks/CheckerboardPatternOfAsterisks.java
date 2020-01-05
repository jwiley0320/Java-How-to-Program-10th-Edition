package checkerboard_pattern_of_asterisks;

public class CheckerboardPatternOfAsterisks
{
	public void setAstrisk() {
		//counter2 = 1
		//repeat if counter <= 8
		//counter++
		for(int counter = 1; counter <= 8; counter++) 
		{
			//print *
			System.out.print("* ");
		}
		//end loop
	}
	public void setSpace(int counter) {
		//if counter % 2 == 0
		if(counter % 2 == 0) 
		{
			//print space
			System.out.print(" ");
		}
	}
}