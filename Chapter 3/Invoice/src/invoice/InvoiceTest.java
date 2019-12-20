package invoice;

/*
 * Jason Matthew Wiley
 * 12/14/2019
 * Invoice Application
 * 
 * Create a class called Invoice that a hardware store might use to represent an invoice 
 * for an item sold at the store. An Invoice should include four pieces of information as 
 * instance variables—a part number (type String), a part description (type String), a 
 * quantity of the item being purchased (type int) and a price per item (double). Your 
 * class should have a constructor that initializes the four instance variables. Provide 
 * a set and a get method for each instance variable. In addition, provide a method named 
 * getInvoiceAmount that calculates the invoice amount (i.e., multiplies the quantity by 
 * the price per item), then returns the amount as a double value. If the quantity is not 
 * positive, it should be set to 0. If the price per item is not positive, it should be 
 * set to 0.0. Write a test app named InvoiceTest that demonstrates class Invoice’s 
 * capabilities.
 */

public class InvoiceTest 
{
	public static void main(String[] args) 
	{
		Invoice invoice = new Invoice("123", "Hammer", 2, 17.23);
		
		//print to user Part Number: partNumber
		System.out.printf("Part Number: %s\n", invoice.getPartNumber());
		//print to user Part Description: partDescription
		System.out.printf("Part Description: %s\n", invoice.getPartDescription());
		//print to user Quantity: quantity
		System.out.printf("Quantity: %s\n", invoice.getQuantity());
		//print to user Price per Item: pricePerItem
		System.out.printf("Price Per Item: $%.02f\n", invoice.getPricePerItem());
		//print to user Invoice Amount: invoiceAmount
		System.out.printf("Invoice Amount: $%.02f", invoice.getInvoiceAmount());
	}
}