package com.AutoLoans.Services;

public class Economy extends Autoloan {

	// loan amount, car details, Down payment, percentage of interest.
	String MAKE = "HONDA";
	String MODEL = "ALTIMA";
	int YEAR = 2018;
	int COST = 30000;
	int Loanamount;
	int Downpayment;
	int Rateofintrest=3;

	public void getdetails() {
		System.out.println("Car Make:"+MAKE);
		System.out.println("Model of Car is"+MODEL);
		System.out.println("Year of mfg:"+YEAR);
		System.out.println("Cost of the Car:"+COST);
		
	}
	public int loanamount(int amount) {
		this.Loanamount=amount;
		System.out.println("You are qualified for a loan of.."+Loanamount);
		return Loanamount;
	}

	public int downpayment() {
		Downpayment=COST-Loanamount;
		System.out.println("You are liable of paying "+ Downpayment +" to take your vehicle home");
		return Downpayment;
	}

	public int roi() {
		System.out.println("Rate of intrest for 30 months is.."+Rateofintrest);
		return Rateofintrest;
	}
}
