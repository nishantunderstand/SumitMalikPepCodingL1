package a2_GettingStarted;

public class CountDigit {

	public static void main(String[] args) {
		int num = 3000;
		System.out.println("Number: " + num);
		int count = 0;
		while (num != 0) {
			count++;
			num = num / 10;
			// count++;
			// Both of them produce same Result.
		}
		System.out.println("Total No of Digit:" + count);

	}

}
