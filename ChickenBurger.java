package com.codegnan.oop.overriding;

public class ChickenBurger extends FoodItem{
	final double deliveryCharge=70;
	public ChickenBurger(String name, double basePrice) {
		super(name, basePrice);
	}
	@Override
	public double calculateTotalPrice() {
		return basePrice+deliveryCharge;
	}
	@Override
	public String getCategory() {
		return "Non-Veg";
	}
	@Override
	public int getPreparationTime() {
		return 15;
	}
	
}
