package gruppenarbeit1;

public class ShoppingItem {
	// the fields
	private String name;
	private double price;
	private int amountInBasket;

	// fill the fields in the constructor
	public ShoppingItem(String name, double price) {
		this.setName(name);
		this.setPrice(price);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getAmountInBasket() {
		return amountInBasket;
	}

	public void setAmountInBasket(int amountInBasket) {
		this.amountInBasket = amountInBasket;
	}
}
