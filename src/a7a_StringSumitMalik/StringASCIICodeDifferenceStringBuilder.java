package a7a_StringSumitMalik;

import java.util.Scanner;

public class StringASCIICodeDifferenceStringBuilder {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Please Enter Your String :");
		String str = sc.nextLine();

		StringASCIICodeDifference(str);
		sc.close();
	}

	private static void StringASCIICodeDifference(String str) {
		StringBuilder s = new StringBuilder();
		// StringBuilder sb = new StringBuilder(str); // Here Why Str Create Empty
		// StringBuilder
		// s.charAt(0);// ERROR
		// s.append(s.charAt(0)); //s <--
		s.append(str.charAt(0));

		for (int i = 1; i < str.length(); i++) {
			char curr = str.charAt(i);
			char prev = str.charAt(i - 1);
			int gap = curr - prev;

			s.append(gap);
			s.append(curr);
		}
		System.out.println(s);
	}

}
