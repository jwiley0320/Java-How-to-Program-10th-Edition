package negative_positive_and_zero_values;

/*
 * Jason Matthew Wiley
 * 12/12/2019
 * Negative, Positive and Zero Values Application
 * 
 * Write a program that inputs five numbers and determines and prints the number of 
 * negative numbers input, the number of positive numbers input and the number of zeros 
 * input.
 */
public class NegativePositiveAndZeroValues 
{
	public static void main(String[] args) 
	{
		//declared variables _number1, _number2, _number3, _number4, _number5 = Random
		int _number1 = 2;
		int _number2 = 5;
		int _number3 = 0;
		int _number4 = -2;
		int _number5 = -25;
		//declared variables _positive, _negative, _zeros = 0
		int _positive = 0;
		int _negative = 0;
		int _zeros = 0;
		
		
		//determine _number1 > 0
		if(_number1 > 0)
			//add to _positive 1
			_positive++;
		//determine _number1 < 0
		else if(_number1 < 0)
			//add to _negative 1
			_negative++;
		//determine _number1 == 0
		else if(_number1 == 0)
			//add to _zeros 1
			_zeros++;
		
		//determine _number2 > 0
		if(_number2 > 0)
			//add to _positive 1
			_positive++;
		//determine _number2 < 0
		if(_number2 < 0)	
			//add to _negative 1
			_negative++;
		//determine _number2 == 0
		if(_number2 == 0)
			//add to _zeros 1
			_zeros++;
		
		//determine _number3 > 0
		if(_number3 > 0)
			//add to _positive 1
			_positive++;
		//determine _number3 < 0
		if(_number3 < 0)
			//add to _negative 1
			_negative++;
		//determine _number3 == 0
		if(_number3 == 0)
			//add to _zeros 1
			_zeros++;
		
		//determine _number4 > 0
		if(_number4 > 0)
			//add to _positive 1
			_positive++;
		//determine _number4 < 0
		if(_number4 < 0)
			//add to _negative 1
			_negative++;
		//determine _number4 == 0
		if(_number4 == 0)
			//add to _zeros 1
			_zeros++;
		
		//determine _number5 > 0
		if(_number5 > 0)
			//add to _positive 1
			_positive++;
		//determine _number5 < 0
		if(_number5 < 0)
			//add to _negative 1
			_negative++;
		//determine _number5 == 0
		if(_number5 == 0)
			//add to _zeros 1
			_zeros++;
		
		//print to user Positive: _positive
		System.out.printf("Positive: %s\n", _positive);
		//print to user Negative: _negative
		System.out.printf("Negative: %s\n", _negative);
		//print to user zeros: _zeros
		System.out.printf("Zeros: %s", _zeros);
	}
}