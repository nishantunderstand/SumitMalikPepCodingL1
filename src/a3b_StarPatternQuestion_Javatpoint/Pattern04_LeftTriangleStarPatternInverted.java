package a3b_StarPatternQuestion_Javatpoint;

import java.util.Scanner;

public class Pattern04_LeftTriangleStarPatternInverted {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number ");
		int n = sc.nextInt();
		System.out.println("Your Star ");
		int st = n;
		int sp = 0;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= sp; j++) {
				System.out.print("\t");
			}
			for (int k = 1; k <= st; k++) {
				System.out.print("*\t");
			}

			sp++;
			st--;
			System.out.println();
		}
		sc.close();
	}

}
