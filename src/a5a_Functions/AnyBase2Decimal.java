package a5a_Functions;

public class AnyBase2Decimal {
	public static void main(String[] args) {
		int n = 1172;
		int b = 8;
		int rev = 0;
		int p = 1;
		while (n > 0) {
			int dig = n % 10;
			n = n / 10;
			rev += dig * p;
			p = p * b;
		}
		System.out.println(rev);

	}

}
