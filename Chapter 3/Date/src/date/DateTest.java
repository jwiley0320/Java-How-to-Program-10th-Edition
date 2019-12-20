package date;

/*
 * Jason Matthew Wiley
 * 12/14/2019
 * Date Application
 * 
 * Create a class called Date that includes three instance variables—a month (type int), 
 * a day (type int) and a year (type int). Provide a constructor that initializes the 
 * three instance variables and assumes that the values provided are correct. Provide a 
 * set and a get method for each instance variable. Provide a method displayDate that 
 * displays the month, day and year separated by forward slashes (/). Write a test app 
 * named DateTest that demonstrates class Date’s capabilities. 
 */

public class DateTest 
{
	public static void main(String[] args) 
	{
		Date date = new Date(14, 12, 2019);
		
		date.displayDate();
	}
}