package a2_GettingStarted;

import java.util.Scanner;

public class FibonacciSeriesPrint_c {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter No of Term you want to Input :");
		int n = scanner.nextInt();
		int a = 0;
		int b = 1;
		System.out.println(a);
		System.out.println(b);
		for (int i = 1; i <= n - 2; i++) {
			int c = a + b;
			System.out.println(c);
			a = b;
			b = c;
		}
		scanner.close();
	}

}
