package a2_GettingStarted;

public class PrimeFactorization2023 {
	public static void main(String[] args) {
		int num = 46;
		for (int div = 2; div * div <= num; div++) {
			while (num % div == 0) {
				num = num / div;
				System.out.println(div);
			}
		}
		if (num != 1) {
			System.out.println(num);

		}
	}

}
