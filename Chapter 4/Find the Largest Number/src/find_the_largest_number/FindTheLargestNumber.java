package find_the_largest_number;

public class FindTheLargestNumber 
{
	private int largestNumber = 0;

	public int getLargestNumber() {
		return largestNumber;
	}
	public void setLargestNumber(int largestNumber) {
		if(largestNumber > this.largestNumber)
			this.largestNumber = largestNumber;
	}
}
