package b1_Recursion_ApnaCollege;

public class StringSubSequence {

	public static void SubSequenceString(String str, int idx, String newString) {
		// char currChar = str.charAt(idx); // Program will Generate Error
		if (idx == str.length()) {
			System.out.println("New Sub-String:" + newString);
			return;
		}
		char currChar = str.charAt(idx);
		// Want to come
		SubSequenceString(str, idx + 1, newString + currChar);
		// Don't Want to come
		SubSequenceString(str, idx + 1, newString);
	}

	public static void main(String[] args) {
		String str = "abc";
		System.out.println("Original String :" + str);
		SubSequenceString(str, 0, "");

	}

}
