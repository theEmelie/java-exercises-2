/*
* Date: 2021-09-09.
* File Name: Invoice.Java
* Author: Emelie 흒lund
*
*/

package ea224qb_assign1;


/**
* Class Description: This class represent an invoice for an item that is sold at a store.
*
* @version 1.0 Sept 09
* @author Emelie 흒lund
*/
public class Invoice {
	String partNumber;
	String partDescription;
	Integer itemQuantity;
	Double pricePerItem;
	public String getPartNumber;
	
	/**
	* Method Description: This method sets fixed values to invoice variables
	*
	* @author Emelie 흒lund
	*/
	public Invoice() {
		partNumber = "";
		partDescription = "";
		itemQuantity = 0;
		pricePerItem = 0.0;
	}
	
	/**
	* Method Description: This method let the user set their own values to the invoice variables
	* @param pn  part number of item
	* @param pd  description of item
	* @param iq  number of items
	* @param ppi the price of an item
	*
	* @author Emelie 흒lund
	*/
	public Invoice(String pn, String pd, int iq, double ppi) {
		partNumber = pn;
		partDescription = pd;
		itemQuantity = iq;
		pricePerItem = ppi;
	}
	
	/**
	* Method Description: This method gets the part number for an item.
	*
	* @author Emelie 흒lund
	*/
	public String getPartNumber() {
		return partNumber;
	}
	
	/**
	* Method Description: This method sets the part number of an item.
	*
	* @author Emelie 흒lund
	* @param pn part number of item
	*/
	public void setPartNumber(String pn) {
		partNumber = pn;
	}
	
	/**
	* Method Description: This method gets the part description for an item..
	*
	* @author Emelie 흒lund
	*/
	public String getPartDescription() {
		return partDescription;
	}
	
	/**
	* Method Description: This method sets the part description of an item.
	*
	* @author Emelie 흒lund
	* @param pd description of item
	*/
	public void setPartDescription(String pd) {
		partDescription = pd;
		
	}
	
	/**
	* Method Description: This method gets the item quantity for an item.
	*
	* @author Emelie 흒lund
	*/
	public int getItemQuantity() {
		return itemQuantity;
	}
	
	/**
	* Method Description: This method sets the item quantity for an item, if negative set to 0.
	*
	* @author Emelie 흒lund
	* @param iq number of items
	*/
	public void setItemQuantity(int iq) {
		if (itemQuantity < 0) {
			itemQuantity = 0;
		} else {
			itemQuantity = iq;
		}
	}
	
	/**
	* Method Description: This method gets the price for an item.
	*
	* @author Emelie 흒lund
	*/
	public double getPricePerItem() {
		return pricePerItem;
	}
	
	/**
	* Method Description: This method sets the price for an item, if negative set to 0.0.
	*
	* @author Emelie 흒lund
	* @param ppi the price of an item
	*/
	public void setPricePerItem(double ppi) {
		 if (pricePerItem < 0) {
			pricePerItem = 0.0;
		 } else {
			 pricePerItem = ppi;
		 }
	}
	
	/**
	* Method Description: This method get the total amount of the invoice.
	*
	* @author Emelie 흒lund
	*/
	public double getInvoiceAmount() {
		double sum = itemQuantity * pricePerItem;
		return sum;
	}

}
