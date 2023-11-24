package a2_GettingStarted.archive;

public class CheckPrimeByFlagv0 {
	public static void main(String[] args) {
		int num = 3;
		int flag = 0;
		int m = num;
		if (num < 0) {
			System.out.println("!!!Enter Positive Number!!!");
			return;
		}
		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				flag = 1;
				break;
			}
		}
		if (flag == 0) {
			System.out.println(num + " is prime");
		} else {
			System.out.println(num + " is not prime");
		}
	}

}
