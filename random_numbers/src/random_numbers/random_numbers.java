package random_numbers;

import java.util.Random;

public class random_numbers {
	// Create instance of random numbers class
	Random rand = new Random();
	
	// Use method to create list of 100 random numbers
	public int[] CreateList() {
		// Create List
		int [] iList = new int[100];
		// Declare iCount as variable
		int iCount;
		// Use for loop to iterate through list
		for (iCount = 0; iCount <= 99; iCount += 1) {
			// Use Random to generate a random number for that item in the array
			iList[iCount] = rand.nextInt(99) + 1;
		}
		// Return the list
		return iList;
		
	}
	// Create a method to print out the list in order
	public void PrintList(int[] iList) {
		// Declare iCount as variable
		int iCount;
		// Describe output
		System.out.println("List of random numbers in order: ");
		// Use for loop to iterate through the list
		for (iCount = 0; iCount <= 99; iCount += 1) {
			// Print the item in the list with a space
			System.out.print(iList[iCount] + " ");
		}
	}
	// Create a method to print out the list in reverse order
	public void PrintReverse(int[] iList) {
		// Declare iCount as variable
		int iCount;
		// Describe output
		System.out.println();
		System.out.println();
		System.out.println("List of random numbers in reverse: ");
		// Use for loop to iterate through the list
		for (iCount = 99; iCount >= 0; iCount -= 1) {
			// Print the item in the list with a space
			
			System.out.print(iList[iCount] + " ");
				}
	}
	public void Repeats(int[] iList) {
		// Declare variables
		int iCountiList1, iCountiList2, iCountRepeats1, iCountRepeats2;
		// Create new array
		int [] iRepeats = new int[100];
		// Use for loop to set each item in the repeats to 0
		for (iCountRepeats1 = 0; iCountRepeats1 <= 99; iCountRepeats1 += 1) {
			iRepeats[iCountRepeats1] = 0;
		}
		// Use for loop to iterate through the list
		for (iCountiList1 = 0; iCountiList1 <= 99; iCountiList1 += 1) {
			// Nest a for loop to compare the numbers and determine if they are the same
			for (iCountiList2 = 99; iCountiList2 >= 0; iCountiList2 -= 1) {
				// Print the item in the list with a space
				 if (iList[iCountiList1] == iList[iCountiList2]) {
					 iRepeats[iCountiList1] += 1;
				 }
			}
	}
		// Describe output
		System.out.println();
		System.out.println();
		System.out.println("The amount of times each number is used.");
		System.out.println("Format: (NumberInList):(AmountOfTimesUsedInList)");
		// Use for loop to print out the new repeats array
		for (iCountRepeats2 = 0; iCountRepeats2 <= 99; iCountRepeats2 += 1) {
			System.out.print(iList[iCountRepeats2] + ":" + iRepeats[iCountRepeats2] + "|");
			}
		}
}