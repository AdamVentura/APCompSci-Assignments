package animals;

import java.util.Scanner;

public class cow {
	// Declare instance variables
	int[] iAges = new int[2];
	String[] sNames = new String[2];
	// Create instance of Scanner
	Scanner reader = new Scanner(System.in);
	// Use method to read in the name and age of two cows
	public void SetInfo() {
		int iCount;
		// Use for loop to iterate through the arrays
		for(iCount = 0; iCount < 2; iCount += 1) {
			// Prompt user to enter in the age of the cow and add to array
			System.out.println("Enter in the age of cow " + (iCount + 1) + ".");
			iAges[iCount] = reader.nextInt();
			// Prompt user to enter in the name of the cow and add to array
			System.out.println("Enter in the name of cow " + (iCount + 1) + ".");
			sNames[iCount] = reader.next();
		}
	}
	
	// Use method to print the names of the cows over 5
	public void FindInfo() {
		int iCount;
		// Use for loop to iterate through the ages of the cows
		for(iCount = 0; iCount < 2; iCount += 1) {
			// If the cow's age is over 5
			if (iAges[iCount] > 5) {
				// Print the name of the cow
				System.out.println(sNames[iCount]);
			}
		}
		
	}
	
	// Use method to print moo
	public void speak() {
		// print moo
		System.out.println("Moo!");
	}
}
