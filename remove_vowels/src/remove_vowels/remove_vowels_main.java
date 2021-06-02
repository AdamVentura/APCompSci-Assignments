package remove_vowels;

import java.util.Scanner;

public class remove_vowels_main {
	public static void main(String[] args) {
		// Create instance of class file
		remove_vowels rv = new remove_vowels();
		// Create instance of Scanner
		Scanner reader = new Scanner(System.in);
		// Declare sentence as variable
		String sSentence;
		// Prompt user to enter in a sentence
		System.out.println("Enter in a sentence: ");
		// Read in the sentence
		sSentence = reader.nextLine();
		// Call the remove vowels function
		String sNewSentence = rv.RemoveVowels(sSentence);
		// Print the new sentence
		System.out.println("Your new sentence: " + sNewSentence);
	}

}
