package com.ecafe.model;

import com.ecafe.enumeration.ItemType;

public class CafeItemModel {
	private long itemId;
	private String name;
	private String detail;
	private String imageUrl;
	private ItemType type;
	private double amount;
	public long getItemId() {
		return itemId;
	}
	public void setItemId(long itemId) {
		this.itemId = itemId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDetail() {
		return detail;
	}
	public void setDetail(String detail) {
		this.detail = detail;
	}
	public String getImageUrl() {
		return imageUrl;
	}
	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}
	public ItemType getType() {
		return type;
	}
	public void setType(ItemType type) {
		this.type = type;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public CafeItemModel(int itemId, String name, String detail, String imageUrl, ItemType type, double amount) {
		super();
		this.itemId = itemId;
		this.name = name;
		this.detail = detail;
		this.imageUrl = imageUrl;
		this.type = type;
		this.amount = amount;
	}
	public CafeItemModel() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "CafeItemModel [itemId=" + itemId + ", name=" + name + ", detail=" + detail + ", imageUrl=" + imageUrl
				+ ", type=" + type + ", amount=" + amount + "]";
	}
	

}
