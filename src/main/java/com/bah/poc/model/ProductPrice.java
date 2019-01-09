
package com.bah.poc.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.bah.poc.annotations.CustomForeinKey;

@Entity
@CustomForeinKey(table = "ProductPrice", column = "sku", method = "cascade")
public class ProductPrice {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@CustomForeinKey(table = "ProductPrice", column = "sku", method = "cascade")
	private long sku;

	private double originalPrice;
	private String salePrice;
	private boolean onSale;

	public long getSku() {
		return sku;
	}

	public void setSku(long sku) {
		this.sku = sku;
	}

	public double getOriginalPrice() {
		return originalPrice;
	}

	public void setOriginalPrice(double originalPrice) {
		this.originalPrice = originalPrice;
	}

	public String getSalePrice() {
		return salePrice;
	}

	public void setSalePrice(String salePrice) {
		this.salePrice = salePrice;
	}

	public boolean isOnSale() {
		return onSale;
	}

	public void setOnSale(boolean onSale) {
		this.onSale = onSale;
	}
}
