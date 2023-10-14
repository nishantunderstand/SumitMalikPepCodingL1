package a7a_StringSumitMalik;

import java.util.Scanner;

public class SubStringPalindrome {
	private static boolean isPalindrome(String subString) {
		int i = 0;
		int j = subString.length() - 1;
		while (i <= j) {
			if (subString.charAt(i) != subString.charAt(j)) {
				return false;
			} else {
				i++;
				j--;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Your String :");
		String str = sc.nextLine();
		SubString(str);
		sc.close();
	}

	private static void SubString(String str) {
		for (int i = 0; i < str.length(); i++) {
			for (int j = i + 1; j <= str.length(); j++) {
				String subString = str.substring(i, j);

				if (isPalindrome(subString) == true) {
					System.out.println(subString);

				}
			}
		}

	}

}
