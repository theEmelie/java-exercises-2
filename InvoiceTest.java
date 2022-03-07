/*
* Date: 2021-09-09.
* File Name: InvoiceTest.Java
* Author: Emelie Åslund
*
*/

package ea224qb_assign1;

/**
* Class Description: This class does simple testing on the class Invoice
*
* @version 1.0 Sept 09
* @author Emelie Åslund
*/
public class InvoiceTest {

	public static void main(String[] args) {
		Invoice invoice = new Invoice();
		
		// Set all variables with values
		invoice.setPartNumber("An item");
		invoice.setPartDescription("Yellow and Blue");
		invoice.setItemQuantity(5);
		invoice.setPricePerItem(9.99);
		
		System.out.println("getPartNumber is: "      + invoice.getPartNumber());
		System.out.println("getPartDescription is: " + invoice.getPartDescription());
		System.out.println("getItemQuantity is: "    + invoice.getItemQuantity());
		System.out.println("getPricePerItem is: "    + invoice.getPricePerItem());
		System.out.println("getInvoiceAmount is: "   + invoice.getInvoiceAmount());
		System.out.println("-------------------------------------------------");
		
		// Test getPartNumber (Positive result)
		if (invoice.getPartNumber().equals("An item")) {
			System.out.println("1. Test Passed for getPartNumber(), tested: An item");
		} else {
			System.out.println("1. Test did not pass for getPartNumber(), tested: An item");
		}
		
		// Test getPartNumber (Negative result)
		if (invoice.getPartNumber().equals("AN items")) {
			System.out.println("2. Test Passed for getPartNumber(), tested: AN items");
		} else {
			System.out.println("2. Test did not pass for getPartNumber(), tested: AN items");
		}
			
		// Test getPartDescription (Positive result)
		if (invoice.getPartDescription().equals("Yellow and Blue")) {
			System.out.println("3. Test Passed for getPartDescription(), tested: Yellow and Blue");
		} else {
			System.out.println("3. Test did not pass for getPartDescription(), tested: Yellow and Blue");
		}
		
		// Test getPartDescription (Negative result)
		if (invoice.getPartDescription().equals("Red and Green")) {
			System.out.println("4. Test Passed for getPartDescription(), tested: Red and Green");
		} else {
			System.out.println("4. Test did not pass for getPartDescription(), tested: Red and Green");
		}
		
		// Test getItemQuantity (Positive result)
		if (invoice.getItemQuantity() == 5) {
			System.out.println("5. Test Passed for getItemQuantity(), tested: 5)");
		} else {
			System.out.println("5. Test did not pass for getItemQuantity(), tested: 5)");
		}
		
		// Test getItemQuantity (Negative result)
		if (invoice.getItemQuantity() == 75) {
			System.out.println("6. Test Passed for getItemQuantity(), tested: 75");
		} else {
			System.out.println("6. Test did not pass for getItemQuantity(), tested: 75");
		}
		
		// Test getPricePerItem (Positive result)
		if (invoice.getPricePerItem() == 9.99) {
			System.out.println("7. Test Passed for getPricePerItem(), tested: 9.99");
		} else {
			System.out.println("7. Test did not pass for getPricePerItem(), tested: 9.99");
		}
		
		// Test getPricePerItem (Negative result)
		if (invoice.getPricePerItem() == 8.98) {
			System.out.println("8. Test Passed for getPricePerItem(), tested: 8.98");
		} else {
			System.out.println("8. Test did not pass for getPricePerItem(), tested: 8.98");
		}
		
		// Test getInvoiceAmount (Positive result)
		if (invoice.getInvoiceAmount() == 49.95) {
			System.out.println("9. Test Passed for getInvoiceAmount(), tested: 49.95");
		} else {
			System.out.println("9. Test did not pass for getInvoiceAmount(), tested: 49.95");
		}
		
		// Test getInvoiceAmount (Negative result)
		if (invoice.getInvoiceAmount() == 99.99) {
			System.out.println("10. Test Passed for getInvoiceAmount(), tested: 99.99");
		} else {
			System.out.println("10. Test did not pass for getInvoiceAmount(), tested: 99.99");
		}
	
	}
}
