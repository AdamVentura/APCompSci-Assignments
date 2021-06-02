package two_lists;

// Import scanner, arraylist, and iterator
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class two_lists {
	
	// Create instance of Scanner
	Scanner reader = new Scanner(System.in);
	// Create instance and global access of array list 1
	ArrayList number_list_1 = new ArrayList();
	// Create instance and global access of array list 2
	ArrayList number_list_2 = new ArrayList();
	
	// Use method to read in series of number
	public void GetList1() {
		// intialize variable
		boolean bOn = true;
		// Describe what they need to input
		System.out.println("For list 1: ");
		// Use while loop to keep method running until user would like to end the series of numbers.
		while (bOn == true) {
			// Prompt user for numbers
			System.out.println("Enter in a number. If you are done entering numbers for the 1st list, enter in '0'. ");
			// Store number in variable
			int iNumber = reader.nextInt();
			// if the number is 0 change the value of on to false
			if (iNumber == 0) {
				bOn = false;
			}
			// If it's not, add the number to the array
			else {
			// Store numbers in array
			number_list_1.add(iNumber);
			}
		}
	}
	
	// Use method to read in series of number
	public void GetList2() {
		// Initialize variable
		boolean bOn = true;
		// Describe what the user needs to input
		System.out.println("For list 2: ");
		// Use while loop to keep method running until user would like to end the series of numbers.
		while (bOn == true) {
			// Prompt user for numbers
			System.out.println("Enter in a number. If you are done entering numbers for the 2nd list, enter in '0'. ");
			// Store number in variable
			int iNumber = reader.nextInt();
			// if the number is 0 change the value of on to false
			if (iNumber == 0) {
				bOn = false;
			}
			// If it's not, add the number to the array
			else {
			// Store numbers in the 2nd number list
			number_list_2.add(iNumber);
			}
		}
	}
	
	// Use method to print out both lists
	public void PrintLists() {
		// Print list 1
		System.out.println("List 1: " + number_list_1);
		// Print list 2
		System.out.println("List 2: " + number_list_2);
	}
	
	// Use method to check to see if there are numbers included in list 2 that are also included in list 1 then eliminate those numbers in list 1
	public void ChangeList1() {
		// Create instance of iterator for list 2
		Iterator<Integer> itr_list_2 = number_list_2.iterator();
		// Use while loop to iterate through list 2
		while (itr_list_2.hasNext()) {
			Integer number_list_2 = itr_list_2.next();
			// Create instance of iterator for list 1
			Iterator<Integer> itr_list_1 = number_list_1.iterator();
			// Use while loop to iterate through list 1
			while (itr_list_2.hasNext()) {
				if (number_list_1.equals(number_list_2)){
					itr_list_1.remove();
				}
			}
		}
		
	}

}
