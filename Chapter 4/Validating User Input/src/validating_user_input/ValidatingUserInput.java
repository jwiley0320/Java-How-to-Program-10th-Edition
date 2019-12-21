package validating_user_input;

public class ValidatingUserInput 
{
	private int passes = 0;
	private int failures = 0;
	private int result;
	
	public int getPasses() {
		return passes;
	}
	public int getFailures() {
		return failures;
	}
	public int getResult() {
		return result;
	}
	public void setResult(int result) {
		if (result == 1)
			 passes = passes + 1;
		else
			 failures = failures + 1;
	}
}