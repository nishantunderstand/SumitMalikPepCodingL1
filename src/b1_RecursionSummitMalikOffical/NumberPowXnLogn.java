package b1_RecursionSummitMalikOffical;

import java.util.Scanner;

public class NumberPowXnLogn {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Number :");
		int x = sc.nextInt();
		System.out.print("Enter the Power Level :");
		int n = sc.nextInt();

		int ans = PowXnLogn(x, n);
		System.out.println("Power of" + x + " Raise to " + n + " == " + ans);
		sc.close();
	}

	private static int PowXnLogn(int x, int n) {
		if (x == 0) {
			return 0;
		}
		if (n == 0) {
			return 1;
		}

		// How to decrease Stack Height?
		// This is related to Memory Performance
		if (n % 2 == 0) {
			return PowXnLogn(x, n / 2) * PowXnLogn(x, n / 2);
		} else {
			return x * PowXnLogn(x, n / 2) * PowXnLogn(x, n / 2);
		}
	}

}
