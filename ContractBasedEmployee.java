package com.codegnan.oop.overriding;

public class ContractBasedEmployee extends Employee{
	double ContractAmount;
	public ContractBasedEmployee(String name,double ContractAmount) {
		super(name);
		this.ContractAmount=ContractAmount;
	}

	@Override
	public double calculateSalary() {
		// TODO Auto-generated method stub
		return ContractAmount;
	}
	

}
