package sentence_modifier;

public class sentence_modifier {
	
	// Use method to check to see if the word the is in the sentence
	public void CheckThe(String sSentence) {
		// Create a lowercase version of the sentence
		String sSentenceLower = sSentence.toLowerCase();
		// Get the sentence length
		int iLength = sSentence.length();
		// Declare variables
		int iCount, iOccurrences = 0;
		// Iterate through letters in sentence
		for (iCount = 0; iCount < iLength; iCount += 1) {
			// Store the current character as 
			char cLetter = sSentenceLower.charAt(iCount);
			// Check to see if there is a t, the first letter of 'the'
			if (iOccurrences == 0) {
				if (cLetter == 't' ) {
					// If there is, add 1 to occurrences
					iOccurrences += 1;
				}
			}
			else {
				// If it's not reset iOccurences to 0
				iOccurrences = 0;
			}
			// If the letter t is the letter before this letter
			if (iOccurrences == 1) {
				// and if the current letter is h
				if (cLetter == 'h') {
					// Add another occurrence
					iOccurrences += 1;
				}
				else {
					// If not, reset occurrences to 0
					iOccurrences = 0;
				}
			}
			// If the letters 'th' are before this letter
			if (iOccurrences == 2) {
				// and this letter is an 'e'
				if (cLetter == 'e') {
					// Print out that 'the' is in the sentence and break out of the loop
					System.out.println("Yes, there is a the in the sentence.");
					break;
				}
				else {
					// if not, set occurrences to 0
					iOccurrences = 0;
				}
					
			}
		}
		// If the loop is done and iOccurences = 0, there was no the in the sentence
		if (iOccurrences == 0) {
			System.out.println("There was no the in the sentence.");
		}
		
	
	}
	
	// Use method to replace e's with a's
	public String ReplaceE(String sSentence) {
		// Use replace method to replace all e's with a's
		sSentence = sSentence.replace('e', 'a');
		// return the new sentence
		return sSentence;
	}
	
	// Use method to make the sentence upper case
	public String MakeUppercase(String sSentence){
		// Use the toUpperCase method to convert the sentence to upper case
		sSentence = sSentence.toUpperCase();
		// Return the new sentence
		return sSentence;
	}
	
	// Use method to print out the length of the sentence
	public void PrintLength(String sSentence) {
		// Use the length method to get the length of the sentence
		int iLength = sSentence.length();
		// Print the length
		System.out.println("The sentence is " + iLength + " characters long.");
		
		
	}
	
	// Use method to print the new sentence
	public void PrintNewSentence(String sSentence) {
		System.out.println("Your new sentence: " + sSentence);
	}
}
