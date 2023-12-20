package b3_RecursionArrayList;

import java.util.Scanner;

public class SubSequencePrint {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your String :");

		// String str = sc.nextLine();
		String str = "Hello";

		ArrayListSubSequencePrint(str, "");
		sc.close();
	}

	private static void ArrayListSubSequencePrint(String str, String newStr) {
		if (str.length() == 0) {
			System.out.println("SubSequence:" + newStr);
			return;
		}
		String curr = str.substring(0, 1);
		String ros = str.substring(1);
		ArrayListSubSequencePrint(ros, newStr + curr);
		ArrayListSubSequencePrint(ros, newStr + "");
	}

}
