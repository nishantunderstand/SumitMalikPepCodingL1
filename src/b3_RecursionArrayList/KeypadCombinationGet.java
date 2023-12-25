package b3_RecursionArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class KeypadCombinationGet {
	public static String[] codes = { ".", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "xyz" };
	// Can we use Enum Instead of this ?
	// This is going to really awesome.

	public static void main(String[] args) {
		// public static String[] codes = { ".", "abc", "def", "ghi", "jkl", "mno",
		// "pqrs", "tu", "vwx", "xyz" };
		// Why cannot we declare it ?
		Scanner scanner = new Scanner(System.in);

		/*
		 * System.out.println("Codes Combinations:"); for (int i = 0; i < codes.length;
		 * i++) { System.out.println(i + "->" + codes[i]); }
		 */

		System.out.println("Enter Your Digit Combination:");
		// String string = scanner.next();
		String string = "567";

		ArrayList<String> ans = getKPC(string);
		System.out.println(ans);
		/*
		 * for (String i : ans) { System.out.println(i); }
		 */
		scanner.close();
	}

	private static ArrayList<String> getKPC(String str) {
		if (str.length() == 0) {
			ArrayList<String> bres = new ArrayList<String>();
			bres.add("");
			return bres;
		}

		// String ch = str.substring(0, 1);
		// Char ch = str.charAt(0);
		// char ch = str.charAt(0);
		// String to Integer '6' Not equal to 6

		char ch = str.charAt(0);
		String ros = str.substring(1);
		ArrayList<String> rres = getKPC(ros);
		ArrayList<String> mres = new ArrayList<>();
		String codeforch = codes[ch - '0'];
		for (int i = 0; i < codeforch.length(); i++) {
			char chcode = codeforch.charAt(i);
			for (String rstr : rres) {
				mres.add(chcode + rstr);
			}
		}

		return mres;
	}

}
