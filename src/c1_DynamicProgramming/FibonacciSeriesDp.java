package c1_DynamicProgramming;

public class FibonacciSeriesDp {
	public static void main(String[] args) {
		// Scanner scanner = new Scanner(System.in);
		// System.out.println("Enter your Number :");
		// int n = scanner.nextInt();
		int n = 10;
		int ans = FibonacciSeriesByDp(n, new int[n + 1]);
		System.out.println("Fibonacci :" + ans);
		// scanner.close();
	}

	private static int FibonacciSeriesByDp(int n, int[] qb) {
		if (n == 0 || n == 1) {
			return n;
		}
		if (qb[n] != 0) {
			return qb[n];
		}

		int fibnm1 = FibonacciSeriesByDp(n - 1, qb);
		int fibnm2 = FibonacciSeriesByDp(n - 2, qb);
		int fibn = fibnm1 + fibnm2;
		qb[n] = fibn;
		return fibn;
	}
}

/*
 * 
 * private static int FibonacciSeriesByDp(int n) { if (n == 0 || n == 1) {
 * return n; } int fibnm1 = FibonacciSeriesByDp(n - 1); int fibnm2 =
 * FibonacciSeriesByDp(n - 2); return (fibnm1 + fibnm2); }
 */