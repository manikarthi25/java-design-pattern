package com.java.design.pattern.creational_design.factory_pattern;

//Create the concrete classes that extends Plan abstract class
class DomesticPlan extends Plan {
	// @override
	public void getRate() {
		rate = 3.50;
	}
}
