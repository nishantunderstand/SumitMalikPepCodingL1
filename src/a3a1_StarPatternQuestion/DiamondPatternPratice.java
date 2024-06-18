package a3a1_StarPatternQuestion;


// Renumber the package 📦 and post it 
// There is going to be a lot of Changes 
public class DiamondPatternPratice {
	public static void main(String[] args) {
		int row = 5;
		DiamondPatternv1(row);
	}

	private static void DiamondPatternv1(int row) {
		int sp = row / 2;
		int str = 1;

		for (int i = 1; i <= row; i++) {
			for (int j = 1; j <= sp; j++) {
				System.out.print("\t");
			}
			for (int j = 1; j <= str; j++) {
				System.out.print("*\t");
			}

			if (i <= row / 2) {
				sp--;
				str += 2;
			} else {
				sp++;
				str -= 2;
			}
			System.out.println();
		}
	}
}
