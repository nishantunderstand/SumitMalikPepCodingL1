package a3b_StarPatternQuestion_JavaTpoint;

public class Pattern07To10 {
	public static void main(String[] args) {
		int row = 5;
		PrintDiagonalStar(row);
		PrintDiagonalStarReverse(row);
		PrintCross(row);
	}

	private static void PrintCross(int row) {
		System.out.println("PrintCross ");
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < row; j++) {
				if (i == j || i + j == row - 1) {
					System.out.print("*\t");
				} else {
					System.out.print("\t");
				}
			}
			System.out.println();
		}
	}

	private static void PrintDiagonalStarReverse(int row) {
		System.out.println("PrintDiagonalStarReverse");
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < row; j++) {
				if (i + j == row - 1) {
					System.out.print("*\t");
				} else {
					System.out.print("\t");
				}
			}
			System.out.println();
		}
	}

	private static void PrintDiagonalStar(int row) {
		System.out.println("PrintDiagonalStar");
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < row; j++) {
				if (i == j) {
					System.out.print("*\t");
				} else {
					System.out.print("\t");
				}
			}
			System.out.println();
		}
	}

}
