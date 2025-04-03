package com.example.demo.model;

public class BudgetModel {
	private Integer userId;
	private String category;
	private Integer months;
	private double amount;
	
	public BudgetModel(Integer userId, String category, Integer months, double amount) {
		super();
		this.userId = userId;
		this.category = category;
		this.months = months;
		this.amount = amount;
	}
	
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public Integer getMonths() {
		return months;
	}
	public void setMonths(Integer months) {
		this.months = months;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
}
