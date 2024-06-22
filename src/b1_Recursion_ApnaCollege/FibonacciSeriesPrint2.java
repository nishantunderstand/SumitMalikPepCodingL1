package b1_Recursion_ApnaCollege;

import java.util.Scanner;

public class FibonacciSeriesPrint2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		// Does Fibonacci Start From 0 or 1?
		int n = 10;
		int a = 1;
		int b = 1;
		System.out.println("Your Fibonaaci Numbers:");
		System.out.print(a+" ");
		System.out.print(b+" ");
		PrintFibonacciSeries(a, b, n - 2);
		scanner.close();
	}

	// It doesn't matter, Whether we pass k or n. In both case we will get same result
	private static void PrintFibonacciSeries(int a, int b, int n) {
		if (n == 0) {
			return;
		}

		int c = a + b;
		System.out.print(c+" ");
		PrintFibonacciSeries(b, c, n - 1);
	}

}
