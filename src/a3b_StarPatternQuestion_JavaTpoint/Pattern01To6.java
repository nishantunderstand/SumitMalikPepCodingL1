package a3b_StarPatternQuestion_JavaTpoint;

public class Pattern01To6 {

	private static void rightTriangleStarPatternInverted(int row) {

		for (int i = 0; i < row; i++) {
			for (int j = row - i; j >= 1; j--) {
				System.out.print("*\t");
			}
			System.out.println();
		}
	}

	private static void rightTriangleStarPattern(int row) {
		for (int i = 0; i < row; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("*\t");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		int row = 5;

		rightTriangleStarPattern(row);
		rightTriangleStarPatternInverted(row);
		leftTriangleStarPattern(row);
		leftTriangleStarPatternv2(row);
		leftTriangleStarPatternv3(row);
		leftTriangleStarPatternInverted(row);
		diamondPattern(row);

	}

	private static void diamondPattern(int row) {
		int sp = row / 2;
		int st = 1;
		for (int i = 0; i < sp; i++) {
			for (int j = 0; j < sp; j++) {
				System.out.print("");
			}
			for (int j = 0; j < st; j++) {
				System.out.print("*");
			}
			sp--;
			st += 2;
			System.out.println();
		}
	}

	private static void leftTriangleStarPatternv3(int row) {
		System.out.println("leftTriangleStarPatternv3");
		int sp = row - 1;
		int st = 1;
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < sp; j++) {
				System.out.print(" ");
			}
			for (int k = 0; k < st; k++) {
				System.out.print("*");
			}
			sp--;
			st++;
			System.out.println();

		}
	}

	private static void leftTriangleStarPatternv2(int row) {
		for (int i = 1; i < row; i++) {
			for (int j = 1; j <= row - i; j++) {
				System.out.print(" ");
			}
			for (int k = 1; k <= i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	private static void leftTriangleStarPatternInverted(int row) {
		System.out.println("leftTriangleStarPatternInverted");
		int sp = 0;
		int st = row;
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < sp; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < st; j++) {
				System.out.print("*");
			}
			sp++;
			st--;
			System.out.println();

		}

	}

	private static void leftTriangleStarPattern(int row) {
		for (int i = 0; i < row; i++) {
			for (int j = row - i; j > 0; j--) {
				System.out.print(" ");
			}
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
