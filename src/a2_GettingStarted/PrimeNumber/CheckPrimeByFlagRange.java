package a2_GettingStarted.PrimeNumber;

public class CheckPrimeByFlagRange {

	public static void main(String[] args) {
		System.out.println("Prime Number Checking by Range:");
		// boolean flag = true; // <-- Incorrect Position
		for (int num = 1; num < 10; num++) {
			boolean flag = true;
			for (int i = 2; i < num; i++) {
				if (num % i == 0) {
					flag = false;
					break;
				}
			}
			if (flag) {
				System.out.println(num + " is Prime ");
			} else {
				System.out.println(num + " is not Prime ");
			}
		}

	}

}
