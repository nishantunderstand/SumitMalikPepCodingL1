package a3b_NumberPatternQuestion;

import java.util.Scanner;

public class Pattern20WrongButCorrect {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number ");
		int n = 5;
		System.out.println("Your Star ");

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if (i == 1 || i <= n / 2 || i == n) {
					if (j == 1 || j == n) {
						System.out.print("*\t");
					} else {
						System.out.print("\t");
					}
				} else if (i == n / 2 + 1) {
					if (j == 1 || j == n || j == n / 2 + 1) {
						System.out.print("*\t");
					} else {
						System.out.print("\t");
					}
				} else if (i > n / 2 + 1 && i < n) {
					if (j < n / 2 + 1 || j > n / 2 + 1) {
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
