package enforcing_privacy_with_cryptography;

import java.util.Scanner;

public class EnforcingPrivacyWithCryptography 
{
	Scanner input = new Scanner(System.in);
	
	String number = "-1";
	int number1;
	int number2;
	int number3;
	int number4;
	
	int swap1;
	int swap2;
	int swap3;
	int swap4;
	
	public int getSwap1() {
		return swap1;
	}
	public void setSwap1() {
		this.swap1 = this.number3;
	}
	public int getSwap2() {
		return swap2;
	}
	public void setSwap2() {
		this.swap2 = this.number4;
	}
	public int getSwap3() {
		return swap3;
	}
	public void setSwap3() {
		this.swap3 = this.number1;
	}
	public int getSwap4() {
		return swap4;
	}
	public void setSwap4() {
		this.swap4 = this.number2;
	}
	public int getNumber1() {
		return number1;
	}
	public void setNumber1(char number1) {
		String number = Character.toString(number1);
		try {
			Integer.parseInt(number);
			
			if(true) 
			{
				this.number1 = Integer.parseInt(number);
				calculateNewNumber1();
			}
		} catch (Exception e) {
			this.number1 = 0;
			calculateNewNumber1();
		};
	}
	private void calculateNewNumber1() {
		this.number1 = (7 + this.number1) % 10;
	}
	public int getNumber2() {
		return number2;
	}
	public void setNumber2(char number2) {
		String number = Character.toString(number2);
		try {
			Integer.parseInt(number);
			
			if(true) 
			{
				this.number2 = Integer.parseInt(number);
				calculateNewNumber2();
			}
		} catch (Exception e) {
			this.number2 = 0;
			calculateNewNumber2();
		};
	}
	private void calculateNewNumber2() {
		this.number2 = (7 + this.number2) % 10;
	}
	public int getNumber3() {
		return number3;
	}
	public void setNumber3(char number3) {
		String number = Character.toString(number3);
		try {
			Integer.parseInt(number);
			
			if(true) 
			{
				this.number3 = Integer.parseInt(number);
				calculateNewNumber3();
			}
		} catch (Exception e) {
			this.number3 = 0;
			calculateNewNumber3();
		};
	}
	private void calculateNewNumber3() {
		this.number3 = (7 + this.number3) % 10;
	}
	public int getNumber4() {
		return number4;
	}
	public void setNumber4(char number4) {
		String number = Character.toString(number4);
		try {
			Integer.parseInt(number);
			
			if(true) 
			{
				this.number4 = Integer.parseInt(number);
				calculateNewNumber4();
			}
		} catch (Exception e) {
			this.number4 = 0;
			calculateNewNumber4();
		};
	}
	private void calculateNewNumber4() {
		this.number4 = (7 + this.number4) % 10;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber() {
		//print Enter a four digit number:
		System.out.print("Enter a four digit number: ");
		//get data from user and store in variable number
		this.number = input.next();
	}
}