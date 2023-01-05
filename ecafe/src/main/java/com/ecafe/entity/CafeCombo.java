package com.ecafe.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.ecafe.enumeration.ComboType;
@Entity
public class CafeCombo {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long comboId;
	private String name;
	private String detail;
	private String imageUrl;
	private ComboType type;
	private double amount;
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
	public long getComboId() {
		return comboId;
	}
	public void setComboId(long comboId) {
		this.comboId = comboId;
	}
	
	

}
