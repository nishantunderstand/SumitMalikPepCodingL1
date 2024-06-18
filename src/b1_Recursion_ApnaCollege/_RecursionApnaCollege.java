package b1_Recursion_ApnaCollege;

public class _RecursionApnaCollege {
	public static void main(String[] args) {
		int ans = PrintSum(10);
		System.out.println(ans);
	}

	private static int PrintSum(int n) {
		if (n == 0) {
			return 0;
		}
		return n + PrintSum(n - 1);
	}

}
