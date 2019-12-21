package find_the_two_largest_numbers;

public class FindTheTwoLargestNumbers 
{
	private int largestNumber;
	private int secondLargestNumber;
	
	public int getLargestNumber() {
		return largestNumber;
	}
	public void setLargestNumber(int largestNumber) {
		if(largestNumber > this.largestNumber) 
		{
			this.secondLargestNumber = this.largestNumber;
			this.largestNumber = largestNumber;
		}
		else if(largestNumber > this.secondLargestNumber && largestNumber < this.largestNumber) 
		{
			this.secondLargestNumber = largestNumber;
		}
	}
	public int getSecondLargestNumber() {
		return secondLargestNumber;
	}
}