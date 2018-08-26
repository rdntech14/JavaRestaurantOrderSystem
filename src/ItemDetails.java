
public class ItemDetails {

	String itemName;
	Double itemPrice;

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public Double getItemPrice() {
		return itemPrice;
	}

	public void setItemPrice(Double itemPrice) {
		this.itemPrice = itemPrice;
	}

	@Override
	public String toString() {
		return "ItemDetails [itemName=" + itemName + ", itemPrice=" + itemPrice + "]";
	}

}
