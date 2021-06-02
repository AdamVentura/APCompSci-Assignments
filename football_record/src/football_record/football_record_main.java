package football_record;

public class football_record_main {

	public static void main(String[] args) {
		
		// Create instance of football record class
		football_record fr = new football_record();
		// Call method to determine the amount of games the user would like to report
		fr.GetAmountOfGames();
		// Call method to prompt user for the scores and store scores in 2D array
		fr.GetScores();
		// Call methods to calculate the information required for the scores
		int iWins = fr.GetWins();
		int iLosses = fr.GetLosses();
		int iGreatestScoreDifference = fr.GetGreatestScoreDifference();
		// Call method to print output
		fr.PrintOutput(iWins, iLosses, iGreatestScoreDifference);
		

	}

}
