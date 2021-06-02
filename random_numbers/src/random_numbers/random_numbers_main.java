package random_numbers;

public class random_numbers_main {

	public static void main(String[] args) {
		// Create an instance of random_numbers class
		random_numbers rn = new random_numbers();
		// Call method to create array
		int[] iList = rn.CreateList();
		// Call method to print list
		rn.PrintList(iList);
		// Call method to print the list in reverse
		rn.PrintReverse(iList);
		// Call method to print how many of each number was generated
		rn.Repeats(iList);

	}

}
