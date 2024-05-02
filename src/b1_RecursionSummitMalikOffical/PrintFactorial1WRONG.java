package b1_RecursionSummitMalikOffical;

public class PrintFactorial1WRONG {

	/**
	 * 
	 * I am unable to get it right by ChatGPT
	 * Maybe in Future, I will be able to do it.
	 */
	public static void main(String[] args) {
		int idx = 1;
		int n = 5;

		int ans = PrintFactorial(idx, n);
		System.out.println(ans);
	}

	// Sending 2 Variable is Wrong, You should send Only 1 Variable
	// I want to correct this program,
	private static int PrintFactorial(int idx, int n) {
		if (idx == 0 || idx == 1) {
			return 1;
		}

		int fact = n * PrintFactorial(idx - 1, n);
		return fact;

	}

}
