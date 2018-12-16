package fhnw.hackermans.shopstantlySPRING.domain.orderManagement;



import org.hibernate.Query;
import org.hibernate.LockMode;
import java.util.List;

import java.io.Serializable;
import javax.persistence.*;
@Entity
@org.hibernate.annotations.Proxy(lazy=false)
@Table(name="Product")
public class Product implements Serializable {
	public Product() {
	}
	

	
	@Column(name="prodId", nullable=false)	
	@Id	
	@GeneratedValue(generator="PRODUCT_PRODID_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="PRODUCT_PRODID_GENERATOR", strategy="native")	
	private int prodId;
	
	@Column(name="price", nullable=false)	
	private int price;
	
	@Column(name="productName", nullable=false, length=255)	
	private String productName;
	
	@Column(name="description", nullable=true, length=255)	
	private String description;
	
	@OneToMany(mappedBy="product", targetEntity=OrderPositions.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set orderPositions = new java.util.HashSet();
	
	private void setProdId(int value) {
		this.prodId = value;
	}
	
	public int getProdId() {
		return prodId;
	}
	
	public int getORMID() {
		return getProdId();
	}
	
	public void setPrice(int value) {
		this.price = value;
	}
	
	public int getPrice() {
		return price;
	}
	
	public void setProductName(String value) {
		this.productName = value;
	}
	
	public String getProductName() {
		return productName;
	}
	
	public void setDescription(String value) {
		this.description = value;
	}
	
	public String getDescription() {
		return description;
	}
	
	public void setOrderPositions(java.util.Set value) {
		this.orderPositions = value;
	}
	
	public java.util.Set getOrderPositions() {
		return orderPositions;
	}
	
	
	public String toString() {
		return String.valueOf(getProdId());
	}
	
}
