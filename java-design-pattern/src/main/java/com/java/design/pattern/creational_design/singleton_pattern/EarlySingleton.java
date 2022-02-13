package com.java.design.pattern.creational_design.singleton_pattern;

public class EarlySingleton {

	/*
	   we create the instance of the class at the time of declaring the static data
	   member, so instance of the class is created at the time of classloading.
	 */

	private static EarlySingleton earlySingletonObject = new EarlySingleton();
	// Early, instance will be created at load time

	private EarlySingleton() {
	}

	public static EarlySingleton getEarlySingleton() {
		return earlySingletonObject;
	}

	public void doSomething() {
		// write your code
	}

}
