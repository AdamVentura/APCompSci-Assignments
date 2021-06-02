/*
 * Adam Ventura
 * 03/20/2021
 * This program calls methods in the number_list class to do the following:
 * Read in a list of 10 numbers, print out the list, 
 * print out all the numbers in the list that are above 20, and print out all the numbers that are below 10.
 */
package number_list;

public class number_list_main {

	public static void main(String[] args) {
		// Create instance of number_list class
		number_list nl = new number_list();
		// Call method to read in numbers and store array as iList
		int[] iList = nl.CreateList();
		// Call method to print list
		nl.PrintList(iList);
		// Call method to print the numbers in the list that are above 20
		nl.Above20(iList);
		// Call method to print the numbers in the list that are below 10
		nl.Below10(iList);
	}

}
