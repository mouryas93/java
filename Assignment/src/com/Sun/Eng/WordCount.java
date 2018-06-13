package com.Sun.Eng;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.*;

public class WordCount {
	public static void main(String arg[]) throws Exception {

		FileReader fr = new FileReader("file path");
		BufferedReader br = new BufferedReader(fr);
		String str = br.readLine();

		String[] splitStr = str.split(" ");
		System.out.println("total word in the file:" + str.length());
		System.out.println(splitStr);
		int count = 0;
		List<String> list = new ArrayList<>();
		for (String s : splitStr) {
			if (!list.contains(s)) {
				list.add(s);
			}
		}
		for (int i = 0; i < list.size(); i++) {
			for (int j = 0; j < splitStr.length; j++) {
				if (list.get(i).equals(splitStr[j])) {
					count++;
				}
			}
			System.out.println("count of " + list.get(i) + " is " + count + " times.");
			count = 0;
		}
		br.close();
	}
}
