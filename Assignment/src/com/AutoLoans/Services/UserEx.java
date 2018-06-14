package com.AutoLoans.Services;

import java.util.*;
public class UserEx extends Autoloan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your Name...");
		String name=sc.nextLine();
		System.out.println("Enter your age...");
		int age=sc.nextInt();
		System.out.println("Enter your SSN details...");
		int ssn=sc.nextInt();
		System.out.println("Enter you Credit Score...");
		int creditscore=sc.nextInt();
		System.out.println("Enter your Salary...");
		int sal=sc.nextInt();
		
		
		UserEx user=new UserEx();
		user.setName(name);
		user.setAge(age);
		user.setSsn(ssn);
		user.setCreditscore(creditscore);
		user.setSalary(sal);
		user.Eligibility();
		
sc.close();
		
	}

}
