package a7a_StringSumitMalik;

import java.util.Scanner;

public class StringCompression {
	private static final String String = null;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = "aaabbcddd";
		System.out.println(str);
		System.out.println(compression1(str));
		System.out.println(compression2(str));
		sc.close();
	}

	private static String compression1(String str) {
		// How to convert Character to String ?
		// String string = str.charAt(0) + "";
		String string = str.substring(0, 1);
		for (int i = 1; i < str.length(); i++) {
			char curr = str.charAt(i);
			char prev = str.charAt(i - 1);
			if (curr != prev) {
				string += curr;
			}
		}
		return string;
	}

	private static String compression2(String str) {
		String string = str.charAt(0) + "";
		int count = 1;

		for (int i = 1; i < str.length(); i++) {
			char curr = str.charAt(i);
			char prev = str.charAt(i - 1);
			if (curr == prev) {
				count++;
			} else {
				if (count > 1) {
					string += count;
					count = 1;
				}
				string += curr;
			}
		}

		if (count > 1) {
			string += count;
		}

		return string;
	}

}
