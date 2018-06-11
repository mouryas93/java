package com.Sun.Eng;

import java.lang.Math;

public class Maths {

	public void DegreeConversion(double D) {
		System.out.println("Degree value of " + D + " is: " + Math.toDegrees(D));
	}

	public void Log(double L) {
		System.out.println("Log value of " + L + " is: " + Math.log(L));
	}

	public void Exponential(double E) {
		System.out.println("Exponential value of " + E + " is: " + Math.exp(E));
	}

	public void SquareRoot(double S) {
		System.out.println("Square Root of " + S + " is: " + Math.sqrt(S));
	}

	public void CubeRoot(double C) {
		System.out.println("Cubee Root of " + C + " is: " + Math.sqrt(C));
	}

	public void Power(double B, double P) {
		System.out.println("Base " + B + " to the Power " + P + " is: " + Math.pow(B, P));
	}

	public void AdditionExact(long A_1, long A_2) {
		System.out.println("Addition of " + A_1 + " and " + A_2 + " is: " + Math.addExact(A_1, A_2));
	}

	public void MultiplyExact(int M_1, int M_2) {
		System.out.println("Multiplication of " + M_1 + " and " + M_2 + " is: " + Math.multiplyExact(M_1, M_2));
	}

	public void Absolute(int A) {
		System.out.println("Absolute value of " + A + " is: " + Math.abs(A));
	}

	public void Maximum(int Max_1, int Max_2) {
		System.out.println("Maximum value between " + Max_1 + " and " + Max_2 + " is: " + Math.max(Max_1, Max_2));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Maths obj = new Maths();
		obj.DegreeConversion(Math.PI);
		obj.Log(10);
		obj.Exponential(10);
		obj.SquareRoot(144);
		obj.CubeRoot(729);
		obj.Power(2, 10);
		obj.AdditionExact(725, 845);
		obj.MultiplyExact(71, 77);
		obj.Absolute(-45);
		obj.Maximum(958, 758);
		

	}

}
