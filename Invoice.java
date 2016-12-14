/**
 * @author Dhanish Ashraf
 * The class invoice implements Measurable.
 *
 */
public class Invoice implements Measurable{
	
	private String accountNumber;
	private String sortCode;
	private double amount;
	
	/** This constructor creates an invoice using three parts; accountNumber, sortCode and amount
	 * @param accountNumber A string to represent the account Number.
	 * @param sortCode A string to represent the sort code
	 * @param amount The total amount the invoice will charge
	 */
	public Invoice(String accountNumber, String sortCode, double amount){
		
		this.accountNumber = accountNumber;
		this.sortCode = sortCode;
		this.amount = amount;
	}
	
	/** A setter for the amount the invoice will charge
	 * @param amount The new amount the invoice will charge
	 */
	public void setAmount(double amount){
		this.amount = amount;
	}
	
	/** A getter for the amount the invoice will charge
	 * @return The amount of the invoice as type double
	 */
	public double getAmount(){
		return amount;
	}
	
	/** Also a getter for the amount.
	 * @return the getAmount() getter which returns the amount of the invoice
	 */
	public double amount(){ 
		return getAmount();
	}
	
	/** Refers to the public method signature, getMeasure(), in the interface Measurable 
	 * @return the amount
	 */
	public double getMeasure(){
		return this.amount;
	}

}
