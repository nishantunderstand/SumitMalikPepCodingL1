package a2_GettingStartedArchive;

public class CheckPrimeByFlagv3 {
	public static void main(String[] args) {
		int num = 5;
		// The literal 21474836479 of type int is out of range
		// How to Solve this One
		boolean flag = true;
		int m = (int) Math.sqrt(num);

		if (num < 0) {
			System.out.println("!!!Enter Positive Number!!!");
			return;
		}
		if (num == 1) {
			System.out.println("1 is prime ");
			return;
		}

		for (int i = 2; i < m; i++) {
			if (num % i == 0) {
				flag = false;
				break;
			}
		}
		if (flag) {
			System.out.println(num + " is prime");
		} else {
			System.out.println(num + " is not prime");
		}
	}

}
