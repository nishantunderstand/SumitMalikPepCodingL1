package a7b_StringBuilder;

public class PrintAllPalindromeSubString {
	public static void main(String[] args) {
		String str = "abccbc";
		for (int i = 0; i < str.length(); i++) {
			for (int j = i + 1; j <= str.length(); j++) {
				String ss = str.substring(i, j);
				if (isPalindrome(ss) == true) {
					System.out.println(ss);
				}
			}
		}

	}

	private static boolean isPalindrome(String ss) {
		int i = 0;
		int j = ss.length() - 1;
		while (i <= j) {
			char ch1 = ss.charAt(i);
			char ch2 = ss.charAt(j);
			if (ch1 != ch2) {
				return false;
			} else {
				i++;
				j--;
			}
		}
		return true;
	}

}
