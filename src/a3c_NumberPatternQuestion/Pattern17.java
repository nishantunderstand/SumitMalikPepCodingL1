package a3c_NumberPatternQuestion;

import java.util.Scanner;

public class Pattern17 {
	public static void main(String[] args) {
		// Incorrect Approach Jan 25,2023
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number ");
		int n = 5;
		System.out.println("Your Star ");
		int str = 1;
		int sp = n / 2;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= sp; j++) {
				System.out.print("\t");
			}

			for (int j = 1; j <= str; j++) {
				if (j >= n / 2 && j < n) {
					System.out.print("*\t");
				} else {
					System.out.print("\t");

				}

			}

			if (i <= n / 2) {
				sp--;
				str += 2;
			} else {
				sp++;
				str -= 2;

			}
			System.out.println();

		}
		sc.close();
	}

}
