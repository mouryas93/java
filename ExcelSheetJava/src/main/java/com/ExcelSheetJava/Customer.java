package com.ExcelSheetJava;

import java.util.Scanner;

public class Customer {

	private String Name;
	private String Company;
	private String Location;
	private int ID;
	private String Email;
	private int Salary;
	public int length;

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getCompany() {
		return Company;
	}

	public void setCompany(String company) {
		Company = company;
	}

	public String getLocation() {
		return Location;
	}

	public void setLocation(String location) {
		Location = location;
	}

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public int getSalary() {
		return Salary;
	}

	public void setSalary(int salary) {
		Salary = salary;
	}

	public void InsertData() {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter your ID");
		int iD = sc.nextInt();
		setID(iD);
		sc.nextLine();
		System.out.println("Enter your Name");
		String Name = sc.nextLine();
		setName(Name);
		System.out.println("Enter your Email");
		String Email = sc.nextLine();
		setEmail(Email);
		System.out.println("Enter your Company Name");
		String Comp = sc.nextLine();
		setCompany(Comp);
		System.out.println("Enter your Location of Work");
		String Loc = sc.nextLine();
		setLocation(Loc);
		System.out.println("Enter your Salary");
		int Sal = sc.nextInt();
		setSalary(Sal);

		sc.close();

	}

}
