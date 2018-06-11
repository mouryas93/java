package com.Sun.Eng;

import java.util.*;

public class Palandrome {

	public static void main(String[] args) {
		Palandrome obj = new Palandrome();

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String=");
		String Array = sc.nextLine();
		System.out.println("Entered String is=" + Array);
		obj.Reverse(Array);
	}

	public void Reverse(String array) {
		String Reverse = new StringBuffer(array).reverse().toString();
		System.out.println("Reverse String is=" + Reverse);
		Execution(array, Reverse);

	}

	public void Execution(String String_1, String String_2) {
		if (String_1.equals(String_2)) {
			System.out.println("it is a palindrome");
		} else {
			System.out.println("it's not a palindrome");
		}
	}
}
