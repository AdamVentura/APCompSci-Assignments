package ArrayLists1;

import java.util.Scanner;

import java.util.ArrayList;

import java.util.Iterator;

public class ArrayLists1 {
	// Create instance of Scanner
	Scanner reader = new Scanner(System.in);
	// Create instance of array list
	ArrayList number_list = new ArrayList();
	
	// Use method to read in series of number
	public void GetNumbers() {
		// intialize variable
		boolean bOn = true;
		// Use while loop to keep method running until user would like to end the series of numbers.
		while (bOn == true) {
			// Prompt user for numbers
			System.out.println("Enter in a number. If you are done entering numbers, enter in '0'. ");
			// Store number in variable
			int iNumber = reader.nextInt();
			// if the number is 0 change the value of on to false
			if (iNumber == 0) {
				bOn = false;
			}
			// If it's not, add the number to the array
			else {
			// Store numbers in array
			number_list.add(iNumber);
			}
		}
	}
	
	// Create method to print number list
	public void PrintList() {
		// Print number list
		System.out.println(number_list);
	}
	
	// Create method to print the size of the list
	public void PrintSize() {
		// Print out the size of the list
		System.out.println("Amount of numbers in list: " + number_list.size());
		
	}
	// Create method to remove 2's
	public void RemoveTwos() {
		// Create instance of iterator
		Iterator<Integer> itr = number_list.iterator();
		// Use while loop to remove elements from the list when they are twos
		while (itr.hasNext()) {
			Integer number_list = itr.next();
			if (number_list.equals(2)){
				itr.remove();
			}
		}
		
	}
	
	// Create method to print new list
	public void PrintNewList() {
		// Print new list
		System.out.println(number_list);
	}
	
	// Create method to print the size of the new list
	public void PrintNewSize() {
		// Print out the size of the new list
		System.out.println("Amount of numbers in list: " + number_list.size());
		
	}
	
}
