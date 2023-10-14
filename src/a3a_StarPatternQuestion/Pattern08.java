package a3a_StarPatternQuestion;

import java.util.Scanner;

public class Pattern08 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number");
		int n = sc.nextInt();

		System.out.println("Your Star ");

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if (i + j == n + 1) {// <--
					System.out.print("*\t");
				} else {
					System.out.print("\t");// <-- Writing Else Code is Complusory
				}

			}
			System.out.println();

		}
		sc.close();
	}
}