package com.flipkart.shopping.api.model;

public class Title {

	private String shortTitle;
	private String longTitle;
	
	public String getShortTitle() {
		return shortTitle;
	}
	public void setShortTitle(String shortTitle) {
		this.shortTitle = shortTitle;
	}
	public String getLongTitle() {
		return longTitle;
	}
	public void setLongTitle(String longTitle) {
		this.longTitle = longTitle;
	}
	@Override
	public String toString() {
		return "Title [shortTitle=" + shortTitle + ", longTitle=" + longTitle + "]";
	}
	
	
	
}
