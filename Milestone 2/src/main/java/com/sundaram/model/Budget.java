package com.sundaram.model;

import org.springframework.stereotype.Component;

@Component
public class Budget {
	
	private int id;
	private String category;
	private double amount;
	private String month;
	
	public Budget(int id, String category, double amount, String month) {
		super();
		this.id = id;
		this.category = category;
		this.amount = amount;
		this.month = month;
	}
	public Budget() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public String getMonth() {
		return month;
	}
	public void setMonth(String month) {
		this.month = month;
	}
	@Override
	public String toString() {
		return "Budget [id=" + id + ", category=" + category + ", amount=" + amount + ", month=" + month + "]";
	}

}
