package b1_RecursionApnaCollege;

public class PrintSum {

	public static void main(String[] args) {
		int idx = 1;
		int n = 10;
		int sum = 0;
		PrintSum(idx, n, sum);
		PrintSum2(n, sum);
	}

	private static void PrintSum2(int n, int sum) {
		if (n < 0) {
			System.out.println(sum);
			return;
		}
		sum = sum + n;
		PrintSum2(n - 1, sum);
	}
	// Here You need to send idx & n , which is extra
	private static void PrintSum(int idx, int n, int sum) {
		if (idx > n) {
			System.out.println(sum);
			return;
		}

		sum += idx;
		PrintSum(idx + 1, n, sum);

	}

}
