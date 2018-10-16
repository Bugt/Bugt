package gruppenarbeit1;

import java.util.ArrayList;
import java.util.Scanner;

public class BasketManager {
	private ArrayList<ShoppingItem> availableItems;
	private ArrayList<ShoppingItem> itemsInBasket = new ArrayList<ShoppingItem>();

	public BasketManager(ArrayList<ShoppingItem> availableItems) {
		this.availableItems = availableItems;
	}

	public void showCurrentBasket() {
		// check if the basket is currently empty
		if (itemsInBasket.isEmpty()) {
			System.out.println("----------------------------------------------------------------");
			System.out.println("Your Basket is empty.");
		}
		showPossibleBuys();
	}

	public void showPossibleBuys() {
		// Anweisungen
		System.out.println("---------------------");
		System.out.println("You can buy following items:");
		// check if the basket is currently empty
		for (int i = 1; i < availableItems.size() + 1; i++) {
			System.out.println(i + ") " + availableItems.get(i - 1).getName() + "   "
					+ availableItems.get(i - 1).getPrice() + " CHF");
		}
	}

	public void enableBuying() {
		System.out.println("What item would you like to add to your basket? (1,2,3 or q to quit)");
		// check for Quit
		int productToBuy = readNumber();
	}

	public void addItemToBasket(ShoppingItem shoppingItem) {
		// check if basket is empty
		if (itemsInBasket.isEmpty()) {
			itemsInBasket.add(shoppingItem);
			System.out.println("Item " + shoppingItem.getName() + " was added to the basket. Thanks!");
		} else {
			for (ShoppingItem shoppingItemInBasket : itemsInBasket) {
				if (shoppingItemInBasket.getName() == shoppingItem.getName()) {
					// if the names are equal, rise the amount in basket by one
					shoppingItemInBasket.setAmountInBasket(shoppingItemInBasket.getAmountInBasket() + 1);
				} else {
					// item is not yet in basket, add it
					itemsInBasket.add(shoppingItem);
					System.out.println("Item " + shoppingItem.getName() + " was added to the basket. Thanks!");
				}
			}
		}
	}

	public int readNumber() {
		Scanner input = new Scanner(System.in);
		int number = 0;

		// check for valid integer
		while (number <= 0) {
			while (!input.hasNextInt()) {
				// check for quit

				System.out.println("That's not a number!");
				input.next();
			}
			number = input.nextInt();
		}

		System.out.println("Thank you! Got " + number);
		return number;
	}

}
