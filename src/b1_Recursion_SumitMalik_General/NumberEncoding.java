package b1_Recursion_SumitMalik_General;


import java.util.Arrays;
import java.util.Scanner;

public class NumberEncoding {
	public static String[] encode = { "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p",
			"q", "r", "s", "t", "u", "v", "w", "x", "y", "z" };

	public static void main(String[] args) {
		System.out.println("Your Encode:");
		System.out.println(Arrays.toString(encode));

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your code");

		String input = scanner.next();
		System.out.println("You Entered :" + input);

		NumberEncoding(input);

		scanner.close();

	}

	private static void NumberEncoding(String str) {

		String subEnc = "";
		for (int i = 1; i < str.length(); i++) {
			subEnc = str.substring(0, i);
			System.out.println("SubEncoding :" + subEnc);
			String map = encode[Integer.parseInt(subEnc)];
			System.out.println("Mapped:" + map);
		}

	}

}
