package com.java.design.pattern.creational_design.factory_pattern;

//Create a Plan abstract class.
abstract class Plan {
	protected double rate;

	abstract void getRate();

	public void calculateBill(int units) {
		System.out.println(units * rate);
	}
}
