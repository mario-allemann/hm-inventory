package fhnw.hackermans.shopstantlySPRING.domain.orderManagement;



import org.hibernate.Query;
import org.hibernate.LockMode;
import java.util.List;

import java.io.Serializable;
import javax.persistence.*;
@Entity
@org.hibernate.annotations.Proxy(lazy=false)
@Table(name="`Order`")
public class Order implements Serializable {
	public Order() {
	}
	

	
	@Column(name="orderId", nullable=false)	
	@Id	
	@GeneratedValue(generator="ORDER_ORDERID_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="ORDER_ORDERID_GENERATOR", strategy="native")	
	private int orderId;
	
	@Column(name="`date`", nullable=true)	
	@Temporal(TemporalType.DATE)	
	private java.util.Date date;
	
	@Column(name="state", nullable=true, length=255)	
	private String state;
	
	@ManyToOne(targetEntity=Customer.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns(value={ @JoinColumn(name="customerId", referencedColumnName="customerId", nullable=false) }, foreignKey=@ForeignKey(name="FKOrder872949"))	
	private Customer customer;
	
	@OneToMany(mappedBy="order", targetEntity=OrderPositions.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set orderPositions = new java.util.HashSet();
	
	private void setOrderId(int value) {
		this.orderId = value;
	}
	
	public int getOrderId() {
		return orderId;
	}
	
	public int getORMID() {
		return getOrderId();
	}
	
	public void setDate(java.util.Date value) {
		this.date = value;
	}
	
	public java.util.Date getDate() {
		return date;
	}
	
	public void setState(String value) {
		this.state = value;
	}
	
	public String getState() {
		return state;
	}
	
	public void setCustomer(Customer value) {
		this.customer = value;
	}
	
	public Customer getCustomer() {
		return customer;
	}
	
	public void setOrderPositions(java.util.Set value) {
		this.orderPositions = value;
	}
	
	public java.util.Set getOrderPositions() {
		return orderPositions;
	}
	
	
	public String toString() {
		return String.valueOf(getOrderId());
	}
	
}
