package pattern.products.Burger;

import CONSTANT_STRINGS.*;

public class VegBurger implements Burger{

	@Override
	public String getBurger() {
		return CONSTANTS.VEG_BURGER;
	}
	
	@Override
	public double getPrice() {
		return CONSTANTS.VEG_BURGER_PRICE;
	}
	
	

}
