/*
 * Adam Ventura
 * 03/6/2021
 * This program returns numbers in the reverse order they were put in.
 */

package reverse_numbers;

import java.util.Scanner;

public class reverse_numbers {

	public static void main(String[] args) {
		// Create instance of Scanner.
		Scanner reader = new Scanner(System.in);
		// Declare variables
		int iNumber;
		// Prompt user for numbers
		System.out.println("Enter a number: ");
		iNumber = reader.nextInt();
		// Call reverse method to reverse the numbers
		System.out.println("Your number reversed: ");
		reverse_numbers.Reverse(iNumber);
		
		
	}
	public static int Reverse(int iNumber) {
		// Base condition to end recursion
        if (iNumber < 10) { 
            System.out.println(iNumber); 
            return iNumber; 
        } 
  
        else { 
  
            // Print the unit digit of the given number 
            System.out.print(iNumber % 10); 
  
            // Calling function for remaining number other than unit digit 
            Reverse(iNumber / 10); 
        } 
        return iNumber;
		
	}
}
