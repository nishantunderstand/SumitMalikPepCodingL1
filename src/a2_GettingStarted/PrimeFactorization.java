package a2_GettingStarted;

public class PrimeFactorization {

	public static void main(String[] args) {
		int n = 46;
		n = 100;
		n = 17;
		n = 24;
		n = 1440;
		// n = 1;
		for (int div = 2; div <= n; div++) {
			while (n % div == 0) {
				n = n / div;
				System.out.print(div + " ");
			}
		}
	}
}

/*
 * Failing For 1, Negative Values
 */