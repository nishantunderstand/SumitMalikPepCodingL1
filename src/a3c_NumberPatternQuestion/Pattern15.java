package a3c_NumberPatternQuestion;

public class Pattern15 {
	public static void main(String[] args) {
		int n = 5;
		int st = 1;
		int sp = n / 2;
		int icount = 1;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= sp; j++) {
				System.out.print("\t");
			}
			int jcount = icount;
			// You Need to manipulate the Value that is entering the loop.
			// Your Goal is to change that value.
			for (int j = 1; j <= st; j++) {
				System.out.print(jcount + "\t");
				if (j <= st / 2) {
					jcount++;
				} else {
					jcount--;
				}
			}

			if (i <= n / 2) {
				sp--;
				st += 2;
				icount++;

			} else {
				sp++;
				st -= 2;
				icount--;
			}

			System.out.println();
		}

	}

}
