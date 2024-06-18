package a7a_String_SumitMalik;

public class SubStringPrintAll {
	public static void main(String[] args) {
		String string = new String("abcd");

		for (int i = 0; i < string.length(); i++) {
			for (int j = i + 1; j <= string.length(); j++) {
				System.out.println(string.substring(i, j));
			}
		}

	}

}
