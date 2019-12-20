package target_heart_rate_calculator;

public class TargetHeartRateCalculator 
{
	private String firstName;
	private String lastName;
	private int month;
	private int day;
	private int year;
	private int age;
	private int maxHeartRate;
	
	public TargetHeartRateCalculator(String firstName, String lastName, int month, int day, int year) 
	{
		this.firstName = firstName;
		this.lastName = lastName;
		this.month = month;
		this.day = day;
		this.year = year;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		this.day = day;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public int getAge(int currentYear) 
	{
		age = currentYear - year;	
		return age;
	}
	public int getMaxHeartRate()
	{
		maxHeartRate = 220 - age;
		return maxHeartRate;
	}
	public double getMinTargetHeartRate() 
	{
		double minTargetHeartRate = .50 * maxHeartRate;
		return minTargetHeartRate;
	}
	public double getMaxTargetHeartRate() 
	{
		double maxTargetHeartRate = .85 * maxHeartRate;
		return maxTargetHeartRate;
	}
	public void displayDate() 
	{
		System.out.printf("Birth Date: %s/%s/%s\n", month, day, year);
	}
}