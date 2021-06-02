package remove_vowels;

public class remove_vowels {
	
	// Use method to remove vowels in the sentence
	public String RemoveVowels(String sSentence){
		// Declare integer variables
		int iLength, iCount1, iCount2;
		// Create array for vowels
		char[] cVowels = new char[5];
		// Add vowels to the array
		cVowels[0] = 'a';
		cVowels[1] = 'e';
		cVowels[2] = 'i';
		cVowels[3] = 'o';
		cVowels[4] = 'u';
		// Convert sentence to lower case
		String sSentenceLower = sSentence.toLowerCase();
		iLength = sSentence.length();
		// Use for loop to iterate through the sentence
		for (iCount1 = 0; iCount1 < iLength; iCount1 += 1) {
			char cLetter = sSentenceLower.charAt(iCount1);
			// Use for loop to iterate through the vowels
			for (iCount2 = 0; iCount2 < 5; iCount2 += 1) {
				// Compare the letter in the sentence to the vowel
				if (cLetter == cVowels[iCount2]) {
					sSentence = sSentence.replace((sSentence.charAt(iCount1)), '*');
				}
			}
		}
		// return the sentence
		return sSentence;
		
	}
	

}
