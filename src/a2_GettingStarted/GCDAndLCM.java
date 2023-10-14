package a2_GettingStarted;

public class GCDAndLCM {
	public static void main(String[] args) {
		int n1 = 6;
		int n2 = 14;
		int on1 = n1;
		int on2 = n2;
		while (n1 % n2 != 0) {
			int rem = n1 % n2;
			n1 = n2;
			n2 = rem;
		}
		int gcd = n2;
		int lcm = (on1 * on2) / gcd;
		System.out.println("GCD :" + gcd);
		System.out.println("LCM :" + lcm);

	}
}
