package football_record;

// import arraylist
import java.util.ArrayList;

// import scanner
import java.util.Scanner;

public class football_record {
	
	// Create instance of Scanner
	Scanner reader = new Scanner(System.in);
	
	// Create global access and initialize the 2D array for the scores and amount of games
	int[][] iScores = new int [2][16];
	int iAmountOfGames = 0;
	
	// Create method to determine the amount of games the user would like to report
	public void GetAmountOfGames() {
		System.out.println("How many games would you like to report?");
		iAmountOfGames = reader.nextInt();
	}
	// Create method to prompt user for the football scores
	public void GetScores() {
		int iGame, iScore;
		// Use nested for loop to iterate through the array
		for(iGame = 0; iGame <= iAmountOfGames; iGame += 1) {
			for (iScore = 0; iScore <= 1; iScore += 1) {
				// For the team's score (prompt changes)
				if (iScore == 0) {
					System.out.println("Please enter in your team's score for game " + (iGame + 1));
					int iGameScore = reader.nextInt();
					iScores[iScore][iGame] = iGameScore;
				}
				// For the opponent's score (prompt changes)
				if (iScore == 1) {
					System.out.println("Please enter in your opponent's score for game " + (iGame + 1));
					int iGameScore = reader.nextInt();
					iScores[iScore][iGame] = iGameScore;
				}
		
			}
		}
	}
	
	// Create methods to determine the amounts of wins and losses for the team.
	public int GetWins() {
		int iGame, iScore, iWins = 0;
		for(iGame = 0; iGame <= iAmountOfGames; iGame += 1) {
			for (iScore = 0; iScore <= 1; iScore += 1) {
				// If it's the team's score
				if (iScore == 0) {
					// If the team's score is greater than the opponent's score of the same game, add a win
					if (iScores[iScore][iGame] > iScores[iScore + 1][iGame]) {
						iWins += 1;
					}
				}
			}
		}
		// Return the amount of wins
		return iWins;
	}
	public int GetLosses() {
		int iGame, iScore, iLosses = 0;
		for(iGame = 0; iGame <= iAmountOfGames; iGame += 1) {
			for (iScore = 0; iScore <= 1; iScore += 1) {
				// If it's the team's score
				if (iScore == 0) {
					// If the team's score is less than the opponent's score of the same game, add a loss
					if (iScores[iScore][iGame] > iScores[iScore + 1][iGame]) {
						iLosses += 1;
					}
				}
			}
		}
		// Return the amount of wins
		return iLosses;
	}
	
	// Create method to determine the largest score differential.
	public int GetGreatestScoreDifference() {
		int iGame, iScore = 0, iScoreDifference = 0, iGreatestScoreDifference = 0, iCount1, iCount2, iCount = 0;
		int[] iScoreDifferences = new int[iAmountOfGames];
		// Use nested loop to iterate through scores
		for(iGame = 0; iGame <= iAmountOfGames; iGame += 1) {
			// Use if statements to prevent negative differences
			// Compare scores
			if (iScores[iScore][iGame] > iScores[iScore + 1][iGame]) {
				iScoreDifference = (iScores[iScore][iGame] - iScores[iScore + 1][iGame]);
			}
			if (iScores[iScore][iGame] < iScores[iScore + 1][iGame]) {
				iScoreDifference = (iScores[iScore + 1][iGame] - iScores[iScore][iGame]);
			}
		
			// Add score difference to array	
			iScoreDifferences[iCount] = iScoreDifference;
			iCount += 1;
		}
		
		// Use nested loop to iterate through array and compare score differences
		for (iCount1 = 0; iCount1 <= iAmountOfGames; iCount1 += 1) {
			for (iCount2 = 0; iCount2 <= iAmountOfGames; iCount2 += 1) {
				if (iScoreDifferences[iCount1] > iScoreDifferences[iCount2]) {
					iGreatestScoreDifference = iScoreDifferences[iCount1];
				}
				
			}
		}
		
		return iGreatestScoreDifference;
		
	}
	
	// Create method to print out all the information
	public void PrintOutput(int iWins, int iLosses, int iGreatestScoreDifference) {
		System.out.println("Your team had " + iWins + " wins and " + iLosses + " losses.");
		System.out.println("The greatest score difference was " + iGreatestScoreDifference);		
	}
}
