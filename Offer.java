package com.lavanya.designpatterns.finalproject;

public class Offer {
	String name;
	int offerInPercentage;
	OfferType type;
	
	public Offer(String name, int offerInPercentage) {
		super();
		this.name = name;
		this.offerInPercentage = offerInPercentage;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getOfferInPercentage() {
		return offerInPercentage;
	}

	public void setOfferInPercentage(int offerInPercentage) {
		this.offerInPercentage = offerInPercentage;
	}

	public OfferType getType() {
		return type;
	}

	public void setType(OfferType type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "Offer [name=" + name + ", offerInPercentage=" + offerInPercentage + ", type=" + type + "]";
	}
	
	
	
}
