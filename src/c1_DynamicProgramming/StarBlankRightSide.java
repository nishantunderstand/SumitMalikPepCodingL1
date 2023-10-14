package c1_DynamicProgramming;

import java.util.Scanner;

public class StarBlankRightSide {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number ");
		int n = sc.nextInt();
		System.out.println("Your Star ");
		int sp = n - 1;
		int st = 1;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= sp; j++) {
				System.out.print(" ");
			}
			for (int k = 1; k <= st; k++) {
				System.out.print("*");
			}

			sp--;
			st++;
			System.out.println();
		}
		sc.close();
	}

}
