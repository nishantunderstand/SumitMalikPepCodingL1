package a3b_NumberPatternQuestion;

import java.util.Scanner;

public class Pattern20SM {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number ");
		int n = 5;
		System.out.println("Your Star ");
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if (j == 1 || j == n) {
					System.out.print("*\t");
				} else {

				}
			}
			System.out.println();
		}

	}

}
