package com.Sun.Eng;

public class Fibonacci {
	int Initial = 1;
	int PreValue = 0;

	Fibonacci(int n) {
		for (int i = 0; i < n; i++) {

			int temp = Initial;

			Initial = Initial + PreValue;

			PreValue = temp;
			System.out.println(Initial);
			if (Initial >= 100) {

				break;
			}

		}
	}
}
