package a2_GettingStarted;

public class NumberReverse {

	public static void main(String[] args) {
		int num = 5432;
		System.out.println("Number: " + num);
		int dig;
		// while (num != 0)
		while (num > 0) {
			// int dig = num % 10;
			dig = num % 10;
			num = num / 10;
			System.out.print(dig);
		}

	}

}
