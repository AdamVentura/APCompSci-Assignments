package pizza_restaurant;

import java.util.Scanner;

public class pizza {
	// Create instance of scanner
	Scanner reader = new Scanner(System.in);
	int iPizzaSize, iAmountOfToppings, iAmountOfDrinks, iDrinkSize, iDeliveryMethod;
	
		public void Order() {
			// Prompt customer for pizza size
			System.out.println("What size pizza would you like (1-3)?");
			System.out.println("(1) Small");
			System.out.println("(2) Medium");
			System.out.println("(3) Large");
			iPizzaSize = reader.nextInt();
			
			// Prompt customer for amount of toppings
			System.out.println("How many toppings would you like?");
			iAmountOfToppings = reader.nextInt();
			
			// Prompt customer for amount of drinks
			System.out.println("How many drinks would you like?");
			iAmountOfDrinks = reader.nextInt();
			
			// If the amount of drinks is greater than 0, prompt customer for drink size
			if (iAmountOfDrinks > 0) {
				System.out.println("What size cup would you like for your drink/drinks (1-3)?");
				System.out.println("(1) Small");
				System.out.println("(2) Medium");
				System.out.println("(3) Large");
				iDrinkSize = reader.nextInt();
			}
			// Prompt user for method of delivery
			System.out.println("How would you like to recieve your order (1-3)?");
			System.out.println("(1) Dine in");
			System.out.println("(2) Pick up");
			System.out.println("(3) Delivery");
			iDeliveryMethod = reader.nextInt();
	}
		public void TotalCost() {
			// Declare variables
			int iPizzaCost = 0, iToppingsCost = 0, iDrinksCost = 0, iDeliveryCost = 0, iTotalCost;
			
			// Use if statements to determine cost of pizza based off their different sizes.
			if (iPizzaSize == 1) {
				iPizzaCost = 5;
			}
			if (iPizzaSize == 2) {
				iPizzaCost = 9;
			}
			if (iPizzaSize == 3) {
				iPizzaCost = 11;
			}
			
			// Determine cost of toppings. Toppings cost 2 dollars.
			iToppingsCost = iAmountOfToppings * 2;
			
			// Determine cost of drinks. Calculated by cost of size multiplied by amount of drinks.
			if (iDrinkSize == 1) {
				iDrinksCost = 2 * iAmountOfDrinks;
			}
			if (iDrinkSize == 2) {
				iDrinksCost = 4 * iAmountOfDrinks;
			}
			if (iDrinkSize == 3) {
				iDrinksCost = 5 * iAmountOfDrinks;
			}
			// Determine cost of delivery, only charge for delivery
			if (iDeliveryMethod == 3) {
				iDeliveryCost = 5;
			}
			
			// Add up all costs to calculate total cost
			iTotalCost = iPizzaCost + iToppingsCost + iDrinksCost + iDeliveryCost;
			// Print out the total cost
			System.out.println("Your total cost is $" + iTotalCost);
		
		}
}
