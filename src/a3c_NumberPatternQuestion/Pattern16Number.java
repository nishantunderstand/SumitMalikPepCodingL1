package a3c_NumberPatternQuestion;

import java.util.Scanner;

public class Pattern16Number {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number ");
		int n = 4;
		System.out.println("Your Star ");
		int str = 1;
		int sp = 2 * n - 3;

		for (int i = 1; i <= n; i++) {
			int val = 1;
			// Why Take val inside the loop ?
			for (int j = 1; j <= str; j++) {
				System.out.print(val + "\t");
				val++;
			}
			for (int j = 1; j <= sp; j++) {
				System.out.print("\t");
			}

			// Why we need it ? Remove Extra Star in the End
			if (i == n) {
				str--;
				val--; // Why did we Apply it ???

			}
			for (int j = 1; j <= str; j++) {
				val--;
				System.out.print(val + "\t");
				// val--; Why Not here ??
			}

			str++;
			sp -= 2;
			System.out.println();
		}
		sc.close();
	}

}
