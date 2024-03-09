package b1_RecursionApnaCollege;
/**
 * Hello
 * olleH
 */

public class PrintReverseString {
	public static void main(String[] args) {
		String str = "Hello";
		PrintReverseString(str,str.length()-1);
		
	}

	private static void PrintReverseString(String str,int i) {
		if(i<0) {
			return;
		}
		System.out.print(str.charAt(i));
		PrintReverseString(str,i-1);
	}

}
