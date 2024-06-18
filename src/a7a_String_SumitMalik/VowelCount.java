package a7a_String_SumitMalik;

public class VowelCount {
	public static void main(String[] args) {
		String str = "aeio How are you ";
		int count = 0;
		String newStr = str.toLowerCase();
		System.out.println(newStr);
		for (int i = 0; i < newStr.length(); i++) {
			if (newStr.charAt(i) == 'a' || newStr.charAt(i) == 'e' || newStr.charAt(i) == 'i' || newStr.charAt(i) == 'o'
					|| newStr.charAt(i) == 'u') {
				count++;
			}
		}
		System.out.println("Total No of Vowel " + count);
	}


}
