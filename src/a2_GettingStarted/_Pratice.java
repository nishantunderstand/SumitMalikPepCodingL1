package a2_GettingStarted;

public class _Pratice {
	public static void main(String[] args) {
		primeFactor(100);
	}

	private static void primeFactor(int n1) {
		int n = n1;

		// Program Failing Condition
		if (n <= 0) {
			System.out.println("Try Positive Number ");
			return; // Exit the method if the condition is not met
		}

		if (n == 1) {
			System.out.println("Try Number Greater than 1");
			return; // Exit the method if the condition is not met
		}

		// Program Passing Condition
		for (int div = 2; div <= n; div++) {
			while (n % div == 0) {
				n = n / div;
				System.out.println(div + " ");
			}
		}
	}
}
