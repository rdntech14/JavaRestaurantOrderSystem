package pattern.products.Burger;

import CONSTANT_STRINGS.*;

public class ChickenBurger implements Burger {

	@Override
	public String getBurger() {
		return CONSTANTS.CHICKEN_BURGER;
	}

	@Override
	public double getPrice() {
		return CONSTANTS.CHICKEN_BURGER_PRICE;
	}

}
