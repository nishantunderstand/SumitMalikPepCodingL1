package a3b_NumberPatternQuestion;

import java.util.Scanner;

public class Pattern12 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number ");
		int n = sc.nextInt();
		System.out.println("Your Star ");
		int a = 0;
		int b = 1;

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				// int c = a + b;
				// a = b;
				// b = c;
				// If i Write Here a,b,c -> Answer would be different, How to know ? Where to
				// put the code,
				// Reason I am writting in Bottom, I want code to be start from 0 Not 1
				System.out.print(a + "\t");
				int c = a + b;
				a = b;
				b = c;
			}
			System.out.println();
		}
		sc.close();
	}

}
