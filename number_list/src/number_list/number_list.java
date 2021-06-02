package number_list;

import java.util.Scanner;

public class number_list {
	// Create instance of scanner
	Scanner reader = new Scanner(System.in);
	
	// Create method to read in numbers to create the list of numbers using an array
	public int[] CreateList() {
			// Create new array
			int [] iList = new int[10];
			// Declare iCount as variable
			int iCount;
			// Use for loop to iterate through list
			for (iCount = 0; iCount <= 9; iCount += 1) {
				// Prompt user for number
				System.out.println("Enter in a number: ");
				iList[iCount] = reader.nextInt();
			}
			// Return the list
			return iList;
	}
	// Create method to print the original list
	public void PrintList(int[] iList) {
		// Declare iCount as variable
		int iCount;
		// Describe output
		System.out.println("Here is the original list: ");
		// Use for loop to iterate through list
		for (iCount = 0; iCount <= 9; iCount += 1) {
			// Print out the list using proper formatting
			System.out.print(iList[iCount] + " ");
		}
	}
	// Create a method to print out all the numbers above 20
	public void Above20(int [] iList) {
		// Declare iCount as variable
		int iCount;
		// Describe output
		System.out.println();
		System.out.println("Here are the numbers in your list that are above 20: ");
		// Use for loop to iterate through list
		for (iCount = 0; iCount <= 9; iCount += 1) {
			// Use if statement to determine if number is above 20
			if (iList[iCount] > 20) {
				// Print out the list using proper formatting
				System.out.print(iList[iCount] + " ");
			}
		}
	}
	// Create a method to print out all the numbers above 20
	public void Below10(int [] iList) {
		// Declare iCount as variable
		int iCount;
		// Describe output
		System.out.println();
		System.out.println("Here are the numbers in your list that are below 10: ");
		// Use for loop to iterate through list
		for (iCount = 0; iCount <= 9; iCount += 1) {
			// Use if statement to determine if number is below 10
			if (iList[iCount] < 10) {
				// Print out the list using proper formatting
				System.out.print(iList[iCount] + " ");
			}
		}
	}
}

