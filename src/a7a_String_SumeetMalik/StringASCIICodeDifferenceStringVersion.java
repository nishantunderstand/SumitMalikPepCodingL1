package a7a_String_SumeetMalik;

import java.util.Scanner;

public class StringASCIICodeDifferenceStringVersion {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Please Enter Your String :");
		String str = sc.nextLine();

		String asciiString = StringASCIICodeDifference(str);
		System.out.println(asciiString);
		sc.close();
	}

	private static String StringASCIICodeDifference(String str) {
		String s = str.substring(0, 1);
		for (int i = 1; i < str.length(); i++) {
			char curr = str.charAt(i);
			char prev = str.charAt(i - 1);
			int asd = curr - prev;
			s += asd;
			s += curr;
		}
		return s;
	}

}

/*
 * private static String StringASCIICodeDifference(String str) { String s =
 * str.substring(0, 1); for (int i = 0; i < str.length(); i++) { char curr =
 * str.charAt(i); char prev = str.charAt(i - 1); int asd = curr - prev; s +=
 * asd; s += curr; } return s; }
 * 
 * 
 * private static String StringASCIICodeDifference(String str) { String s =
 * str.substring(0, 1); System.out.println(s); for (int i = 0; i < str.length();
 * i++) { char curr = str.charAt(i); char prev = str.charAt(i - 1); int asd =
 * curr - prev; s += asd; s += curr; System.out.println(s); } return s; }
 */
