import java.util.LinkedHashMap;
import java.util.Map;

public class Order {
	Item item;
	String name;
	Double price;
	Integer quantity;

	double totalPrice;
	String totalItems = "";

	LinkedHashMap<String, BillDetails> linkedHashMap = new LinkedHashMap<String, BillDetails>();

	public void addItem(String itemName) {
		System.out.println("");
		System.out.println("Adding item : ");
		Item item = new Item();
		ItemDetails itemDetails = item.getItem(itemName);

		totalItems = totalItems + itemDetails.getItemName();
		totalPrice = totalPrice + itemDetails.getItemPrice();

		// TO PRINT BILL
		int size = linkedHashMap.size();
		if (size == 0) {
			linkedHashMap.put(itemName, new BillDetails(itemDetails.getItemName(), 1, itemDetails.getItemPrice()));
		} else {
			if (linkedHashMap.containsKey(itemDetails.getItemName())) {
				quantity = linkedHashMap.get(itemName).getItemQuantities();
				quantity++;
				price = linkedHashMap.get(itemName).getItemPrices();
				price = price + itemDetails.getItemPrice();
				linkedHashMap.put(itemName, new BillDetails(itemDetails.getItemName(), quantity, price));
			} else {
				linkedHashMap.put(itemName, new BillDetails(itemDetails.getItemName(), 1, itemDetails.getItemPrice()));
			}
		}

	}

	public void printBill() {
		System.out.println("");
		System.out.println("######### Order Bill ############");
		System.out.println("Item   :   Quantity    :   Price");
		System.out.println("----------------------------------");
		for (Map.Entry<String, BillDetails> m : linkedHashMap.entrySet()) {
			System.out.println(
					m.getKey() + " : " + m.getValue().getItemQuantities() + " : " + m.getValue().getItemPrices());
		}
		System.out.println("----------------------------------");
		System.out.println("Total Price : " + totalPrice);

		System.out.println("###################################");
	}

	public void getTotalPrice() {
		System.out.println("totalPrice : " + totalPrice);
	}

	public void getItems() {
		System.out.println("totalItems : " + totalItems);
	}

}
