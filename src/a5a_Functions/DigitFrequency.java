package a5a_Functions;

public class DigitFrequency {

	public static void main(String[] args) {
		int num = 500000;
		int occ = 0;
		System.out.println("Occurence of " + occ + " in Number " + num);

		int count = 0;
		while (num > 0) {
			int occ_n = num % 10;
			if (occ_n == occ) {
				count++;
			}
			num = num / 10;

		}
		System.out.println("Count of " + occ + " is :" + count);

	}

}
