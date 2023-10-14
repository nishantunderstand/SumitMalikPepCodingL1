package b1_RecursionApnaCollege;

public class PrintSum_GreaterSum {

	public static void main(String[] args) {
		int idx = 1;
		int n = 10;
		int sum = 0;
		PrintSum(idx, n, sum);
		System.out.print(PrintSum2(n, sum));

	}

	private static int PrintSum2(int n, int sum) {
		while (n != 0) {
			sum = sum + n;
			n--;
		}
		return sum;
	}

	private static void PrintSum(int idx, int n, int sum) {
		if (idx == n) {
			sum += idx;
			System.out.println(sum);
			return;
		}

		sum += idx;
		PrintSum(idx + 1, n, sum);

	}

}
