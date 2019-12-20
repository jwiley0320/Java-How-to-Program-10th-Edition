package largest_and_smallest_integers;

/*
 * Jason Matthew Wiley
 * 12/11/2019
 * Largest and Smallest Integers Application
 * 
 * Write an application that reads five integers and determines and prints the largest 
 * and smallest integers in the group. Use only the programming techniques you learned 
 * in this chapter. 
*/

public class LargestAndSmallestIntegers 
{
	public static void main(String[] args) 
	{
		//declared variables _number1, _number2, _number3, _number4, _number5
		int _number1 = 10;
		int _number2 = 5;
		int _number3 = 65;
		int _number4 = 72;
		int _number5 = 101;
		
		//determine _number1 > _number2 and _number1 > _number3 and _number1 > _number4 and _number1 > _number5
		if(_number1 > _number2 && _number1 > _number3 && _number1 > _number4 && _number1 > _number5)
			//print to user Largest: _number1
			System.out.printf("Largest: %s\n", _number1);			
		//determine _number2 > _number1 and _number2 > _number3 and _number2 > _number4 and _number2 > _number5
		else if(_number2 > _number1 && _number2 > _number3 && _number2 > _number4 && _number2 > _number5)
			//print to user Largest: _number2
			System.out.printf("Largest: %s\n", _number2);
		//determine _number3 > _number2 and _number3 > _number1 and _number3 > _number4 and _number3 > _number5
		else if(_number3 > _number2 && _number3 > _number1 && _number3 > _number4 && _number3 > _number5)
			//print to user Largest: _number3
			System.out.printf("Largest: %s\n", _number3);
		//determine _number4 > _number2 and _number4 > _number3 and _number4 > _number1 and _number4 > _number5
		else if(_number4 > _number2 && _number4 > _number3 && _number4 > _number1 && _number4 > _number5)
			//print to user Largest: _number4
			System.out.printf("Largest: %s\n", _number4);
		//determine _number5 > _number2 and _number5 > _number3 and _number5 > _number4 and _number5 > _number1
		else if(_number5 > _number2 && _number5 > _number3 && _number5 > _number4 && _number5 > _number1)
			//print to user Largest: _number5
			System.out.printf("Largest: %s\n", _number5);
		
		//determine _number1 < _number2 and _number1 < _number3 and _number1 < _number4 and _number1 < _number5
		if(_number1 < _number2 && _number1 < _number3 && _number1 < _number4 && _number1 < _number5)
			//print to user Smallest: _number1
			System.out.printf("Smallest: %s", _number1);	
		//determine _number2 < _number1 and _number2 < _number3 and _number2 < _number4 and _number2 < _number5
		else if(_number2 < _number1 && _number2 < _number3 && _number2 < _number4 && _number2 < _number5)
			//print to user Smallest: _number2
			System.out.printf("Smallest: %s", _number2);	
		//determine _number3 < _number2 and _number3 < _number1 and _number3 < _number4 and _number3 < _number5
		else if(_number3 < _number2 && _number3 < _number1 && _number3 < _number4 && _number3 < _number5)
			//print to user Smallest: _number3
			System.out.printf("Smallest: %s", _number3);
		//determine _number4 < _number2 and _number4 < _number3 and _number4 < _number1 and _number4 < _number5
		else if(_number4 < _number2 && _number4 < _number3 && _number4 < _number1 && _number4 < _number5)
			//print to user Smallest: _number4
			System.out.printf("Smallest: %s", _number4);	
		//determine _number5 < _number2 and _number5 < _number3 and _number5 < _number4 and _number5 < _number1
		else if(_number5 < _number2 && _number5 < _number3 && _number5 < _number4 && _number5 < _number1)
			//print to user Smallest: _number5
			System.out.printf("Smallest: %s", _number5);
	}
}