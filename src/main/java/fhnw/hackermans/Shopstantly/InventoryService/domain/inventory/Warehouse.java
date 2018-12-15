package fhnw.hackermans.Shopstantly.InventoryService.domain.inventory;




import org.hibernate.LockMode;
import java.util.List;

import java.io.Serializable;
import javax.persistence.*;
@Entity
@org.hibernate.annotations.Proxy(lazy=false)
@Table(name="Warehouse")
public class Warehouse implements Serializable {
	public Warehouse() {
	}
	
	
	@Column(name="placeID", nullable=false)	
	@Id	
	@GeneratedValue(generator="WAREHOUSE_PLACEID_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="WAREHOUSE_PLACEID_GENERATOR", strategy="native")	
	private int placeID;
	
	@Column(name="amount", nullable=false)	
	private int amount;
	
	@Column(name="prodId", nullable=false)	
	private int prodId;
	
	private void setPlaceID(int value) {
		this.placeID = value;
	}
	
	public int getPlaceID() {
		return placeID;
	}
	
	public int getORMID() {
		return getPlaceID();
	}
	
	public void setAmount(int value) {
		this.amount = value;
	}
	
	public int getAmount() {
		return amount;
	}
	
	public void setProdId(int value) {
		this.prodId = value;
	}
	
	public int getProdId() {
		return prodId;
	}
	
	public String toString() {
		return String.valueOf(getPlaceID());
	}
	
}
