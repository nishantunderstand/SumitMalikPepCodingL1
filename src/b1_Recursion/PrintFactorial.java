package b1_Recursion;

public class PrintFactorial {

	public static void main(String[] args) {

		int n = 5;

		int ans = PrintFactorial(n);
		System.out.println(ans);
	}

	private static int PrintFactorial(int n) {
		if (n == 0 || n == 1) {
			return 1;
		}

		int fact = n * PrintFactorial(n - 1);
		return fact;

	}

}
