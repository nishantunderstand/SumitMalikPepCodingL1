package b1_Recursion_SumeetMalik_General;

public class StringFirstAndLastOccurence {
	public static int first = -1;
	public static int last = -1;

	public static void main(String[] args) {
		String str = "abaaabxxxx";
		System.out.println("Your Entered String :" + str);
		FirstAndLast(str, 0, 'x');
	}

	private static void FirstAndLast(String str, int idx, char element) {
		// public static int first =-1; // WRONG ?? WHy ???
		// public static int last =-1; // Declare Inside Class , containing main method

		if (idx == str.length()) {
			System.out.println("First Occurence of" + element + "=" + first);
			System.out.println("Last Occurence of " + element + "=" + last);
			return;
		}

		// String currentChar = str.charAt(idx); //WRONG ??WHY ??

		char currentChar = str.charAt(idx);
		if (currentChar == element) {
			if (first == -1) {
				first = idx;
			} else {
				last = idx;
			}
		}
		FirstAndLast(str, idx + 1, element);
	}
}
