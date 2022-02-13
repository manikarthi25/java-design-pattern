package com.java.design.pattern.creational_design.abstract_factory_pattern;

//Create an abstract class (i.e AbstractFactory) to get the factories for Bank and Loan Objects.
abstract class AbstractFactory {
	
	public abstract Bank getBank(String bank);

	public abstract Loan getLoan(String loan);
	
}
