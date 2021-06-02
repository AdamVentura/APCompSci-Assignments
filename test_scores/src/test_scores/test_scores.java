/*
 * Adam Ventura
 * 02/07/2021
 * This program prompts the user for a score out of 100 they got on a test.
 * Then based on that score the program will give them the letter grade of either an A, B, C, D, or F.
 */
package test_scores;


import java.util.Scanner;

public class test_scores {

	public static void main(String[] args) {
		// Create input reader.
		Scanner reader = new Scanner(System.in);
		// Declare variables.
		int iScore;
		String sGrade;
		// Intialize variables as empty string for string to later be assigned.
		sGrade = "";
		// Prompt user for score and store score in variable named iScore.
		System.out.println("Enter your score: ");
		iScore = reader.nextInt();
		// Use if and if else statements to determine letter grade of score.
		if (iScore >= 90 && iScore <= 100) {
			sGrade = "A";
		}
		else if (iScore >= 80 && iScore <= 89) {
			sGrade = "B";
		}
		else if (iScore >= 70 && iScore <= 79) {
			sGrade = "C";
		}
		else if (iScore >= 60 && iScore <= 69) {
			sGrade = "D";
		}
		else if (iScore >= 0 && iScore <= 59) {
			sGrade = "F";
		}
		// Print grade.
		System.out.println("Grade: " + sGrade);
	}

}
