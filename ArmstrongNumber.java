/*
* Date: 2021-09-03.
* File Name: TextProcessor.Java
* Author: Emelie Åslund
*
*/

package ea224qb_assign1;
import java.util.Scanner;

/**
* Class Description: This class checks if a number is an Armstrong number, and if so, print it.
*
* @version 1.0 Sept 03
* @author Emelie Åslund
*/
public class ArmstrongNumber {

	public static void main(String[] args) {
		Scanner scannerObject = new Scanner(System.in);
		int startNumber = 0;
		int endNumber = 0;
		boolean armstrong = false;
		boolean repeat = true;
		char yn;
	    
		// Until the user types 'N' when asked 'Do you want to repeat?' this will keep looping
		// Typing 'N' will set the variable 'repeat' to false which ends the loop
		do {
			System.out.println("Enter the starting number of the range: ");
			startNumber = scannerObject.nextInt();
			System.out.println("Enter the ending number of the range: ");
			endNumber = scannerObject.nextInt();	
	    
		    System.out.println("The Armstrong numbers between the given range are: ");
		    
		    // Loop through the start to end number, call the isArmstrong function
		    // and print only the Armstrong numbers
		    for (int i = startNumber; i <= endNumber; i++) {
			    armstrong = isArmstrong(i);
			    
			    if (armstrong) {
			    	System.out.println(i);
			    }
		    }
		    
		    do {
			    System.out.println("Do you want to repeat? (Y/N): ");
			    yn = scannerObject.next().charAt(0);

			    if (yn == 'N') {
			    	repeat = false;
			    }
			    
		    } while (yn != 'Y' && yn != 'N');
		    
		} while (repeat);
		
		scannerObject.close();
	}
	
	/**
	* Method Description: This function checks if a number is an Armstrong number or not.
	*
	* @version 1.0 Sept 03
	* @author Emelie Åslund
	*/
	public static boolean isArmstrong(int num) {
		int numOfDigits = String.valueOf(num).length();
		int sum = 0;
	    String testNum = String.format("%d", num);
	    
	    // Loop through the digits and sum the nth power of its digits 
	    // where n is the total number of digits
	    for (int i = 0; i < numOfDigits; i++) {
	    	int digit = Integer.parseInt(String.valueOf(testNum.charAt(i)));
	    	sum += Math.pow(digit, numOfDigits);
	    }
	    
	    // Return false or true depending if it is an Armstrong number or not.
	    if (sum != num) {
	    	return false;
	    } else {
	    	return true;
	    }
	}
}
