import CONSTANT_STRINGS.*;
import pattern.products.Burger.*;
import pattern.products.Drink.*;

public class Item implements CONSTANTS {

	public ItemDetails getItem(String itemName) {
		System.out.println("itemName : " + itemName);
		ItemDetails itemDetails = new ItemDetails();

		String name = null;
		double price = 0;

		if (itemName.equalsIgnoreCase(VEG_BURGER)) {
			Burger vegBurger = new VegBurger();
			name = vegBurger.getBurger();
			price = vegBurger.getPrice();
		} else if (itemName.equalsIgnoreCase(CHICKEN_BURGER)) {
			Burger chickenBurger = new ChickenBurger();
			name = chickenBurger.getBurger();
			price = chickenBurger.getPrice();
		} else if (itemName.equalsIgnoreCase(COKE)) {
			Drink coke = new Coke();
			name = coke.getDrink();
			price = coke.getPrice();
		} else if (itemName.equalsIgnoreCase(PEPSI)) {
			Drink pepsi = new Pepsi();
			name = pepsi.getDrink();
			price = pepsi.getPrice();
		} else {
			System.out.println(INVALID_ITEM);
		}

		itemDetails.setItemName(name);
		itemDetails.setItemPrice(price);

		System.out.println(itemDetails.toString());

		return itemDetails;

	}

}
