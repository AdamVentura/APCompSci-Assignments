package student_management;

import java.util.Scanner;

public class student {
	// Declare student name and student id as class variables
	String[] sNameArray = new String[5];
	int[] iStudentIDArray = new int[5];
	// Create instance of scanner
	Scanner reader = new Scanner(System.in);
	
	// Use method to get a students name and id
	public void GetStudentIDName() {
		// Declare variables
		String sName;
		int iStudentID, iCount;
		// Use for loop to get data into arrays
		for (iCount = 0; iCount < 5; iCount += 1) {
			// Prompt user for the name of the student, store in variable, and add to array.
			System.out.println("What is the name of student " + (iCount + 1) + "? ");
			sName = reader.next();
			sNameArray[iCount] = sName;
			// Prompt user for the id of the student, store in variable, and add to array.
			System.out.println("What is the ID # of student " + (iCount + 1) + "? ");
			iStudentID = reader.nextInt();
			iStudentIDArray[iCount] = iStudentID;
		}
	}
	
	// Use method to print out a students name
	public void PrintName() {
		// Declare variables
		int iStudentID, iCount;
		// Prompt user for the student ID
		System.out.println("What is the ID # of the student you would like to see?");
		iStudentID = reader.nextInt();
		// Use for loop to iterate through the student ID's and if there is a match print out the corresponding name
		for (iCount = 0; iCount < 5; iCount += 1) {
			if (iStudentIDArray[iCount] == iStudentID) {
				System.out.println("The name of the student with that ID is " + sNameArray[iCount] + ".");
			}
		}
	}
}
