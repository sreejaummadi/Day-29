package com.codegnan.oop.overriding;

public class CoolDrink extends FoodItem{

	public CoolDrink(String name, double basePrice) {
		super(name, basePrice);
	}

	@Override
	public double calculateTotalPrice() {
		return basePrice;
	}

	@Override
	public String getCategory() {
		return "veg";
	}

	@Override
	public int getPreparationTime() {
		return 2;
	}
	

}
