package a2_GettingStarted;

public class BreakForWhile {
	public static void main(String[] args) {
		BreakWhile(5);
		BreakFor(5);
	}

	private static void BreakWhile(int n) {
		int i = 0;
		while (i < n) {
			System.out.println("While" + i);
			if (i == 4) {
				break;
			}
			i++;
		}
	}

	private static void BreakFor(int n1) {
		int i = 0;
		for (; i < n1; i++) {
			System.out.println("For" + i);
			if (i == 2) {
				System.exit(0);
			}
		}

	}
}
