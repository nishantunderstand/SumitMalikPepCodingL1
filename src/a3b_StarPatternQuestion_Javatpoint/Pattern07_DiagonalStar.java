package a3b_StarPatternQuestion_Javatpoint;

import java.util.Scanner;

public class Pattern07_DiagonalStar {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number");
		// int n = sc.nextInt();
		int n = 7;

		System.out.println("Your Star ");

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if (i == j) {
					System.out.print("*\t");
				} else {
					System.out.print("\t");// <-- Writing Else Code is Compulsory
				}

			}
			System.out.println();

		}
		sc.close();
	}
}