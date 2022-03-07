/*
* Date: 2021-09-03.
* File Name: TextProcessor.Java
* Author: Emelie Åslund
*
*/

package ea224qb_assign1;
import java.util.Scanner;

/**
* Class Description: This class takes a user input (guess) and iterate through the Babylonian algorithm until the guess is within 1% of the previous guess.
*
* @version 1.0 Sept 03
* @author Emelie Åslund
*/
public class SquareRoot {

	public static void main(String[] args) {
		Scanner scannerObject = new Scanner(System.in);
		
		double guess = 0.0;
		double previousGuess = 0.0;
		double r = 0.0;
		double diff = 0.0;
		
		System.out.println("This program estimates square roots.");
		System.out.println("Enter an integer to estimate the square root of: ");
		
		int userInt = scannerObject.nextInt(); 
		double n = userInt; // Convert n into a double
		guess = n / 2.0;
		
		do {
			// Babylonian algorithm
			previousGuess = guess;
			r = n / guess;
			guess = (guess + r) / 2.0;
			
			System.out.println(guess);
			
			// Calculate the difference between previous guess and current guess.
			diff = (previousGuess - guess) / guess;
			
		} while(diff > 0.01);
		
		// Close the Scanner object
		scannerObject.close();
	}

}
