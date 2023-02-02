package com.mahedi.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="products")
public class OnlineShop {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	private String productName;
	private String productDesc;
	private String proiductQuantity;
	private String productPrice;
	private String proiductAvilability;

	public OnlineShop() {
		super();
	}

	public OnlineShop(long id, String productName, String productDesc, String proiductQuantity, String productPrice,
			String proiductAvilability) {
		super();
		this.id = id;
		this.productName = productName;
		this.productDesc = productDesc;
		this.proiductQuantity = proiductQuantity;
		this.productPrice = productPrice;
		this.proiductAvilability = proiductAvilability;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProductDesc() {
		return productDesc;
	}

	public void setProductDesc(String productDesc) {
		this.productDesc = productDesc;
	}

	public String getProiductQuantity() {
		return proiductQuantity;
	}

	public void setProiductQuantity(String proiductQuantity) {
		this.proiductQuantity = proiductQuantity;
	}

	public String getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(String productPrice) {
		this.productPrice = productPrice;
	}

	public String getProiductAvilability() {
		return proiductAvilability;
	}

	public void setProiductAvilability(String proiductAvilability) {
		this.proiductAvilability = proiductAvilability;
	}

	@Override
	public String toString() {
		return "OnlineShop [id=" + id + ", productName=" + productName + ", productDesc=" + productDesc
				+ ", proiductQuantity=" + proiductQuantity + ", productPrice=" + productPrice + ", proiductAvilability="
				+ proiductAvilability + "]";
	}

}
