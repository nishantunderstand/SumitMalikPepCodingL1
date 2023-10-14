package a2_GettingStarted;

public class PrimeFactorizationMod {

	public static void main(String[] args) {
		int n = 46;
		for (int div = 2; div * div < n; div++) {
			while (n % div == 0) {
				n = n / div;
				System.out.print(div + " ");
			}
		}
		if (n != 1) {
			System.out.print(n);
		}
	}
}
