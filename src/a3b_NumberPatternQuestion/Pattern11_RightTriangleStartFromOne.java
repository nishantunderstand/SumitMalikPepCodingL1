package a3b_NumberPatternQuestion;

public class Pattern11_RightTriangleStartFromOne {

	public static void main(String[] args) {
		int n = 5;
		for (int i = 1; i <= n; i++) {
			int count = 1; // int val
			for (int j = 1; j <= i; j++) {
				System.out.print(count + "\t");
				count++;
			}
			System.out.println();
		}

	}

}
