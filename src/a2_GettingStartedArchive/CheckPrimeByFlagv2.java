package a2_GettingStartedArchive;

public class CheckPrimeByFlagv2 {
	public static void main(String[] args) {
		int num = 23;
		int flag = 0;
		int m = (int) Math.sqrt(num);

		if (num < 0) {
			System.out.println("!!!Enter Positive Number!!!");
			return;
		}
		for (int i = 2; i < m; i++) {
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
