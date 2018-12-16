package fhnw.hackermans.shopstantlySPRING.domain.orderManagement;


import org.hibernate.Query;
import org.hibernate.LockMode;
import java.util.List;

import java.io.Serializable;
import javax.persistence.*;
@Entity
@org.hibernate.annotations.Proxy(lazy=false)
@Table(name="OrderPositions")
public class OrderPositions implements Serializable {
	public OrderPositions() {
	}
	
	
	
	@Column(name="posId", nullable=false)	
	@Id	
	@GeneratedValue(generator="ORDERPOSITIONS_POSID_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="ORDERPOSITIONS_POSID_GENERATOR", strategy="native")	
	private int posId;
	
	@ManyToOne(targetEntity=Order.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns(value={ @JoinColumn(name="orderId", referencedColumnName="orderId", nullable=false) }, foreignKey=@ForeignKey(name="FKOrderPosit106515"))	
	private Order order;
	
	@ManyToOne(targetEntity=Product.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns(value={ @JoinColumn(name="productId", referencedColumnName="prodId", nullable=false) }, foreignKey=@ForeignKey(name="FKOrderPosit195061"))	
	private Product product;
	
	@Column(name="qty", nullable=false)	
	private int qty;
	
	private void setPosId(int value) {
		this.posId = value;
	}
	
	public int getPosId() {
		return posId;
	}
	
	public int getORMID() {
		return getPosId();
	}
	
	public void setQty(int value) {
		this.qty = value;
	}
	
	public int getQty() {
		return qty;
	}
	
	public void setOrder(Order value) {
		this.order = value;
	}
	
	public Order getOrder() {
		return order;
	}
	
	public void setProduct(Product value) {
		this.product = value;
	}
	
	public Product getProduct() {
		return product;
	}
	
	public String toString() {
		return String.valueOf(getPosId());
	}
	
}
