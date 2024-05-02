package b1_RecursionSumitMalikGeneral;

import java.util.Scanner;

public class StringPermutationPep {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter your String:");
		String str = scanner.nextLine();
		System.out.println("Your String : " + str);
		System.out.println("String Permutation :");
		StringPermutationPep(str, "");
		scanner.close();
	}

	private static void StringPermutationPep(String str, String asf) {
		if (str.length() == 0) {
			System.out.println(asf);
			return;
		}
		for (int i = 0; i < str.length(); i++) {
			char curr = str.charAt(i);
			String leftstr = str.substring(0, i);
			String rightstr = str.substring(i + 1);
			String ros = leftstr + rightstr;
			StringPermutationPep(ros, asf + curr);
		}
	}
}
