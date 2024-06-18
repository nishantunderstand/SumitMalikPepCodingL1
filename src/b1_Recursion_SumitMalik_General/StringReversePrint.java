package b1_Recursion_SumitMalik_General;

import java.util.Scanner;

public class StringReversePrint {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the String :");
		String str = sc.next();
		PrintRev(str, str.length() - 1);
		sc.close();
	}

	private static void PrintRev(String str, int idx) {
		if (idx < 0) {
			return;
		}
		System.out.print(str.charAt(idx));
		PrintRev(str, idx - 1);
	}

}
