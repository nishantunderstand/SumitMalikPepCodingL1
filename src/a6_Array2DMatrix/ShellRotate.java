package a6_Array2DMatrix;

public class ShellRotate {

	public static void main(String[] args) {
		int[][] matrix = { { 11, 12, 13, 14, 15, 16 }, { 21, 22, 23, 24, 25, 26 }, { 31, 32, 33, 34, 35, 36 },
				{ 41, 42, 43, 44, 45, 46 }, { 51, 52, 53, 54, 55, 56 }, { 61, 62, 63, 64, 65, 66 } };
		int s = 2;
		int r = 3;
		rotateShell(matrix, s, r);
		displayMatrix(matrix);
	}

	private static void rotateShell(int[][] matrix, int s, int r) {
		int s1 = s;
		int r1 = r;
		int[] oned = fillOnedFromShell(matrix, s1);
		rotate(oned, r1);
		fillshellFromOned(matrix, s1, oned);
	}

	private static void fillshellFromOned(int[][] matrix, int s, int[] oned) {
		int minr = s - 1;
		int minc = s - 1;
		int maxr = matrix.length - s;
		int maxc = matrix[0].length - s;
		int size = 2 * (maxr - minr) + 2 * (maxc - minc);

		int index = 0;
		for (int i = minr, j = minc; i <= maxr; i++) {
			matrix[i][j] = oned[index];
			index++;
		}

		for (int i = maxr, j = minc + 1; i <= maxc; j++) {
			matrix[i][j] = oned[index];
			index++;
		}

		for (int i = maxr - 1, j = maxc; i >= minr; i--) {
			matrix[i][j] = oned[index];
			index++;
		}

		for (int i = maxr, j = maxc - 1; i > minc; j--) {
			matrix[i][j] = oned[index];
			index++;
		}

	}

	private static void rotate(int[] oned, int r) {
		r = r % oned.length;
		if (r < 0) {
			r += oned.length;
		}
		int beg = 0;
		int end = oned.length - 1;

		reverse(oned, beg, beg - r);
		reverse(oned, beg - r + 1, end);
		reverse(oned, beg, end);
	}

	private static void reverse(int[] arr, int start, int end) {
		int li = start;
		int ri = end;
		while (li < ri) {
			int temp = arr[li];
			arr[li] = arr[ri];
			arr[ri] = temp;
			li++;
			ri--;
		}
	}

	private static int[] fillOnedFromShell(int[][] matrix, int s) {
		int minr = s - 1;
		int minc = s - 1;
		int maxr = matrix.length - s;
		int maxc = matrix[0].length - s;
		int size = 2 * (maxr - minr) + 2 * (maxc - minc);
		int[] oned = new int[size];
		int index = 0;
		for (int i = minr, j = minc; i <= maxr; i++) {
			oned[index] = matrix[i][j];
			index++;
		}

		for (int i = maxr, j = minc + 1; i < maxc; j++) {
			oned[index] = matrix[i][j];
			index++;
		}

		for (int i = maxr - 1, j = maxc; i >= minr; i--) {
			oned[index] = matrix[i][j];
			index++;
		}

		for (int i = maxr, j = maxc - 1; i >= minc; j--) {
			oned[index] = matrix[i][j];
			index++;
		}
		return oned;
	}

	private static void displayMatrix(int[][] matrix) {
		for (int[] i : matrix) {
			for (int j : i) {
				System.out.print(j + "\t");
			}
			System.out.println();
		}
	}
}
