/*
 * Adam Ventura
 * 2/12/2021
 * This program prints out call letters when given a matching channel number
 */
package call_letters;
import java.util.Scanner;

public class call_letters {

	public static void main(String[] args) {
		// Create input reader
		Scanner reader = new Scanner(System.in);
		// Declare variable
		int iChannel_Number;
		// Prompt user for channel number and store it in the channel number variable
		System.out.println("Enter a channel number: ");
		iChannel_Number = reader.nextInt();
		// Use switch statements to print out the corresponding call letter
		switch(iChannel_Number) {
		
		case 2:
			System.out.println("WCBS");
			break;
		
		case 4:
			System.out.println("WNBC");
			break;
			
		case 5:
			System.out.println("WNEW");
			break;
		
		case 7:
			System.out.println("WABC");
			break;
			
		case 9:
			System.out.println("WOR");
			break;
			
		case 11:
			System.out.println("WPIX");
			break;
			
		case 13:
			System.out.println("WNET");
			break;
			
		default:
			System.out.println("That channel is not used.");
		
		}
		


	}

}
