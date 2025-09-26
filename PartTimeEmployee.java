package com.codegnan.oop.overriding;

public class PartTimeEmployee extends Employee{
	double HourlyRate;
	int hoursWorked;
	public PartTimeEmployee(String name,double HourlyRate,int hoursWorked) {
		super(name);
		this.HourlyRate=HourlyRate;
		this.hoursWorked=hoursWorked;
	}
	@Override
	public double calculateSalary() {
		// TODO Auto-generated method stub
		return HourlyRate*hoursWorked;
	}
}
