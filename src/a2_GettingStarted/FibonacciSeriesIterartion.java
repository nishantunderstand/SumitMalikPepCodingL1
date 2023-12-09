package a2_GettingStarted;

public class FibonacciSeriesIterartion {
	public static void main(String[] args) {
		int n1 = 0;
		int n2 = 1;
		for (int i = 0; i < 10; i++) {
			System.out.print(n1 + " "); // Here we are printing 1st Number
			int n3 = n1 + n2;
			n1 = n2;
			n2 = n3;
		}
	}
}
