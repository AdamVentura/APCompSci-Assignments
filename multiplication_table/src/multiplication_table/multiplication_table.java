/*
 * Adam Ventura
 * 02/24/2021
 * This program prints off a multiplication table
 */
package multiplication_table;

public class multiplication_table {

	public static void main(String[] args) {
		// Declare variables.
		int iColumn, iRow;
		// Print out the columns.
		for (iRow = 1;iRow <= 12; iRow += 1){
			// Print out the rows.
			  for (iColumn = 1;iColumn <= 12; iColumn += 1)
				  // Multiply the Columns by the rows
			     System.out.print("\t"+ iColumn * iRow);
			  // After a row is finished, start a new line.
			  System.out.println(); 
			  
		}
	}
}