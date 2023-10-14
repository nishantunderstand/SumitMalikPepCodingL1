package b1_RecursionSumitMalik;

public class SubStringDoubt {
	public static void main(String[] args) {
		String str = "abc";
		String newStr = "";
		for (int i = 1; i < str.length(); i++) {
			newStr = str.substring(0, i);
			System.out.println("SubString:" + newStr);
		}

	}

}
