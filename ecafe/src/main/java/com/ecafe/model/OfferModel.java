package com.ecafe.model;

import java.sql.Date;

import com.ecafe.enumeration.OfferType;

public class OfferModel {
	private long offerId;
	private String offerCode;
	private OfferType offertype;
	private String detial;
	private boolean enables;
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
	public OfferModel(int offerId, String offerCode, OfferType offertype, String detial, boolean enables, Date validTill,
			int offerValue) {
		super();
		this.offerId = offerId;
		this.offerCode = offerCode;
		this.offertype = offertype;
		this.detial = detial;
		this.enables = enables;
		this.validTill = validTill;
		this.offerValue = offerValue;
	}
	public OfferModel() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "OfferModel [offerId=" + offerId + ", offerCode=" + offerCode + ", offertype=" + offertype + ", detial="
				+ detial + ", enables=" + enables + ", validTill=" + validTill + ", offerValue=" + offerValue + "]";
	}
	

}
