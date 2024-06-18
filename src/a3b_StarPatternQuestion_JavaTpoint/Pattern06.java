package a3b_StarPatternQuestion_JavaTpoint;

import java.util.Scanner;

public class Pattern06 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Your Number");
		int n = 5;
		scanner.close();
		// ! Assumption Entered Number is Odd Always
		if (n % 2 == 0) {
			System.out.println("Error Occured!!!! , Try Odd Number");
			return;
		}

		int st = n / 2 + 1;
		int sp = 1;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= st; j++) {
				System.out.print("*\t");
			}

			for (int j = 1; j <= sp; j++) {
				System.out.print("\t");
			}

			for (int j = 1; j <= st; j++) {
				System.out.print("*\t");
			}
			// Why this Code is Present Here ?
			// Whyn't declare at the top of the Program.
			if (i <= n / 2) {
				st--;
				sp += 2;

			} else {
				st++;
				sp -= 2;
			}
			System.out.println();
		}

		scanner.close();
	}

}
