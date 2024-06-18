package a3c_NumberPatternQuestion;

import java.util.Scanner;

public class Pattern14New {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number ");
		int x = sc.nextInt();
		System.out.println("Your Table ");
		for (int i = 1; i <= 10; i++) {
			System.out.println(x + " * " + i + " = " + x * i);
		}
		sc.close();
	}

}
