package com.AutoLoans.Services;

import java.util.Scanner;

public class Autoloan extends Customer {

	public void Eligibility() {
		int Salary = super.Salary;
		/* System.out.println("salary" + Salary); */
		int creditscore = getcreditscore();
		/* System.out.println("credit score" + creditscore); */
		Scanner in = new Scanner(System.in);
		Autoloan pr=new Premium();
		Autoloan er=new Economy();
		if (Salary >= 1000) {
			if (creditscore > 601 && creditscore < 700) {
				System.out.println("Eligible for economy vehicles only");
			}
			if (creditscore > 701 && creditscore < 800) {
				System.err.println("Eligible for economy vehicles and restricted eligibility on premium vehicles");
				System.out.println("select your option ");
				System.out.println("Press '1' for Premium class vehicle");
				System.out.println("Press '2' for Economy class vehicle");

				int option = in.nextInt();

				/* if (option == 1 || option == 2) { */
				switch (option) {
				case 1:
					System.out.println("Thanks for choosing Premium vehicle");
					((Premium)pr).getdetails();
					((Premium)pr).loanamount(20000);
					((Premium)pr).downpayment();
					((Premium)pr).roi();
					break;
				case 2:
					System.out.println("Thanks for choosing Economy vehicle");
					((Economy)er).getdetails();
					((Economy)er).loanamount(20000);
					((Economy)er).downpayment();
					((Economy)er).roi();
					break;
				}
			}

			if (creditscore > 801 && creditscore < 900) {
				System.out.println("Eligible for both premium and economy vehicles");
				System.out.println("select your option ");
				System.out.println("Press '1' for Premium class vehicle");
				System.out.println("Press '2' for Economy class vehicle");

				int option = in.nextInt();

				/* if (option == 1 || option == 2) { */
				switch (option) {
				case 1:
					System.out.println("Thanks for choosing Premium vehicle");
					((Premium)pr).getdetails();
					((Premium)pr).loanamount(25000);
					((Premium)pr).downpayment();
					((Premium)pr).roi();
					break;
				case 2:
					System.out.println("Thanks for choosing Economy vehicle");
					((Economy)er).getdetails();
					((Economy)er).loanamount(25000);
					((Economy)er).downpayment();
					((Economy)er).roi();
					break;
				}
			}
			if (creditscore > 550 && creditscore < 600) {
				System.err.println("Restricted Eligibility for economy vehicles");
			}
		}else {
			System.out.println("not eligible for a loan");
		}

		/*if (Salary < 1000 && Salary >= 500) {
			if (creditscore > 601 && creditscore < 700) {
				System.out.println("Eligible for economy vehicles only");
			}
			if (creditscore > 701 && creditscore < 800) {
				System.out.println("Eligible for economy vehicles and restricted eligibility on premium vehicles");
				System.out.println("select your option ");
				System.out.println("Press '1' for Premium class vehicle");
				System.out.println("Press '2' for Economy class vehicle");

				int option = in.nextInt();

				 if (option == 1 || option == 2) { 
				switch (option) {
				case 1:
					System.out.println("Thanks for choosing Premium vehicle");
					break;
				case 2:
					System.out.println("Thanks for choosing Economy vehicle");
					break;
				}
			}
			if (creditscore > 801 && creditscore < 900) {
				System.out.println("Eligible for economy vehicles and restricted eligibility on premium vehicles");
				System.out.println("select your option ");
				System.out.println("Press '1' for Premium class vehicle");
				System.out.println("Press '2' for Economy class vehicle");

				int option = in.nextInt();

				 if (option == 1 || option == 2) { 
				switch (option) {
				case 1:
					System.out.println("Thanks for choosing Premium vehicle");
					break;
				case 2:
					System.out.println("Thanks for choosing Economy vehicle");
					break;
				}
			}
			if (creditscore > 550 && creditscore < 600) {
				System.out.println("Restricted Eligibility for economy vehicles");
			} else {
				System.out.println("not eligible");
			}

		}*/
	}
}
