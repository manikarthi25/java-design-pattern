package com.java.design.pattern.creational_design.abstract_factory_pattern;

import java.io.IOException;
import java.util.Scanner;

/*
 Use the FactoryCreator to get AbstractFactory in order to get factories of 
 concrete classes by passing an information such as type.
 */
class AbstractFactoryPatternExample {
	public static void main(String args[]) throws IOException {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the name of Bank from where you want to take loan amount: ");
		String bankName = sc.nextLine();

		System.out.print("\n");
		System.out.print("Enter the type of loan e.g. home loan or business loan or education loan : ");

		String loanName = sc.nextLine();
		AbstractFactory bankFactory = FactoryCreator.getFactory("Bank");
		Bank b = bankFactory.getBank(bankName);

		System.out.print("\n");
		System.out.print("Enter the interest rate for " + b.getBankName() + ": ");

		double rate = sc.nextDouble();
		System.out.print("\n");
		System.out.print("Enter the loan amount you want to take: ");

		double loanAmount = sc.nextDouble();
		System.out.print("\n");
		System.out.print("Enter the number of years to pay your entire loan amount: ");
		int years = sc.nextInt();

		System.out.print("\n");
		System.out.println("you are taking the loan from " + b.getBankName());

		AbstractFactory loanFactory = FactoryCreator.getFactory("Loan");
		Loan l = loanFactory.getLoan(loanName);
		l.getInterestRate(rate);
		l.calculateLoanPayment(loanAmount, years);
	}
}

/*
Enter the name of Bank from where you want to take loan amount: hdfc

Enter the type of loan e.g. home loan or business loan or education loan : business

Enter the interest rate for HDFC BANK: 5.6

Enter the loan amount you want to take: 1000

Enter the number of years to pay your entire loan amount: 5

you are taking the loan from HDFC BANK
your monthly EMI is 19.147353285954672 for the amount 1000.0 you have borrowed
*/