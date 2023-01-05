package com.ecafe.entity;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.ecafe.enumeration.OfferType;
import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
public class Offer {
	@Id
	//@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long offerId;
	private String offerCode;
	private OfferType offertype;
	private String detial;
	private boolean enables;
	@JsonFormat(pattern="yyyy-mm-dd")
	private Date validTill;
	private int offerValue;
	public long getOfferId() {
		return offerId;
	}
	public void setOfferId(long offerId) {
		this.offerId = offerId;
	}
	public String getOfferCode() {
		return offerCode;
	}
	public void setOfferCode(String offerCode) {
		this.offerCode = offerCode;
	}
	public OfferType getOffertype() {
		return offertype;
	}
	public void setOffertype(OfferType offertype) {
		this.offertype = offertype;
	}
	public String getDetial() {
		return detial;
	}
	public void setDetial(String detial) {
		this.detial = detial;
	}
	public boolean isEnables() {
		return enables;
	}
	public void setEnables(boolean enables) {
		this.enables = enables;
	}
	public Date getValidTill() {
		return validTill;
	}
	public void setValidTill(Date validTill) {
		this.validTill = validTill;
	}
	public int getOfferValue() {
		return offerValue;
	}
	public void setOfferValue(int offerValue) {
		this.offerValue = offerValue;
	}
	

}
