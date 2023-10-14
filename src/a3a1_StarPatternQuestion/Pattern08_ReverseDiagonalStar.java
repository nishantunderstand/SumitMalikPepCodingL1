package a3a1_StarPatternQuestion;

import java.util.Scanner;

public class Pattern08_ReverseDiagonalStar {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number");
		int n = sc.nextInt();
		ReverseDiagonalStarv1(n);
		ReverseDiagonalStarv2(n);
		sc.close();
	}

	private static void ReverseDiagonalStarv1(int n) {
		System.out.println("ReverseDiagonalStarv1 ");
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if (i + j == n + 1) {// <--
					System.out.print("*\t");
				} else {
					System.out.print("\t");// <-- Writing Else Code is Compulsory
				}
			}
			System.out.println();
		}
	}

	private static void ReverseDiagonalStarv2(int n) {
		System.out.println("ReverseDiagonalStarv2 ");
		for (int i = 0; i <= n; i++) {
			for (int j = 0; j < n; j++) {
				if (i + j == n) {// <--
					System.out.print("*\t");
				} else {
					System.out.print("\t");// <-- Writing Else Code is Compulsory
				}
			}
			System.out.println();
		}
	}
}