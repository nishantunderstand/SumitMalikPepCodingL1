package a3b_StarPatternQuestion_JavaTpoint;

public class Pyramid {
	public static void main(String[] args) {
		int n = 3;

		int sp = n - 1;
		int st = 1;
		System.out.println("Pryamid:");
		for (int i = 0; i <= n; i++) {
			for (int j = 0; i <= sp; i++) {
				System.out.print("\t");
			}
			for (int k = 0; k < st; k++) {
				System.out.print("*");
			}

			sp = sp - 1;
			st = sp + 2;
			System.out.println();

		}

	}

}
