/*
* Date: 2021-09-03.
* File Name: TextProcessor.Java
* Author: Emelie Åslund
*
*/

package ea224qb_assign1;
import java.util.Scanner;

/**
* Class Description: This class takes a user input and change the letters.
* i.e. 'a' becomes 'b', 'b' becomes 'c' etc. Also makes all vowels uppercase.
* 
* @version 1.0 Sept 03
* @author Emelie Åslund
*/
public class TextProcessor {

	public static void main(String[] args) {
		Scanner scannerObject = new Scanner(System.in);
		
		String outputString = "";
		String userInput = "";
		
		System.out.println("Type a line of text: ");
		userInput = scannerObject.nextLine();
			
		for (int i = 0; i < userInput.length(); i++) {
			switch(userInput.charAt(i)) {
				case 'a':
					outputString += 'b';
					break;
				case 'A':
					outputString += 'B';
					break;
				case 'b':
					outputString += 'c';
					break;
				case 'B':
					outputString += 'C';
					break;
				case 'c':
					outputString += 'd';
					break;
				case 'C':
					outputString += 'D';
					break;
				case 'd':
					outputString += 'E';
					break;
				case 'D':
					outputString += 'E';
					break;
				case 'e':
					outputString += 'f';
					break;
				case 'E':
					outputString += 'F';
					break;
				case 'f':
					outputString += 'g';
					break;
				case 'F':
					outputString += 'G';
					break;
				case 'g':
					outputString += 'h';
					break;
				case 'G':
					outputString += 'H';
					break;
				case 'h':
					outputString += 'I';
					break;
				case 'H':
					outputString += 'I';
					break;
				case 'i':
					outputString += 'j';
					break;
				case 'I':
					outputString += 'J';
					break;
				case 'j':
					outputString += 'k';
					break;
				case 'J':
					outputString += 'K';
					break;
				case 'k':
					outputString += 'l';
					break;
				case 'K':
					outputString += 'L';
					break;
				case 'l':
					outputString += 'm';
					break;
				case 'L':
					outputString += 'M';
					break;
				case 'm':
					outputString += 'n';
					break;
				case 'M':
					outputString += 'N';
					break;
				case 'n':
					outputString += 'O';
					break;
				case 'N':
					outputString += 'O';
					break;
				case 'o':
					outputString += 'p';
					break;
				case 'O':
					outputString += 'P';
					break;
				case 'p':
					outputString += 'q';
					break;
				case 'P':
					outputString += 'Q';
					break;
				case 'q':
					outputString += 'r';
					break;
				case 'Q':
					outputString += 'R';
					break;
				case 'r':
					outputString += 's';
					break;
				case 'R':
					outputString += 'S';
					break;
				case 's':
					outputString += 't';
					break;
				case 'S':
					outputString += 'T';
					break;
				case 't':
					outputString += 'U';
					break;
				case 'T':
					outputString += 'U';
					break;
				case 'u':
					outputString += 'v';
					break;
				case 'U':
					outputString += 'V';
					break;
				case 'v':
					outputString += 'y';
					break;
				case 'V':
					outputString += 'Y';
					break;
				case 'w':
					outputString += 'x';
					break;
				case 'W':
					outputString += 'X';
					break;
				case 'x':
					outputString += 'y';
					break;
				case 'X':
					outputString += 'Y';
					break;
				case 'y':
					outputString += 'z';
					break;
				case 'Y':
					outputString += 'Z';
					break;
				case 'z':
					outputString += 'A';
					break;
				case 'Z':
					outputString += 'A';
					break;
				default:
					outputString += userInput.charAt(i);
			}
		}
		
		System.out.println(outputString);
		scannerObject.close();

	}

}
