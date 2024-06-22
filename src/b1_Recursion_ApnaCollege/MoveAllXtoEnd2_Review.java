package b1_Recursion_ApnaCollege;

public class MoveAllXtoEnd2_Review {
	public static void main(String[] args) {
		String str = "xxxxxxaaxxxx";
		String ans = AppendXtoEnd2(str, 0, "");
		System.out.println("Original Str:"+str);
		System.out.println("Moved all X to End : "+ans);
	}

	private static String AppendXtoEnd2(String str, int i, String newStr) {
		if (i == str.length()) {
			return "";
		}

		if (str.charAt(i) == 'x') {
			String preXString = str.substring(0, i);
			String postXString = str.substring(i);
			AppendXtoEnd2(str, i + 1, postXString + "x" + preXString);
		} else {
			AppendXtoEnd2(str, i + 1, newStr);
		}

		return newStr;
	}
}
