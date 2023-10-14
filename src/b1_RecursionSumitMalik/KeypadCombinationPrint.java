package b1_RecursionSumitMalik;

import java.util.Scanner;

public class KeypadCombinationPrint {
	public static String[] keypad = { ".", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };

	public static void printComb(String str, int idx, String combination) {
		if (idx == str.length()) {
			System.out.println("Keybad Input Combination : " + combination);
			return;
		}
		char currChar = str.charAt(idx);

		String mapping = keypad[currChar - '0'];
		// String mapping = keypad[currChar - '0'];

		for (int i = 0; i < mapping.length(); i++) {
			printComb(str, idx + 1, combination + mapping.charAt(i));
		}

	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Keypad Combination:");

		for (int i = 0; i < keypad.length; i++) {
			System.out.println(i + "->" + keypad[i]);
		}

		System.out.println("Enter your Keypad Number :");
		String str = scanner.nextLine();
		System.out.println("keybad Input :" + str);
		printComb(str, 0, "");
		scanner.close();
	}

}

/*
 * for (String i : keypad) { System.out.println(i); }
 * 
 * 
 */
