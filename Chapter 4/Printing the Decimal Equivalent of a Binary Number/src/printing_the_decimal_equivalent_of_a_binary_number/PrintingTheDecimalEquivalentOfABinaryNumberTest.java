package printing_the_decimal_equivalent_of_a_binary_number;

/*
 * Jason Matthew Wiley
 * 01/02/2020
 * Printing the Decimal Equivalent of a Binary Number Application
 * 
 * Write an application that inputs an integer containing only 0s and 1s (i.e., a binary integer) 
 * and prints its decimal equivalent. [Hint: Use the remainder and division operators to pick off 
 * the binary number’s digits one at a time, from right to left. In the decimal number system, 
 * the rightmost digit has a positional value of 1 and the next digit to the left a positional 
 * value of 10, then 100, then 1000, and so on. The decimal number 234 can be interpreted as 
 * 4 * 1 + 3 * 10 + 2 * 100. In the binary number system, the rightmost digit has a positional 
 * value of 1, the next digit to the left a positional value of 2, then 4, then 8, and so on.
 * The decimal equivalent of binary 1101 is 
 * 1 * 1 + 0 * 2 + 1 * 4 + 1 * 8, or 1 + 0 + 4 + 8 or, 13.]
 */

public class PrintingTheDecimalEquivalentOfABinaryNumberTest 
{
	public static void main(String[] args) 
	{		
		//declared variables
		int v1 = 1;
		int v2 = 10;
		
		PrintingTheDecimalEquivalentOfABinaryNumber binary = new PrintingTheDecimalEquivalentOfABinaryNumber();
		
		binary.setNumber();
		
		//counter = 1
		//repeat if counter <= numbers length
		//counter++
		for(int counter = 1; counter <= Integer.toString(binary.getNumber()).length(); counter++) 
		{
			binary.setBinaryNumber(v1, v2);
		
			if(binary.getBinaryNumber() == 0 || binary.getBinaryNumber() == 1)
			{
				binary.setBinaryTotal(counter);
				v1 *= v2;
			}
			else
			{
				counter = 1;
				v1 = 1;
				binary.setNumber();
			}
		}
		//end loop
		
		//print Binary Total: binaryTotal
		System.out.printf("\nBinary Total: %s", binary.getBinaryTotal());
	}
}