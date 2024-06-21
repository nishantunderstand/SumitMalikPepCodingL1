package a7a_String_SumeetMalik;

import java.util.Scanner;

public class StringPalindromeByComparingElement {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter Your String :");
		String nString = scanner.nextLine();
		System.out.println("Entered String :" + nString);
		System.out.println("String is Palindrome :" + isPalindrome(nString));
		scanner.close();

	}

	private static boolean isPalindrome(String nString) {

		int i = 0;
		int j = nString.length() - 1;
		while (i <= j) {
			if (nString.charAt(i) != nString.charAt(j))
				return false;
			i++;
			j--;
		}
		return true;
	}

}
