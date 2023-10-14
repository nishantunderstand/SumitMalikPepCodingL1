package b1_Recursion;

import java.util.Scanner;

public class FibonacciSeriesPrint {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter No of Term you want to Input :");
		int n = scanner.nextInt();
		int a = 0;
		int b = 1;
		System.out.println("Your Fibonaaci Numbers:");
		System.out.println(a);
		System.out.println(b);
		PrintFibonacciSeries(a, b, n - 2);
		scanner.close();
	}

	private static void PrintFibonacciSeries(int a, int b, int n) {
		if (n == 0) {
			return;
		}

		int c = a + b;
		System.out.println(c);
		PrintFibonacciSeries(b, c, n - 2 + 1);
	}

}
