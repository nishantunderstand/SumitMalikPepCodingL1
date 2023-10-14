package a2_GettingStarted;

public class IsPrime_WRONG {

	public static void main(String[] args) {
		int num = 23;
		boolean flag = true;
		for (int div = 2; div * div <= num; div++) {
			if (num % div == 0) {
				System.out.println("Not Prime");
				break;
			}
		}
	}
}

/*
 * 
 * 
 * if (flag) { System.out.println(num + ": Prime Number"); } else {
 * System.out.println(num + ": Not Prime Number"); } flag = false;
 * 
 */