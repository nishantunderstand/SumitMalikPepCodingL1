package a2_GettingStarted;

public class MaximumOfThreeNumbers {
	public static void main(String[] args) {
		int a = 5;
		int b = 8;
		int c = 3;

		// Find the maximum of three numbers using the ternary operator
		int max = (a > b) ? ((a > c) ? a : c) : ((b > c) ? b : c);

		// Print the maximum
		System.out.println("The maximum of " + a + ", " + b + ", and " + c + " is: " + max);
		int max2 = a > b ? a : b;
		int max3 = (a > b) ? ((a > c) ? a : c) : ((b > c ? b : c));

		System.out.println("Between a & b " + max3);

	}
}
