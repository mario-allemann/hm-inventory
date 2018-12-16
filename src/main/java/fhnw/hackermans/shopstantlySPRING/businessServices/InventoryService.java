package fhnw.hackermans.shopstantlySPRING.businessServices;

public class InventoryService {
	private int placeId;
    private int amount;
    private int prodId;
	
    public int getPlaceId() {
		return placeId;
	}
	public void setPlaceId(int placeId) {
		this.placeId = placeId;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public int getProdId() {
		return prodId;
	}
	public void setProdId(int prodId) {
		this.prodId = prodId;
	}

}
