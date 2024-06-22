package b1_Recursion_ApnaCollege;

public class FibonacciSeriesPrint3 {
	public static void main(String[] args) {
		int n = 10;
		printFibonacciByRecursion(1, 1, n);
	}

	public static void printFibonacciByRecursion(int a, int b, int n) {
		if (n == 0) {
			return;
		}
		int c = a + b;
		System.out.print(a + " ");
		printFibonacciByRecursion(b, c, n - 1);
	}
}
