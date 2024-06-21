package a7a_String_SumeetMalik;

public class StringReverseByCharAt {
	public static void main(String[] args) {
		String string = new String("Hello");
		String reversedString = "";
		int length = string.length();

		for (int i = length - 1; i >= 0; i--) {
			reversedString = reversedString + string.charAt(i);
		}
// Valid Hai
		/*
		 * for (int i = length - 1; i >= 0; i--) { reversedString += string.charAt(i); }
		 */
		System.out.println("Original String: " + string);
		System.out.println("Reversed String: " + reversedString);
	}

}
