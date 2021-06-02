package equal_overload;

import java.util.Scanner;

public class equal_overload_main {
	// Create global access for variables
	static int iNum1, iNum2, iNum3;
	// Create instance of Scanner
	static Scanner reader = new Scanner(System.in);

	public static void main(String[] args) {
		//  Create instance of class
		equal_overload  eo = new equal_overload();
		// Call method to read in numbers
		ReadNumbers();
		// Call method to check if the numbers are equal
		// First check to see if they entered in 2 or 3 numbers
		if (iNum3 == -1) {
			eo.CheckEqual(iNum1, iNum2);
		}
		else {
			eo.CheckEqual(iNum1, iNum2, iNum3);
		}
	
	}
	// Create method to read numbers
	public static void ReadNumbers() {
		// Create variable to use as on/off switch
		boolean on = true;
		// Use while loop to run program while on == true
		while (on == true) {
			// Prompt user to enter in a number
			System.out.println("Enter in a number: ");
			iNum1 = reader.nextInt();
			// Prompt user to enter in a second number
			System.out.println("Enter another number: ");
			iNum2 = reader.nextInt();
			// Prompt user to enter in a 3rd number if they enter in a -1 then they are through
			System.out.println("If you'd like to enter in a 3rd number, enter it. Else, enter in -1.");
			iNum3 = reader.nextInt();
			break;
			}
			
			
		}

	}
