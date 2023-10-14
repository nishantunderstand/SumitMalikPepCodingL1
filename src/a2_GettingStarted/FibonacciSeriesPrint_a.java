package a2_GettingStarted;

import java.util.Scanner;

public class FibonacciSeriesPrint_a {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter No of Term you want to Input :");
		int n = scanner.nextInt();
		int a = 0;
		int b = 1;
		for (int i = 1; i <= n; i++) {
			int c = a + b;
			System.out.println(a);
			a = b;
			b = c;

		}

		scanner.close();
	}

}
