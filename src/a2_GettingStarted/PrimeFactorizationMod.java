package a2_GettingStarted;

public class PrimeFactorizationMod {

	public static void main(String[] args) {
		int n = 46;
		n = 1440;
		// n = 17;
		// n = 1;
		// n = -1500;
		// n = 1;

		if (n < 0) {
			System.out.println("Cannot Find Prime Factor For Negative Number!, Enter Postive Number");
			return;
		}

		if (n == 1) {
			System.out.println("1");
			return;
		}

		// div * div <= n | (int)Math.sqrt(n)
		for (int div = 2; div * div <= n; div++) {
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
