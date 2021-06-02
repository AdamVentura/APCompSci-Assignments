/*
 * Adam Ventura
 * 03/08/2021
 * This program will read in a persons grade and determine what stage of school they are in
 */

package grade_level;

import java.util.Scanner;

public class grade_level {

	public static void main(String[] args) {
		// Create instance of Scanner
		Scanner reader = new Scanner(System.in);
		// Declare variables
		int iGrade;
		// Prompt user for grade level and store in variable
		System.out.println("What grade are you in? ");
		iGrade = reader.nextInt();
		// Use switch statements to determine what stage of school the person is in
		switch(iGrade) {
		case 1:
		case 2:
		case 3:
		case 4:
		case 5:
			System.out.println("You are in elementary school.");
			break;
		case 6:
		case 7:
		case 8:
			System.out.println("You are in middle school.");
			break;
		case 9:
		case 10:
		case 11:
		case 12:
			System.out.println("You are in high school.");
			break;
		// If any other values are entered, the default will be printed.
		default:
			System.out.println("You are not in school yet.");
			
		}

}
}
