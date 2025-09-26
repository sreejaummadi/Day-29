package com.codegnan.oop.overriding;

public class FullTimeEmployee extends Employee{
	double MonthlySalary;
	public FullTimeEmployee(String name,double MonthlySalary) {
		super(name);
		this.MonthlySalary=MonthlySalary;
	}
	@Override
	public double calculateSalary() {
		// TODO Auto-generated method stub
		return MonthlySalary;
	}
	
}
