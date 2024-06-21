package b1_Recursion_SumeetMalik_General;

import java.util.Scanner;

public class StringPermutations {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Please Enter Your String :");
		String str = sc.nextLine();

		System.out.println("Your Entered String :" + str);
		System.out.println("Permutation of String :");
		StringPermutations(str, "");
		sc.close();
	}

	private static void StringPermutations(String str, String pString) {
		if (str.length() == 0) {
			System.out.println(pString);
			return;
		}
		for (int i = 0; i < str.length(); i++) {
			// abc -> cur - a , rem - bc
			char curr = str.charAt(i);
			String remString = str.substring(0, i) + str.substring(i + 1);
			StringPermutations(remString, pString + curr);
		}

	}

}
