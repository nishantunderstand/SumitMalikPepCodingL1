package a3a_StarPatternQuestion_SumeetMalik;

public class Pattern10 {
	public static void main(String[] args) {
		int n = 7;
		System.out.println("Your Star ");
		int outsp = n / 2;
		int insp = -1;

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= outsp; j++) {
				System.out.print("\t");
			}
			System.out.print("*\t");

			for (int j = 1; j <= insp; j++) {
				System.out.print("\t");
			}

			// Why we apply constraints on 2nd Star, Look at the Diagram
			if (i > 1 && i < n) {
				System.out.print("*\t");
			}

			if (i <= n / 2) {
				outsp--;
				insp += 2;
			} else {
				outsp++;
				insp -= 2;
			}
			System.out.println();
		}
	}

}
