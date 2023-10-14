package a3b_NumberPatternQuestion;

import java.util.Scanner;

public class Pattern14 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number ");
		int x = sc.nextInt();
		System.out.println("Number of times:");
		int n = sc.nextInt();
		System.out.println("Your Table ");
		for (int i = 1; i <= n; i++) {
			int mul = x * i;
			System.out.println(x + "*" + i + "=" + mul);
		}
		sc.close();
	}

}
