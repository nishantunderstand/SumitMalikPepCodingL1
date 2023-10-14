package a3b_NumberPatternQuestion;

import java.util.Scanner;

public class Pattern18 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number ");
		int n = 7;
		System.out.println("Your Star ");
		int sp = 0;
		int st = n;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= sp; j++) {
				System.out.print("\t");
			}
			for (int j = 1; j <= st; j++) {
				// Why we need i & j Both Condition
				// Why cann't j be less than n , Why use st ?
				if (i > 1 && i <= n / 2 && j > 1 && j < st) {
					System.out.print("\t");
				} else {
					System.out.print("*\t");
				}

			}

			if (i <= n / 2) {
				sp++;
				st -= 2;
			} else {
				sp--;
				st += 2;
			}

			System.out.println();
		}
		sc.close();
	}

}
