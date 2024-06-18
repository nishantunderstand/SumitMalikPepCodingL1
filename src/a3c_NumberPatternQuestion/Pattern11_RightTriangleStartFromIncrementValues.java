package a3c_NumberPatternQuestion;

import java.util.Scanner;

public class Pattern11_RightTriangleStartFromIncrementValues {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number ");
		int n = sc.nextInt();
		System.out.println("Your Star ");
		int val = 1; // <-- // It Teaches About the Values of where we should declare Variable
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) { // <- Control the width of Pattern
				System.out.print(val + "\t");
				val++;
			}
			System.out.println();
		}
		sc.close();
	}

}
