package sentence_modifier;

import java.util.Scanner;

public class sentence_modifier_main {

	public static void main(String[] args) {
		// Create instance of Scannner
		Scanner reader = new Scanner(System.in);
		// Create instance of class file
		sentence_modifier sm = new sentence_modifier();
		// Declare variable
		String sSentence;
		// Prompt user to enter in a sentence and then store that sentence in a variable
		System.out.println("Enter in your sentence: ");
		sSentence = reader.nextLine();
		// Call methods
		sm.CheckThe(sSentence);
		sSentence = sm.ReplaceE(sSentence);
		sSentence = sm.MakeUppercase(sSentence);
		sm.PrintLength(sSentence);
		sm.PrintNewSentence(sSentence);
	}

}
