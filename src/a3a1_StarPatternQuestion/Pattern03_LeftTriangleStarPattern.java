package a3a1_StarPatternQuestion;

import java.util.Scanner;

public class Pattern03_LeftTriangleStarPattern {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number ");
		int n = sc.nextInt();
		LeftTriangleStarPatternv1(n);
		LeftTriangleStarPatternv2(n);
		sc.close();
	}

	private static void LeftTriangleStarPatternv2(int n) {
		System.out.println("LeftTriangleStarPatternv2 ");
		int sp = n - 1;
		int st = 1;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < sp; j++) {
				System.out.print("\t");
			}
			for (int k = 0; k < st; k++) {
				System.out.print("*\t");
			}

			sp--;
			st++;
			System.out.println();

		}
	}

	private static void LeftTriangleStarPatternv1(int n) {
		System.out.println("LeftTriangleStarPatternv1 ");
		int sp = n - 1;
		int st = 1;
		for (int i = 0; i < n; i++) {
			for (int j = 1; j <= sp; j++) {
				System.out.print("\t");
			}
			for (int k = 1; k <= st; k++) {
				System.out.print("*\t");
			}

			sp--;
			st++;
			System.out.println();
		}

	}

}
