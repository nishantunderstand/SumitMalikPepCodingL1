package a2_GettingStarted;

public class GCDAndLCMv2_WRONG {
	public static void main(String[] args) {
		int n1 = 6;
		int n2 = 14;
		FindGCDAndLCM(n1, n2);
	}

	private static void FindGCDAndLCM(int n1, int n2) {
		System.out.println(n1);
		System.out.println(n2);
		while (n1 % n2 != 0) {
			int rem = n1 % n2;
			n1 = n2;
			n2 = rem;
		}

		int gcd = n2;
		int lcm = (n1 * n2) / gcd;
		System.out.println("GCD: " + gcd);
		System.out.println("LCM: " + lcm);
	}

}
