package pattern.products.Drink;
import CONSTANT_STRINGS.*;

public class Coke implements Drink {

	@Override
	public String getDrink() {
		return CONSTANTS.COKE;
	}

	@Override
	public double getPrice() {
		return CONSTANTS.COKE_PRICE;
	}

}
