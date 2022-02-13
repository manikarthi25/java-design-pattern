package com.java.design.pattern.creational_design.abstract_factory_pattern;

//Create concrete classes that implement the Bank interface.
class HDFC implements Bank {
	private final String BNAME;

	public HDFC() {
		BNAME = "HDFC BANK";
	}

	public String getBankName() {
		return BNAME;
	}
}
