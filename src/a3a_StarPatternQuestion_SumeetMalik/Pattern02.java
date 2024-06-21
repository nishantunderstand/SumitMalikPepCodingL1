package a3a_StarPatternQuestion_SumeetMalik;

import java.util.Scanner;

// This code is not working as Excepted. You need to look into it
// Logic Building is tough. So Ignore it. Discard it.

public class Pattern02 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number ");
		int n = 5;
		System.out.println("Your Star ");
		for (int i = 1; i <= n; i++) {
			for (int j = n; j >= i; j--) {
				System.out.print("*" + "\t");
			}
			System.out.println();
		}
		sc.close();
	}

}
