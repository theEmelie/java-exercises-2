/*
* Date: 2021-09-10/14.
* File Name: Arrays.Java
* Author: Emelie 흒lund
*
*/

package ea224qb_assign1;

/**
* Class Description: This class contains several static methods that is about arrays.
*
* @version 1.0 Sept 07
* @author Emelie 흒lund
*/
public class Arrays {

	/**
	* Method Description: This method returns the average of the elements in the array (arr).
	*
	* @author Emelie 흒lund
	*/
	public static int average(int[] arr) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum = sum + arr[i];
		}
		return sum / arr.length;
	}
	
	/**
	* Method Description: This method returns the array element with the highest value in array (arr).
	*
	* @author Emelie 흒lund
	*/
	public static int max(int[] arr) {
		int highestValue = Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) {
			if (highestValue < arr[i]) {
				highestValue = arr[i];
			}
		}
		return highestValue;
	}

	/**
	* Method Description: This method returns an array where a number (n) has been added to all elements in the array (arr).
	*
	* @author Emelie 흒lund
	*/
	public static int[] addN(int[] arr, int n) {
		for (int i = 0; i < arr.length; i++) {
			arr[i] = arr[i] + n;
		}
		return arr;
	}
	
	/**
	* Method Description: This method creates and returns a new array with all the elements in array (arr) but in reverse order.
	*
	* @author Emelie 흒lund
	*/
	public static int[] reverse(int[] arr) {
		int[] rev = new int[arr.length];
		
		for (int i = 0; i < arr.length; i++) {
			rev[arr.length - i - 1] = arr[i];
		}
		return rev;
	}
	
	/**
	* Method Description: This method replaces all occurrences of the element old with new in the array (arr).
	*
	* @author Emelie 흒lund
	*/
	public static void replaceAll(int[] arr, int old, int nw) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == old) {
				arr[i] = nw;
			}
		}
	}
	
	/**
	* Method Description: This method returns a new sorted array with the smallest element first.
	*
	* @author Emelie 흒lund
	*/
	public static int[] sort(int[] arr) {
		int temp = 0;
		
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 0; j < arr.length - 1 - i; j++) {	
				if (arr[j] > arr[j + 1]) {
					// Swap elements
					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
		
		return arr;
	}
	
	/**
	* Method Description: This method returns true if the array sub is a part of the array arr, otherwise false.
	*
	* @author Emelie 흒lund
	*/
	public static boolean hasSubString(int[] arr, int[] sub) {
		boolean match = false;
		
		for (int i = 0; (i < arr.length - sub.length + 1) && match == false; i++) {
			if (arr[i] == sub[0]) {
				match = true;
				for (int j = 0; j < sub.length - 1; j++) {
					if (sub[j + 1] != arr[i + j + 1]) {
						match = false;
					}
				}
			}
		}
		return match;
	}
	
	/**
	* Method Description: This method returns a new array that is the absolute difference between array arr1 and array arr2.
	*
	* @author Emelie 흒lund
	*/
	public static int[] absDif(int[] arr1, int[] arr2) {
		int[] diffArr = new int[arr1.length];
		
		if (arr1.length != arr2.length) {
			throw new UnsupportedOperationException("Arrays are different sizes!");
		}
		for (int i = 0; i < arr1.length; i++) {
			diffArr[i] = Math.abs(arr1[i] - arr2[i]);
		}
		return diffArr;
	}
	
	/**
	* Method Description: This method makes it possible to print a readable array element.
	*
	* @author Emelie 흒lund
	*/
	public static String toString(int[] arr) {
		String s = "{";
		boolean first = true;
		
		for (int i = 0; i < arr.length; i++) {
			if (!first) {
				s += ", ";
			} else {
				first = false;
			}
			s += arr[i];
		}
		s += "}";
		return s;
	}
}
