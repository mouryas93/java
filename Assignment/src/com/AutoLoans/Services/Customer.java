package com.AutoLoans.Services;

abstract class Customer {
	private int SSN;
	private int Credit_Score;
	public String Name;
	protected int Age;
	protected int Salary;

	public void setName(String name) {
		Name = name;
	}

	public void setAge(int age) {
		Age = age;
	}

	public void setSalary(int salary) {
		Salary = salary;
	}

	public void setSsn(int Ssn) {
		SSN = Ssn;
	}

	public void setCreditscore(int creditscore) {
		Credit_Score = creditscore;
	}

	protected int getssn() {

		return SSN;
	}

	protected int getcreditscore() {

		return Credit_Score;
	}

}
