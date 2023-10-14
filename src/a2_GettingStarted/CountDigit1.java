package a2_GettingStarted;

public class CountDigit1 {

	// what if num is 000000000 ? Then Count No of Digit
	public static void main(String[] args) {
		int num = 000;
		int count = 0;

		if (num == 0) {
			count = 1;
		}
		while (num > 0) {
			count++;
			num = num / 10;
		}
		System.out.println("No of Digit :" + count);
	}
}
