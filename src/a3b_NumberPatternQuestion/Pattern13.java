package a3b_NumberPatternQuestion;

import java.util.Scanner;

public class Pattern13 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = 6;
		int val = 1;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(val + "\t");
			}
			System.out.println();
		}
		sc.close();
	}

}
