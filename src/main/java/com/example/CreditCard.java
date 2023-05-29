package com.example;

public class CreditCard extends Payment {

	
	private String cardType;
	
	public CreditCard() {
		
	}
	
	public void setCardType(String cardType) {
		this.cardType = cardType;
	}
	
	public String getCardType() {
		return cardType;
	}
	
}
