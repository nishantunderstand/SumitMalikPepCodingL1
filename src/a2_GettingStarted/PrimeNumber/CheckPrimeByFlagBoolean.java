package a2_GettingStarted.PrimeNumber;

public class CheckPrimeByFlagBoolean {
	public static void main(String[] args) {
		int num = 22;
		boolean flag = true;
		for (int div = 2; div < num; div++) {
			if (num % div == 0) {
				flag = false;
				break;
			}
		}
		if (flag) {
			System.out.println("Prime");
		} else {
			System.out.println("Not Prime");
		}

	}

}
