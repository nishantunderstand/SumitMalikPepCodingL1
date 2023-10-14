package a2_GettingStarted;

public class DigitNumber {
	public static void main(String[] args) {
		int n = 512;
		n = 500;
		// What If n is 500 then it will generate Error., 0 Would not come in answer
		int temp = n;
		int nod = 0;
		while (temp != 0) {
			nod++;
			temp = temp / 10;
		}

		int div = (int) Math.pow(10, nod - 1); // Transcendental function

		while (n != 0) {
			int q = n / div;
			System.out.println(q);
			n = n % div;
			div = div / 10;

		}

	}

}

// Why Program is failling for 500 