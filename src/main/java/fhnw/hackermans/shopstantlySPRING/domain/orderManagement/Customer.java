package fhnw.hackermans.shopstantlySPRING.domain.orderManagement;



import org.hibernate.Query;
import org.hibernate.LockMode;
import java.util.List;

import java.io.Serializable;
import javax.persistence.*;
@Entity
@org.hibernate.annotations.Proxy(lazy=false)
@Table(name="Customer")
public class Customer implements Serializable {
	public Customer() {
	}
	
	
	@Column(name="customerId", nullable=false)	
	@Id	
	@GeneratedValue(generator="CUSTOMER_CUSTOMERID_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="CUSTOMER_CUSTOMERID_GENERATOR", strategy="native")	
	private int customerId;
	
	@Column(name="lastname", nullable=false, length=255)	
	private String lastname;
	
	@Column(name="firstname", nullable=false, length=255)	
	private String firstname;
	
	@Column(name="address", nullable=false, length=255)	
	private String address;
	
	@Column(name="zip", nullable=false)	
	private int zip;
	
	@Column(name="city", nullable=false, length=255)	
	private String city;
	
	@Column(name="`loyalityPts int`", nullable=false)	
	private int loyalityPts_int;
	
	@OneToMany(mappedBy="customer", targetEntity=Order.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set order = new java.util.HashSet();
	
	private void setCustomerId(int value) {
		this.customerId = value;
	}
	
	public int getCustomerId() {
		return customerId;
	}
	
	public int getORMID() {
		return getCustomerId();
	}
	
	public void setLastname(String value) {
		this.lastname = value;
	}
	
	public String getLastname() {
		return lastname;
	}
	
	public void setFirstname(String value) {
		this.firstname = value;
	}
	
	public String getFirstname() {
		return firstname;
	}
	
	public void setAddress(String value) {
		this.address = value;
	}
	
	public String getAddress() {
		return address;
	}
	
	public void setZip(int value) {
		this.zip = value;
	}
	
	public int getZip() {
		return zip;
	}
	
	public void setCity(String value) {
		this.city = value;
	}
	
	public String getCity() {
		return city;
	}
	
	public void setLoyalityPts_int(int value) {
		this.loyalityPts_int = value;
	}
	
	public int getLoyalityPts_int() {
		return loyalityPts_int;
	}
	
	public void setOrder(java.util.Set value) {
		this.order = value;
	}
	
	public java.util.Set getOrder() {
		return order;
	}
	
	
	public String toString() {
		return String.valueOf(getCustomerId());
	}
	
}
