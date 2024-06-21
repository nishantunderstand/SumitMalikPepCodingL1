package b1_Recursion_SumeetMalik_General;

import java.util.Scanner;

public class NumberSumMod {
	public static void main(String[] args) {
		System.out.println("Enter Number :");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		int sum = printSum(n);
		int sum2 = printSum2(n);
		int fact = printFact(n);
		int fact2 = printFact2(n);

		System.out.println("Print Sum :" + sum);
		System.out.println("Print Sum2 :" + sum2);
		System.out.println("Print Factorial  :" + fact);
		System.out.println("Print Factorial2  :" + fact2);
		System.out.println("Fibonacci Sequence :");
		for (int i = 0; i < n; i++) {
			System.out.println(printfib(i) + " ");
		}
	}

	private static int printfib(int n) {
		if (n == 0 || n == 1) {
			return n;
		}
		return printfib(n - 1) + printfib(n - 2);
	}

	private static int printFact(int n) {
		if (n == 0 || n == 1) {
			return 1;
		}
		int facnm1 = n * printFact(n - 1);
		return facnm1;
	}

	private static int printFact2(int n) {
		if (n == 0 || n == 1) {
			return 1;
		}
		return n * printFact(n - 1);

	}

	private static int printSum(int n) {
		if (n == 0) {
			return 0;
		}
		int sum = n + printSum(n - 1);
		return sum;
	}

	private static int printSum2(int n) {
		if (n == 0) {
			return 0;
		}
		return n + printSum(n - 1);
	}

}

/*
 * private static void printSum(int n) { int sum = 0;
 * 
 * if (n == 0) { return sum; }
 * 
 * // void sum = n + printSum(n - 1); //<- Doesn't Exist }
 *
 * private static void printfib(int a, int b, int n) { if (n < 0) { return; }
 * int c = a + b; a = b; b = c; System.out.println(c); printfib(a, b, n - 1); }
 *
 * 
 */
