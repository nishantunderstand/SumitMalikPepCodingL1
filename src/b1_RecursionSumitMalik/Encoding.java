package b1_RecursionSumitMalik;

import java.util.Scanner;

public class Encoding {
	public static void main(String[] args) {
		System.out.println("Number Encoding");
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		printEncoding(str, "");
		sc.close();
	}

	private static void printEncoding(String ques, String asf) {
		// Base Case <-- Why Needed
		if (ques.length() == 0) {
			System.out.println(asf);
			return;
		}

		// String Length = 1
		else if (ques.length() == 1) {
			char ch = ques.charAt(0);
			// Case 1 String is 0
			if (ch == '0')// <-- Very Tricky Part
			{

				return;
			} else {
				// Case 1 String is not Zero
				int chv = ch - '0'; // Str -> Integer
				char code = (char) (chv + 'a' - 1); // Integer -> Character , TypeCast
				asf += code;
				System.out.println(asf);
			}
		}

		// String Length = 2 OR Greater than 2
		else {
			char ch = ques.charAt(0);

			// First Character is 0
			if (ch == '0') {

				return;
			} else {
				String roq = ques.substring(1);
				int chv = ch - '0'; // Str -> Integer
				char code = (char) (chv + 'a' - 1); // Integer -> Character , TypeCast
				asf += code;
				printEncoding(roq, asf);
			}

			// First Character is not Zero
			String ch12 = ques.substring(0, 2);
			String roq12 = ques.substring(2);
			int ch12v = Integer.parseInt(ch12);
			if (ch12v <= 26) {
				char code12 = (char) (ch12v + 'a' - 1); // Integer -> Character , TypeCast
				asf += code12;
				printEncoding(roq12, asf);
			}
		}
	}
}
