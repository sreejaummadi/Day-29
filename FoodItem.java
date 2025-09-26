package com.codegnan.oop.overriding;

public abstract class FoodItem {
	String name;
	double basePrice;
	public FoodItem(String name, double basePrice) {
		super();
		this.name = name;
		this.basePrice = basePrice;
	}
	public abstract double calculateTotalPrice(); 
	public abstract String getCategory(); 
	public abstract int getPreparationTime(); 
	public void display() {
		System.out.println("Food Item "+name);
		System.out.println("Base Price "+basePrice);
	}
}
