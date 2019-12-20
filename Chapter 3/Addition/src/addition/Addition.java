package addition;

import javax.swing.JOptionPane;

/*
 * Jason Matthew Wiley
 * 12/13/2019
 * Addition Application
 * 
 * Addition program that inputs two numbers then displays their sum.
 */

public class Addition 
{
	public static void main(String[] args) 
	{
		//stored variables _number1, _number2, _sum
		int _number1, _number2, _sum;
		
		//prompt user in dialog box to Enter a number:
		String _number = JOptionPane.showInputDialog("Enter a number: ");
		//store user input from dialog box in variable _number1
		_number1 = Integer.parseInt(_number);
		
		//prompt user in dialog box to Enter a number:
		_number = JOptionPane.showInputDialog("Enter a number: ");
		//store user input from dialog box in variable _number2
		_number2 = Integer.parseInt(_number);
		
		//calculate _number1 + _number2 and store in variable _sum
		_sum = _number1 + _number2;
		
		//store message Sum: _number1 + _number2 = _sum
		String message = String.format("Sum: %s + %s = %s", _number1, _number2, _sum);
		
		//display message in dialog box
		JOptionPane.showMessageDialog(null, message);
	}
}