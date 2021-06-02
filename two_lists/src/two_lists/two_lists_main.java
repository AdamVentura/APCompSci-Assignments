package two_lists;

public class two_lists_main {

	public static void main(String[] args) {
		// Create instance of two_lists class
		two_lists tl = new two_lists();
		// Call method to get both of the lists
		tl.GetList1();
		tl.GetList2();
		// Call method to print the lists
		tl.PrintLists();
		// Call method to change list 1
		tl.ChangeList1();
		// Call method to print the lists again
		tl.PrintLists();
	}

}
