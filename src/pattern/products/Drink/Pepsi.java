package pattern.products.Drink;
import CONSTANT_STRINGS.*;

public class Pepsi implements Drink {

	@Override
	public String getDrink() {
		return CONSTANTS.PEPSI;
	}

	@Override
	public double getPrice() {
		return CONSTANTS.PEPSI_PRICE;
	}

}
