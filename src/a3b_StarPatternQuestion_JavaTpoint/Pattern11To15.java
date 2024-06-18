package a3b_StarPatternQuestion_JavaTpoint;

public class Pattern11To15 {
	public static void main(String[] args) {
		int row = 5;
		Patten11(row);
		DisplayTableOf2();
	}

	private static void DisplayTableOf2() {
		for (int i = 1; i <= 10; i++) {
			System.out.println("2" + "*" + i + "=" + 2 * i);
		}
	}

	private static void Patten11(int row) {
		int val = 1;
		for (int i = 0; i < row; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print(val + "\t");
				val++;
			}
			System.out.println();
		}
	}
}
