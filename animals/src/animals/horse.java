package animals;

public class horse extends cow {
	// Create instance variable called sColor
	String[] sColors = new String[2];
	
	// Use method to read in colors of horses
	public void SetColor(){
		int iCount;
		// Use for loop to iterate through the arrays
		for(iCount = 0; iCount < 2; iCount += 1) {
			// Prompt user to enter in the age of the cow and add to array
			System.out.println("Enter in the color of cow " + (iCount + 1) + ".");
			sColors[iCount] = reader.next();
		}
	}
	
	// Use method to print the names of all the brown horses
	public void FindBrown(){
		int iCount;
		// Use for loop to iterate through the ages of the cows
		for(iCount = 0; iCount < 2; iCount += 1) {
			// If the cow's age is over 5
			if ((sColors[iCount]).equals("brown")) {
				// Print the name of the cow
				System.out.println(sNames[iCount]);
			}
		}
	}
	
	// Use method to print neigh
	public void speak(){
		System.out.println("Neigh!");
	}
}
