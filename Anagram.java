/*
* Date: 2021-09-07.
* File Name: Anagram.Java
* Author: Emelie Åslund
*
*/

package ea224qb_assign1;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;
import java.io.*;

/**
* Class Description: Print all anagrams for a word from a user input.
*
* @version 1.0 Sept 07
* @author Emelie Åslund
*/
public class Anagram {

	public static void main(String[] args) {
		String userInput = "";
		String outputString = "";
		String currentWord = "";
		String filteredWord = "";
		char charArray[];
		String sortedWord = "";
		Set<String> outputSet;
		Set<String> currentEntry;
		Map<String, Set<String>> wordMap = new HashMap<String, Set<String>>();
		
		try {
			FileReader wordFile = new FileReader("wordlist");       
			Scanner sc = new Scanner(wordFile);    //file to be scanned  
			
			while(sc.hasNextLine()) {
				currentWord = sc.nextLine(); 
				filteredWord = currentWord.replaceAll("[^a-zA-Z]", ""); // Remove non-alphabetical characters
				filteredWord = filteredWord.toLowerCase(); // Convert all words to lowercase
				
				// Sort the letters in the word into alphabetical order
				charArray = filteredWord.toCharArray();
				Arrays.sort(charArray);
				sortedWord = new String(charArray);
				
				currentEntry = wordMap.get(sortedWord);
				
				if (currentEntry == null) {
					currentEntry = new TreeSet<String>(); // Set does not already exist, create it
				}
				
				currentEntry.add(filteredWord);
				
				wordMap.put(sortedWord, currentEntry);
				//System.out.println(currentEntry);
			}
			sc.close();
			
			Scanner scannerObject = new Scanner(System.in);
			System.out.println("Enter a word: ");
			
			// Sort the letters in the word into alphabetical order
			userInput = scannerObject.next();
			charArray = userInput.toCharArray();
			Arrays.sort(charArray);
			sortedWord = new String(charArray);
			
			outputSet = wordMap.get(sortedWord);
			outputString = String.join(", ", outputSet);
			
			if (outputString == null || outputString.isEmpty()) {
				System.out.println(userInput + " has no anagrams");
			} else {
				System.out.println(userInput + " has anagrams of: " + outputString);
			}
			
			scannerObject.close();

		} catch(IOException e) {
			e.printStackTrace();  
		}  
		
	}

}
