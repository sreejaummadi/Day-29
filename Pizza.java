package com.codegnan.oop.overriding;

public class Pizza extends FoodItem{
	String size;
	public Pizza(String name, double basePrice,String size) {
		super(name, basePrice);	
		this.size=size;
	}
	@Override
	public double calculateTotalPrice() {
		double extraCharge=0;
		if(size!=null) {
			switch(size.toLowerCase()) {
			case "small":{
				extraCharge=50;
				break;
			}
			case "medium":{
				extraCharge=100;
				break;
			}
			case "large":{
				extraCharge=200;
			}default:{
				extraCharge=0;
				break;
			}	
			}
		}
		return basePrice+extraCharge;
	}
	@Override
	public String getCategory() {
		
		return "veg";
	}
	@Override
	public int getPreparationTime() {
		int time=20;
		if(size!=null) {
			switch(size.toLowerCase()) {
			case "small":{
				time=15;
				break;
			}case "medium":{
				time=22;
				break;
				}case "large":{
					time=22;
					break;
					}default:{
						time=20;
					}
					}
	}
		return time;
	}
	
}
