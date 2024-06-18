package b1_Recursion_ApnaCollege;

import java.util.HashSet;

public class StringSubSequenceUnique {

	public static void SubSequenceString(String str, int idx, String newString, HashSet<String> set) {
		if (idx == str.length()) {
			if (set.contains(newString)) {
				return;
			} else {
				System.out.println("Sub-Sequence :" + newString);
				set.add(newString);
				return;
			}
		}

		char currChar = str.charAt(idx);
		// Want to come
		SubSequenceString(str, idx + 1, newString + currChar, set);
		// Don't Want to come
		SubSequenceString(str, idx + 1, newString, set);

	}

	public static void main(String[] args) {
		String str = "aaa";
		System.out.println("Original String :" + str);
		HashSet<String> set = new HashSet<>();
		SubSequenceString(str, 0, "", set);

	}

}
