/*
 * Adam Ventura
 * 02/17/2021
 * This program prints all the prime numbers between 1 and 100 using a for loop
 */
package prime_numbers;

public class prime_numbers {

	public static void main(String[] args) {
		// Declare and initialize variables
		int iPrime = 0, iNumb = 0, iCounter;
		// Print out description of output
    	System.out.println("The prime numbers between 1 and 100: ");
	    // Use a for loop to iterate through the counter
	    for (iPrime = 1; iPrime <= 100; iPrime += 1){ 
	    	// Reset the counter to 0
	    	iCounter = 0;
	    	// Create a loop inside this loop to iterate through the numbers backwards
	        for(iNumb = iPrime; iNumb >= 1; iNumb --){
	        	// Use if statement to determine if prime
	        	if(iPrime % iNumb == 0){
	        		iCounter += 1;
	        		}
		  }
	        // If prime number...
	        if (iCounter ==2){
	        	// Print out prime number
	        	System.out.print(iPrime + ", ");
	        	}	
	    }
	    
	   }
	}
	

