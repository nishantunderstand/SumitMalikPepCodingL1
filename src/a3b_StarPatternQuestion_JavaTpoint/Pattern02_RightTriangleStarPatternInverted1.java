package a3b_StarPatternQuestion_JavaTpoint;

import java.util.Scanner;

public class Pattern02_RightTriangleStarPatternInverted1 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number ");
		int n = sc.nextInt();
		System.out.println("Your Star ");
		for (int i = 0; i < n; i++) {
			for (int j = n; j > i; j--) {
				System.out.print("*" + "\t");
			}
			System.out.println();
		}
		sc.close();
	}

}
