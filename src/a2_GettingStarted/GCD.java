package a2_GettingStarted;

public class GCD {

	public static void main(String[] args) {
		int n1 = 7;
		int n2 = 36;
		while (n1 % n2 != 0) {
			int rem = n1 % n2;
			n1 = n2;
			n2 = rem;
		}
		System.out.println(n2);

	}

}
