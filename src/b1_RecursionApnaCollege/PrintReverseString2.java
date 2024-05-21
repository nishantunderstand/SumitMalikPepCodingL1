package b1_RecursionApnaCollege;
/**
 * Hello
 * olleH
 * 
 */

public class PrintReverseString2 {
	public static void main(String[] args) {
		String str = "Hello";
		PrintReverseString(str);
		
	}

	private static void PrintReverseString(String str) {
		if(str.length()<0) {
			return;
		}
		System.out.print(str.length());
	}

}
