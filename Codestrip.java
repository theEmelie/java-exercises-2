/*
* Date: 2021-09-08.
* File Name: Codestrip.Java
* Author: Emelie Åslund
*
*/

package ea224qb_assign1;
import java.util.Scanner;
import java.io.*;

/**
* Class Description: This class removes blank lines and comments of all kinds.
*
* @version 1.0 Sept 08
* @author Emelie Åslund
*/
public class Codestrip {

	public static void main(String[] args) {
		String fileName = "";
		int codeLines = 0;
		int blankLinesRemoved = 0;
		int commentsRemoved = 0;
		boolean inMultilineComment = false;
		
		try {
			Scanner scannerObject = new Scanner(System.in);
			System.out.println("Enter the name of a Java file (eg. helloWorld.java): ");
			fileName = scannerObject.next();
			
			FileReader javaFile = new FileReader(fileName);       
			Scanner sc = new Scanner(javaFile);
 
		
			while (sc.hasNextLine()) {
				String currentLine = sc.nextLine();
				
				// Identifies lines with strings containing // as comments (eg. https://).
				// Code with comments at the end of the line will also be removed. 
				if (currentLine.isBlank()) {
					// Remove blank lines (empty lines and lines with only white space)
					blankLinesRemoved++;
				
				} else if (currentLine.contains("//")) {
					// Remove single line comment
					commentsRemoved++;
				
				} else if (currentLine.contains("/*")) {
					// Identify the start of a multiline comment
					inMultilineComment = true;
					
				} else if (inMultilineComment) {
					// Looking for end of multiline comment
					if (currentLine.contains("*/")) {
						// Remove multiline comment
						commentsRemoved++;
						inMultilineComment = false;
					}
				
				} else {
					System.out.println(currentLine);
					codeLines++;
				}
			}
			
			System.out.println("Number of actual lines of code: " + codeLines);
			System.out.println("Number of blank lines removed: " + blankLinesRemoved);
			System.out.println("Number of comments removed: " + commentsRemoved);
			
			scannerObject.close();
			sc.close();

		} catch(IOException e) {
			e.printStackTrace();  
		}
	}

}
