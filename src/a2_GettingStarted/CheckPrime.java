package a2_GettingStarted;

public class CheckPrime {
	public static void main(String[] args) {
		CheckPrime(5);
	}

	private static void CheckPrime(int i) {
		int n = i;
		boolean flag = true;
		for (int div = 2; div * div <= n; div++) {
			if (n % div == 0) {
				flag = false;
				div++;
				break;
			}
		}
		if (flag) {
			System.out.println("Prime \t" + n);
		} else {
			System.out.println("Not Prime \t" + n);
		}
	}

}
