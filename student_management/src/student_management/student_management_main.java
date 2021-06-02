/* Adam Ventura
 * 4/23
 */
package student_management;

import java.util.Scanner;

public class student_management_main {

	public static void main(String[] args) {
		// Create instance of student_management class
		student_management sm = new student_management();
		// Create instance of Scanner
		Scanner reader = new Scanner(System.in);
		// use on to store boolean value of whether or not the program is running
		boolean bOn = true;
		// Use while loop to keep program running
		while (bOn == true) {
			// Add a line of whitespace
			System.out.println();
			// Welcome user and prompt user to choose option
			System.out.println("Which of the following actions would you like to do (enter in a number 0-4):"
					+ "\n0. Quit Program"
					+ "\n1. Add Student"
					+ "\n2. Get Student's Name"
					+ "\n3. Add Information About Age and Grade Level"
					+ "\n4. See Similar Students");
			// Add a line of white space
			System.out.println();
			// Store answer in variable
			int iChoice = reader.nextInt();
			// Use switch statements to determine which method to call.
			switch (iChoice){
				
				case 0:
					System.out.println("You have quit the program.");
					bOn = false;
					break;
				
				case 1:
					sm.GetStudentIDName();
					break;
				
				case 2:
					sm.PrintName();
					break;
					
				case 3:
					sm.GetStudentGradeAge();
					break;
				
				case 4:
					sm.PrintSimilarStudents();
					break;
		
				default:
					System.out.println("Please enter in a number 1-6.");
					break;
				
					}
			}

	}

}
