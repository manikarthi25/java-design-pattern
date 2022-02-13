package com.java.design.pattern.creational_design.factory_pattern;

import java.io.IOException;
import java.util.Scanner;

class GenerateBill {
	public static void main(String args[]) throws IOException {
		GetPlanFactory planFactory = new GetPlanFactory();

		System.out.print("Enter the name of plan for which the bill will be generated: ");
		Scanner sc = new Scanner(System.in);

		String planName = sc.nextLine();
		System.out.print("Enter the number of units for bill will be calculated: ");
		int units = sc.nextInt();

		Plan p = planFactory.getPlan(planName);
		// call getRate() method and calculateBill()method of DomesticPaln.

		System.out.print("Bill amount for " + planName + " of  " + units + " units is: ");
		p.getRate();
		p.calculateBill(units);
	}
}

/*
 * Output Enter the name of plan for which the bill will be generated: CommercialPlan 
 * Enter the number of units for bill will be calculated: 2
 * Bill amount for CommercialPlan of 2 units is: 15.0
 */