package a3b_StarPatternQuestion_JavaTpoint;

import java.util.Scanner;

public class Pattern09_Cross_MergeDiagonalAndReverseDiagonal {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number");
		int n = sc.nextInt();
		// Try Odd Number
		System.out.println("Your Star ");

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				// We need to use both cases
				if (i == j || i + j == n + 1) {
					System.out.print("*\t");

				} else {
					System.out.print("\t");
				}

			}
			System.out.println();

		}
		sc.close();
	}
}

/*
 * if (i == j) { System.out.print("*\t"); } else if (i + j == n + 1) {
 * System.out.print("*\t"); } else { System.out.print("\t"); }
 */