package a3c_NumberPatternQuestion;

public class PraticeNumberPattern {
	public static void main(String[] args) {
		int row = 5;
		// Pattern11(row);
		// Pattern06(row);
		// Pattern15(row);
		Pattern16(4);
	}

	private static void Pattern16(int n) {
		int str = 1;
		int sp = n + 1;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= str; j++) {
				System.out.print("*\t");
			}

			for (int j = 1; j <= sp; j++) {
				System.out.print("\t");
			}

			for (int j = 1; j <= str; j++) {
				System.out.print("*\t");
			}
			str++;
			sp -= 2;
			System.out.println();

		}
	}

	private static void Pattern15(int n) {
		int sp = n / 2;
		int st = 1;
		int ival = 1;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= sp; j++) {
				System.out.print("\t");
			}
			int jval = ival;
			for (int j = 1; j <= st; j++) {
				if (j <= st / 2) {
					System.out.print(jval + "\t");
					jval++;
				} else {
					System.out.print(jval + "\t");
					jval--;
				}

			}
			if (i <= n / 2) {
				sp--;
				st += 2;
				ival++;
			} else {
				sp++;
				st -= 2;
				ival--;
			}
			System.out.println();
		}
	}

	private static void Pattern06(int row) {
		int str = row / 2 + 1;
		int sp = 1;
		for (int i = 1; i <= row; i++) {

			if (i <= row / 2) {
				str--;
				sp += 2;
			}

			else {
				str++;
				sp -= 2;
			}

			for (int j = 1; j < str; j++) {
				System.out.print("*\t");
			}
			for (int j = 1; j < sp; j++) {
				System.out.print("\t");
			}

			for (int j = 1; j < str; j++) {
				System.out.print("*\t");
			}

			System.out.println();

		}
	}

	private static void Pattern12(int row) {

	}

	private static void Pattern11(int row) {
		int val = 1;
		for (int i = 1; i <= row; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(val + "\t");
				val++;
			}
			System.out.println();
		}
	}

}
