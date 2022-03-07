/*
* Date: 2021-09-10.
* File Name: ArraysMain.Java
* Author: Emelie Åslund
*
*/

package ea224qb_assign1;

public class ArraysMain {

	public static void main(String[] args) {
		int[] d1 = {1, 5, 10, 5, 4};	
		int[] d2 = {1, 2, 3, 4, 5};
		int[] d3 = {6, 79, -12, 1, 56, 32, 11};
		int[] d4 = {1, 2, 3, 4, 5};	
		int[] d5 = {3, 4, 5};
		int[] d6 = {2, 3, 5};
		int[] d7 = {1, 2, 3, 4, 5, 3, 6, 7};
		int[] d8 = {1, 2, 3, 4, 5, 2, 3};
		int[] d9 = {1, 2};
		int[] d10 = {1, 1, 1, 1, 1};
		
		// Test to see the average of fixed numbers
		int ave = Arrays.average(d1);
		System.out.println("The average of 1, 5, 7, 8, 4 is: " + ave);
		
		System.out.println("------------------------------");
		
		// Test to see the max value
		int maxValue = Arrays.max(d1);
		System.out.println("Max value of 1, 5, 7, 8, 4 is: " + maxValue);
		
		System.out.println("------------------------------");
		
		// Add 2 onto each number in the array
		System.out.println("Before adding 2 to each element: " + Arrays.toString(d2));
		int[] addNum = Arrays.addN(d2, 2);
		System.out.println("After adding 2 to each element: " + Arrays.toString(addNum));
		
		System.out.println("------------------------------");
		
		// Reverse order of the array, leaving original unchanged
		System.out.println("Before reversing the order: " + Arrays.toString(d2));
		int[] revArr = Arrays.reverse(d2);
		System.out.println("After reversing the order: " + Arrays.toString(revArr));
		System.out.println("Showing original array unchanged: " + Arrays.toString(d2));
		
		System.out.println("------------------------------");
		
		// Replace a number with another number
		System.out.println("Before replacing 10 with 9: " + Arrays.toString(d1));
		Arrays.replaceAll(d1, 10, 9);
		System.out.println("After replacing 10 with 9: " + Arrays.toString(d1));
		
		System.out.println("------------------------------");
		
		// Sort the array
		System.out.println("Before sorting the array: " + Arrays.toString(d3));
		Arrays.sort(d3);
		System.out.println("After sorting the array: " + Arrays.toString(d3));
		
		System.out.println("------------------------------");
		
		// Match different arrays
		boolean matchString = Arrays.hasSubString(d4, d5);
		System.out.println("Is " + Arrays.toString(d5) + " contained within " + Arrays.toString(d4) + ": " + matchString);
		
		matchString = Arrays.hasSubString(d4, d6);
		System.out.println("Is " + Arrays.toString(d6) + " contained within " + Arrays.toString(d4) + ": " + matchString);
		
		matchString = Arrays.hasSubString(d7, d5);
		System.out.println("Is " + Arrays.toString(d5) + " contained within " + Arrays.toString(d7) + ": " + matchString);
		
		matchString = Arrays.hasSubString(d8, d6);
		System.out.println("Is " + Arrays.toString(d6) + " contained within " + Arrays.toString(d8) + ": " + matchString);
		
		matchString = Arrays.hasSubString(d9, d4);
		System.out.println("Is " + Arrays.toString(d4) + " contained within " + Arrays.toString(d9) + ": " + matchString);
		
		System.out.println("------------------------------");
		
		// Get the absolute different 
		int[] diffArray = Arrays.absDif(d10, d4);
		System.out.println("Absolute difference between " + Arrays.toString(d10) + " and " + Arrays.toString(d4) + " is: " + Arrays.toString(diffArray));
		
		diffArray = Arrays.absDif(d4, d10);
		System.out.println("Absolute difference between " + Arrays.toString(d4) + " and " + Arrays.toString(d10) + " is: " + Arrays.toString(diffArray));
 			
		try {
			System.out.println("This will throw a handled exception due to mismatch arrays: Absolute difference between " + Arrays.toString(d8) + " and " + Arrays.toString(d10));
			diffArray = Arrays.absDif(d9, d10);
		} catch (UnsupportedOperationException e) {
			System.out.println(e);
		}
		
	}

}
