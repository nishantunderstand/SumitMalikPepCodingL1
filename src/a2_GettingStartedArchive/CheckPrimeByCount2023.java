package a2_GettingStartedArchive;

public class CheckPrimeByCount2023 {
	public static void main(String[] args) {
		int num = 23;
		int count = 0;

		for (int div = 1; div <= num; div++) {
			if (num % div == 0)
				count++;
		}
		if (count == 2) {
			System.out.println(num + " is Prime");
		} else {
			System.out.println(num + " isn't Prime");
		}
	}

}
