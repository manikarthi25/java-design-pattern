package com.java.design.pattern.creational_design.abstract_factory_pattern;

//Create concrete classes that implement the Bank interface.
class ICICI implements Bank {
	private final String BNAME;

	ICICI() {
		BNAME = "ICICI BANK";
	}

	public String getBankName() {
		return BNAME;
	}
}
