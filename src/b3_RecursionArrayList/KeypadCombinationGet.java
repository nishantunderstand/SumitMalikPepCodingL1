package b3_RecursionArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class KeypadCombinationGet {
	public static String[] codes = { ".", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "xyz" };

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Codes Combinations:");
		for (int i = 0; i < codes.length; i++) {
			System.out.println(i + "->" + codes[i]);
		}

		System.out.println("Enter Your Digit Combination:");
		String string = scanner.next();

		ArrayList<String> ans = getKPC(string);
		System.out.println(ans);
		for (String i : ans) {
			System.out.println(i);
		}

		scanner.close();
	}

	private static ArrayList<String> getKPC(String str) {

		String ch = str.substring(0, 1);
		// ArrayList<String> rres = getKPC();

		ArrayList<String> mres = new ArrayList<>();

		return null;
	}

}
