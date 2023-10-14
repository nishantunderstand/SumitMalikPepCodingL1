package a5a_Functions;

public class Decimal2AnyBase {
	public static void main(String[] args) {
		int num = 63; // Base 10
		int onum = num;
		int b = 8;
		int p = 1;
		int rev = 0;
		while (num > 0) {
			int dig = num % b;
			num = num / b;
			rev += dig * p;
			p = p * 10;
		}
		System.out.println("Number " + onum + " to the Base" + b + " == " + rev);

	}

}
