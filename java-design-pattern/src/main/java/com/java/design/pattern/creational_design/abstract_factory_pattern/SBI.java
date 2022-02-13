package com.java.design.pattern.creational_design.abstract_factory_pattern;

//Create concrete classes that implement the Bank interface.
class SBI implements Bank {
	private final String BNAME;

	public SBI() {
		BNAME = "SBI BANK";
	}

	public String getBankName() {
		return BNAME;
	}
}
