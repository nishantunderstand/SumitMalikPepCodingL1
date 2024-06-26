package b4_RecursionOnTheWayUp;

import java.util.Scanner;
/**
 * 
 * {@link }
 * If you want your method to be void, then how you plan to print.
 */
public class SubSequencePrint {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your String :");

		// String str = sc.nextLine();
		String str = "abc";

		ArrayListSubSequencePrint(str, "");
		sc.close();
	}

	private static void ArrayListSubSequencePrint(String str, String newStr) {
		if (str.length() == 0) {
			//System.out.println("SubSequence:" + newStr);
			System.out.println(newStr);
			return;
		}
		String curr = str.substring(0, 1);
		String ros = str.substring(1);
		ArrayListSubSequencePrint(ros, newStr + curr);
		ArrayListSubSequencePrint(ros, newStr + "");
	}

}
