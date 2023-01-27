package com.flipkart.shopping.api.model;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "product")
public class Product {

	private int id;
	private String name;
	private String category;
	private String url;
	private String detailUrl;
	private Title title;
	private Price price;
	private int quantity;
	private String description;
	private String discount;
	private String tagline;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getDetailUrl() {
		return detailUrl;
	}
	public void setDetailUrl(String detailUrl) {
		this.detailUrl = detailUrl;
	}

	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getDiscount() {
		return discount;
	}
	public void setDiscount(String discount) {
		this.discount = discount;
	}
	public String getTagline() {
		return tagline;
	}
	public void setTagline(String tagline) {
		this.tagline = tagline;
	}
	public Title getTitle() {
		return title;
	}
	public void setTitle(Title title) {
		this.title = title;
	}
	public Price getPrice() {
		return price;
	}
	public void setPrice(Price price) {
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", url=" + url + ", detailUrl=" + detailUrl + ", title=" + title + ", price="
				+ price + ", quantity=" + quantity + ", description=" + description + ", discount=" + discount
				+ ", tagline=" + tagline + "]";
	}
	
	
	
}
