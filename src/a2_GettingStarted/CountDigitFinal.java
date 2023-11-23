package a2_GettingStarted;

public class CountDigitFinal {
	public static void main(String[] args) {
		int num = 3000;
		// num = 0000000;
		// what if num is 000000000 ? Then Count No of Digit
		int count = 0;

		if (num == 0) {
			count = 1;
		}

		while (num > 0) {
			System.out.println(num);
			count++;
			num = num / 10;
			// count++;
			// Both of them produce same Result.
		}
		System.out.println("No of Digit :" + count);
	}
}
