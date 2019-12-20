package invoice;

public class Invoice 
{
	private String partNumber;
	private String partDescription;
	private int quantity;
	private double pricePerItem;
	
	public Invoice(String partNumber, String partDescription, int quantity, double pricePerItem) 
	{
		this.partNumber = partNumber;
		this.partDescription = partDescription;
		if(quantity >= 0)
			this.quantity = quantity;
		else
			quantity = 0;
		if(pricePerItem >= 0.0)
			this.pricePerItem = pricePerItem;
		else
			pricePerItem = 0.0;
	}
	public String getPartNumber() 
	{
		return partNumber;
	}
	public void setPartNumber(String partNumber) 
	{
		this.partNumber = partNumber;
	}
	public String getPartDescription() 
	{
		return partDescription;
	}
	public void setPartDescription(String partDescription) 
	{
		this.partDescription = partDescription;
	}
	public int getQuantity() 
	{
		return quantity;
	}
	public void setQuantity(int quantity) 
	{
		if(quantity >= 0)
			this.quantity = quantity;
		else
			quantity = 0;
	}
	public double getPricePerItem() 
	{
		return pricePerItem;
	}
	public void setPricePerItem(double pricePerItem) 
	{
		if(pricePerItem >= 0.0)
			this.pricePerItem = pricePerItem;
		else
			pricePerItem = 0.0;
	}
	public double getInvoiceAmount() 
	{
		double invoiceAmount = quantity * pricePerItem;
		return invoiceAmount;
	}
}