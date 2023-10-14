package a2_GettingStarted;

public class CheckPrimeByClass {
	public static void main(String[] args) {
		int num = 23;
		int flag = 0;
		for (int div = 2; div < num / 2; div++) {
			if (num % div == 0) {
				flag = 1;
				break;
			}
		}
		if (flag == 1) {
			System.out.println(num + " is not Prime");
		} else {
			System.out.println(num + " is Prime");
		}
	}

}
