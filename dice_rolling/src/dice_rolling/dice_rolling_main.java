package dice_rolling;


public class dice_rolling_main {

	public static void main(String[] args) {
		// Create instance of dice_rolling classes
		dice_rolling dr = new dice_rolling();
		// Call method to determine the amount of rolls
		int iAmountOfRolls = dr.AmountOfRolls();
		// Call method to roll the dice
		int[] iDie1 = dr.RollDie1(iAmountOfRolls);
		int[] iDie2 = dr.RollDie2(iAmountOfRolls);
		// Call method to determine combinations
		dr.Combos(iDie1, iDie2, iAmountOfRolls);

	}
}

	
