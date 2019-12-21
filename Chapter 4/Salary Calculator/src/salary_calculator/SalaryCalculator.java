package salary_calculator;

public class SalaryCalculator 
{
	private String name;
	private double hoursWorked;
	private double salary;
	private double grossPay = 0.0;
	private double overtime = 0.0;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getHoursWorked() {
		return hoursWorked;
	}
	public void setHoursWorked(double hoursWorked) {
		if(hoursWorked > 40) 
		{
			overtime = hoursWorked - 40;
			this.hoursWorked = 40;
		}
		else 
		{
			this.hoursWorked = hoursWorked;
		}
	}
	public double getOvertime() {
		return overtime;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public double getGrossPay() {
		grossPay = overtime * (salary / 2 + salary);
		grossPay = (salary * hoursWorked) + grossPay;
		return grossPay;
	}
}