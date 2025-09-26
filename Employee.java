package com.codegnan.oop.overriding;

public abstract class Employee {
	String name;
	public abstract double calculateSalary();
	public Employee(String name) {
		this.name=name;
	}
	public void display() {
		System.out.println("Name : "+name);
	}
}
