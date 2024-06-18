package a7a_String_SumitMalik;

import java.util.Scanner;

public class StringPalindromeByStringBuilder {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter Your String :");
		String nString = scanner.nextLine();

		StringBuilder stringBuilder = new StringBuilder(nString);
		String reverseStringBuilder = stringBuilder.reverse().toString();

		if (nString.equalsIgnoreCase(reverseStringBuilder))
			System.out.println("Yes it's Palindrome: " + nString);
		else {
			System.out.println("This is not Palindrone: " + nString);
		}

		scanner.close();

	}

}

/*
 * 
 * 
 * StringBuilder stringBuilder = new StringBuilder(nString); StringBuilder
 * reverseStringBuilder = stringBuilder.reverse().toString();
 * 
 * if (stringBuilder == reverseStringBuilder) {
 * System.out.println("Yes Palindrome" + stringBuilder); } else {
 * System.out.println("Not Palindrome" + stringBuilder); }
 * 
 * scanner.close();
 * 
 * 
 */
