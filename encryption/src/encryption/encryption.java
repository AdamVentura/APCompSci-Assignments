package encryption;

import java.util.Scanner;

public class encryption {
	// Create instance of Scanner
		Scanner reader = new Scanner(System.in);
			
	// Create method to read message
	public String GetMessage() {
		// declare variables
		String sMessage;
		// Prompt user for input
		System.out.println("Enter your message: ");
		sMessage = reader.nextLine();
		// return message
		return sMessage;
	}
	
	// Create method to convert the alphabet to an array of characters
	public char[] ConvertAlphabet() {
		// Create string of alphabet
		String sAlphabet = "abcdefghijklmnopqrstuvxyz";
		// Make alphabet array
		char[] cLetters = new char[26];
		// Use for loop to convert the string of letters into an array
		int iCount;
		for (iCount = 0; iCount < 25; iCount += 1) {
			char cLetter = sAlphabet.charAt(iCount);
			cLetters[iCount] = cLetter;
		}
		return cLetters;
		
		
	}
	
	
	// Create method to encrypt the message
	public String EncryptMessage(String sMessage, char[] cAlphabet){
		// Declare variables
		int iCount1, iCount2, iCount3;
		String sEncryptedMessage = "";
		// Convert message to lowercase
		sMessage = sMessage.toLowerCase();
		// find the amount of letters in the message
		int iMessageLength = sMessage.length();
		// Create instance of encrypted message array
		char[] cEncryptedMessage = new char[iMessageLength];
		// Use for loop to change the letters in the message with the letter in the alphabet that is 5 down
		for (iCount1 = 0; iCount1 < iMessageLength; iCount1 += 1) {
			// Iterate through the letters in the message
			char cLetter = sMessage.charAt(iCount1);
			// Nest a for loop to iterate through the alphabet
			for (iCount2 = 0; iCount2 < 25; iCount2 += 1) {
				// if the character is a space
				if (cLetter ==  ' ') {
					// Add a space to the encrypted message
					cEncryptedMessage[iCount1] = ' ';
				}
				// determine the letter it is
				if (cLetter == cAlphabet[iCount2]) {
					// If it's within 5 of the last letter use the letter 20 letters back
					if (iCount2 >= 20) {
						cEncryptedMessage[iCount1] = cAlphabet[(iCount2 - 20)];
					}
					// if it's one of the first 21 letters use the letter 5 ahead
					else {
						cEncryptedMessage[iCount1] = cAlphabet[(iCount2 + 5)];
					}
				}
			}
		
	}
		// Use for loop to convert the characters of the encrypted message back to a string
		for (iCount3 = 0; iCount3 < iMessageLength; iCount3 += 1) {
			sEncryptedMessage = sEncryptedMessage + cEncryptedMessage[iCount3];
		}
		return sEncryptedMessage;
	}
	// Create method to print the encrypted message	
	public void PrintEncryptedMessage(String sEncryptedMessage) {
		System.out.println("Your encrypted message: \n" + sEncryptedMessage);
	}

}
