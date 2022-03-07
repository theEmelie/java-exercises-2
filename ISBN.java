/*
* Date: 2021-09-03.
* File Name: TextProcessor.Java
* Author: Emelie Åslund
*
*/

package ea224qb_assign1;
import java.util.Scanner;

/**
* Class Description: This class calculates the last digit of an ISBN-10 number. 
*
* @version 1.0 Sept 03
* @author Emelie Åslund
*/
public class ISBN {
	
	public static void main(String[] args) {
		Scanner scannerObject = new Scanner(System.in); 
	    System.out.println("Enter the first 9 digits of an ISBN as integer:");
   
	    int userInput = scannerObject.nextInt();
	    
	    // Character format to take 9 digits and leading 0's.
	    String isbn = String.format("%09d", userInput);
	    int sum = Integer.parseInt(String.valueOf(isbn.charAt(0)))*1 
	    		+ Integer.parseInt(String.valueOf(isbn.charAt(1)))*2
	    		+ Integer.parseInt(String.valueOf(isbn.charAt(2)))*3
	    		+ Integer.parseInt(String.valueOf(isbn.charAt(3)))*4
	    		+ Integer.parseInt(String.valueOf(isbn.charAt(4)))*5
	    		+ Integer.parseInt(String.valueOf(isbn.charAt(5)))*6
	    		+ Integer.parseInt(String.valueOf(isbn.charAt(6)))*7
	    		+ Integer.parseInt(String.valueOf(isbn.charAt(7)))*8
	    		+ Integer.parseInt(String.valueOf(isbn.charAt(8)))*9;
	    int checkSum = sum % 11;
	    
	    // If the checksum is 10 the last ISBN digit will be X
	    if (checkSum == 10) {
	    	isbn = isbn + "X";
	    } else {
	    	isbn = isbn + checkSum;
	    }
	    
	    System.out.println("The ISBN-10 number is: " + isbn);

	    scannerObject.close();
	}
}