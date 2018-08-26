
public class BillDetails {

	String itemNames;
	Integer itemQuantities;
	Double itemPrices;

	public BillDetails(String itemname, Integer itemQuantities, Double itemPrices) {
		this.itemNames = itemname;
		this.itemQuantities = itemQuantities;
		this.itemPrices = itemPrices;
	}

	public String getItemNames() {
		return itemNames;
	}

	public void setItemNames(String itemNames) {
		this.itemNames = itemNames;
	}

	public Integer getItemQuantities() {
		return itemQuantities;
	}

	public void setItemQuantities(Integer itemQuantities) {
		this.itemQuantities = itemQuantities;
	}

	public Double getItemPrices() {
		return itemPrices;
	}

	public void setItemPrices(Double itemPrices) {
		this.itemPrices = itemPrices;
	}

}
