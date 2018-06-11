package com.Sun.Eng;

import java.util.Random;
import java.util.Scanner;

public class ArrayMaxVSMinDifference {

	/* ArrayMaxVSMinDifference() { */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the size of the arr=");
		int size = in.nextInt();
		in.nextLine();
		int Array[] = new int[size];
		System.out.println("Enter the numbers of the arr=");

		for (int i = 0; i < Array.length; i++) {
			Array[i] = in.nextInt();
		}
		printArray(Array);
		int Max=getMax(Array);
		int Min=getMin(Array);
		System.out.println("Max_Value=" + getMax(Array));
		System.out.println("Min_Value=" + getMin(Array));
		System.out.println("Difference of Values="+(Max-Min));
	}

	public static void printArray(int arr[]) {

		int n = arr.length;
System.out.print("Array=");
		for (int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

	public static int getMax(int[] inputArray) {
		int maxValue = inputArray[0];
		for (int i = 1; i < inputArray.length; i++) {
			if (inputArray[i] > maxValue) {
				maxValue = inputArray[i];
			}
		}
		return maxValue;
	}

	// Method for getting the minimum value
	public static int getMin(int[] inputArray) {
		int minValue = inputArray[0];
		for (int i = 1; i < inputArray.length; i++) {
			if (inputArray[i] < minValue) {
				minValue = inputArray[i];
			}
		}
		return minValue;
	}

}