package com.ecafe.model;

import com.ecafe.enumeration.ComboType;

public class CafeComboModel {
	private long comboId;
	private String name;
	private String detail;
	private String imageUrl;
	private ComboType type;
	private double amount;
	public long getComboId() {
		return comboId;
	}
	public void setComboId(long comboId) {
		this.comboId = comboId;
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
	public ComboType getType() {
		return type;
	}
	public void setType(ComboType type) {
		this.type = type;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public CafeComboModel(int comboId, String name, String detail, String imageUrl, ComboType type, double amount) {
		super();
		this.comboId = comboId;
		this.name = name;
		this.detail = detail;
		this.imageUrl = imageUrl;
		this.type = type;
		this.amount = amount;
	}
	public CafeComboModel() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "CafeComboModel [comboId=" + comboId + ", name=" + name + ", detail=" + detail + ", imageUrl=" + imageUrl
				+ ", type=" + type + ", amount=" + amount + "]";
	}
	

}
