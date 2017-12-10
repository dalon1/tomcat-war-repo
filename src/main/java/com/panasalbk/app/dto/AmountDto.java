package com.panasalbk.app.dto;

public class AmountDto {
	private double amount;
	private String currency;
	
	public AmountDto() {
		this.currency = "CAD";
	}
	
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public String getCurrency() {
		return currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	

}
