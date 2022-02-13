package com.java.design.pattern.creational_design.abstract_factory_pattern;

//Create concrete classes that extend the Loan abstract class
class BussinessLoan extends Loan {
	public void getInterestRate(double r) {
		rate = r;
	}

}