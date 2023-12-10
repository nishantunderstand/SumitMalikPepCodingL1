package a2_GettingStarted;

/*
 * Biggest Question : Apply Condition on which one ?
 */
public class DigitNumberModified {
	public static void main(String[] args) {
		int n = 500;
		int temp = n;
		int nod = 0;
		while (temp != 0) {
			nod++;
			temp = temp / 10;
		}
		int div = (int) Math.pow(10, nod - 1);
		while (div != 0) {
			int q = n / div;
			System.out.println(q);
			n = n % div;
			div = div / 10;
		}
	}

}
