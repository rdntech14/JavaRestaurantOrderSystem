import CONSTANT_STRINGS.CONSTANTS;

public class Main implements CONSTANTS {

	public static void main(String[] args) {

		// First Order
		Order order = new Order();

		order.addItem(VEG_BURGER);
		order.addItem(COKE);
		order.addItem(CHICKEN_BURGER);
		order.addItem(COKE);

		order.printBill();

		// Second Order
//		Order order2 = new Order();
//
//		order2.addItem(CHICKEN_BURGER);
//		order2.addItem(PEPSI);
//
//		order2.printBill();

	}

}
