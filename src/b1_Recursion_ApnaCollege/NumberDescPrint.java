package b1_Recursion_ApnaCollege;

import java.util.Scanner;

public class NumberDescPrint {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the Number : ");
		int n = 7;

		PrintDesc(n);
		sc.close();

	}

	private static void PrintDesc(final int n) {
		if (n == 0) {
			return;
		}

		System.out.println(n);
		PrintDesc(n - 1);
		// System.out.println(n); // Ascending Order
	}

}
