package com.flipkart.shopping.api.model;

public class Price {

	private long mrp;
	private long cost;
	private String discount;
	public long getMrp() {
		return mrp;
	}
	public void setMrp(long mrp) {
		this.mrp = mrp;
	}
	public long getCost() {
		return cost;
	}
	public void setCost(long cost) {
		this.cost = cost;
	}
	public String getDiscount() {
		return discount;
	}
	public void setDiscount(String discount) {
		this.discount = discount;
	}
	
	@Override
	public String toString() {
		return "Price [mrp=" + mrp + ", cost=" + cost + ", discount=" + discount + "]";
	}
	
	
}
