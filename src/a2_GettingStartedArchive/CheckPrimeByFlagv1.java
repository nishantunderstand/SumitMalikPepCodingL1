package a2_GettingStartedArchive;

public class CheckPrimeByFlagv1 {
	public static void main(String[] args) {
		int num = 23;
		int flag = 0;
		int m = num / 2;
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
