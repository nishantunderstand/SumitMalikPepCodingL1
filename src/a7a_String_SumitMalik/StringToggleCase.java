package a7a_String_SumitMalik;

import java.util.Scanner;
/**
 * 
 * {@link }
 */
public class StringToggleCase {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Your String :");
		String str = sc.nextLine();
		System.out.println("Entered String :" + str);
		String toggleCaseString = toggleCase(str);
		System.out.println("Toggled String :" + toggleCaseString);
		sc.close();
	}

	private static String toggleCase(String str) {
		StringBuilder stringBuilder = new StringBuilder(str);
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (ch >= 'a' && ch <= 'z')// Lower case
			{
				char upCase = (char) ('A' + ch - 'a');
				stringBuilder.setCharAt(i, upCase);

			} else if (ch >= 'A' && ch <= 'Z') // UPPER CASE
			{
				char loCase = (char) ('a' + ch - 'A');
				stringBuilder.setCharAt(i, loCase);
			}

		}
		return stringBuilder.toString();
	}

}

