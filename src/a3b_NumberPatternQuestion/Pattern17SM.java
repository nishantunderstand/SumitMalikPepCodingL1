package a3b_NumberPatternQuestion;

import java.util.Scanner;

public class Pattern17SM {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number ");
		int n = 7;
		System.out.println("Your Star ");
		int str = 1;
		int sp = n / 2;
		for (int i = 1; i <= n; i++) {
			// System.out.print(sp + "," + str);

			for (int j = 1; j <= sp; j++) {
				// i or j , Which One will be Used and Why ???
				if (i == n / 2 + 1) {
					System.out.print("*\t");
				} else {
					System.out.print("\t");
				}

			}
			for (int j = 1; j <= str; j++) {
				System.out.print("*\t");
			}

			if (i <= n / 2) {
				str++;
			} else {
				str--;
			}
			System.out.println();

		}
		sc.close();
	}

}
