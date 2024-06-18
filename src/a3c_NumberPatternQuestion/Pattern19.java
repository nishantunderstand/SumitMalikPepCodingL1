package a3c_NumberPatternQuestion;

import java.util.Scanner;

public class Pattern19 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number ");
		int n = 5;
		System.out.println("Your Star ");
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if (i == 1) {
					if (j <= n / 2 + 1 || j == n) {
						System.out.print("*\t");
					} else {
						System.out.print("\t");
					}
				}
				// else if (i > 1 && i < n / 2) This is Wrong
				else if (i <= n / 2) {
					if (j == n / 2 + 1 || j == n) {
						System.out.print("*\t");
					} else {
						System.out.print("\t");
					}
				} else if (i == n / 2 + 1) {
					System.out.print("*\t");

				} else if (i > n / 2 + 1 && i < n) {
					if (j == n / 2 + 1 || j == 1) {
						System.out.print("*\t");
					} else {
						System.out.print("\t");
					}

				} else if (i == n) {
					if (j >= n / 2 + 1 || j == 1) {
						System.out.print("*\t");
					} else {
						System.out.print("\t");
					}

				}

			}
			System.out.println();
		}

		sc.close();
	}

}
