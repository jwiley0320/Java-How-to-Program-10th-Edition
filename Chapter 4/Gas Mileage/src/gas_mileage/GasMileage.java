package gas_mileage;

public class GasMileage 
{
	private int milesDriven = 0;
	private int gallonsUsed = 0;
	
	
	public int getMilesDriven() {
		return milesDriven;
	}
	public void setMilesDriven(int milesDriven) {
		this.milesDriven += milesDriven;
	}
	public int getGallonsUsed() {
		return gallonsUsed;
	}
	public void setGallonsUsed(int gallonsUsed) {
		this.gallonsUsed += gallonsUsed;
	}
	public double getMilesPerGallon() 
	{
		double milesPerGallon = 0; 
		
		milesPerGallon = (double)milesDriven / (double)gallonsUsed;
		return milesPerGallon;
	}
}