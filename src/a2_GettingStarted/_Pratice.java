package a2_GettingStarted;

public class _Pratice {
	public static void main(String[] args) {
		primeFactor(11);
	}

	private static void primeFactor(int n1) {
		int n = n1;
		// Program Failing Condition
		if (n <= 0 || n == 1) {
			System.out.println("Try Postive Number and Number Greater than 1");
		}
		// Program Passing Condition
		for (int div = 2; div < n; div++) {
			if (n % div == 0) {
				System.out.println(div);
			}
		}
	}
}
