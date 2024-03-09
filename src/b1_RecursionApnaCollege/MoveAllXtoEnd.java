package b1_RecursionApnaCollege;
/**
 * aaXXaa
 * aa + XXaa
 * @resume
 */

public class MoveAllXtoEnd {
	public static void main(String[] args) {
		String str = "xxxxxxaa";
		String ans = AppendXtoEnd(str,0);
		System.out.println("Original Str:"+str);
		System.out.println("Moved all X to End : "+ans);
	}

	private static String AppendXtoEnd(String str, int i) {
		if (i==str.length()) {
			return str;
		}
		if(str.charAt(i)== 'x') {
			String xPrefix = str.substring(0,i);
			String xSuffix = str.substring(i);
			String result = xSuffix+xPrefix;
			return AppendXtoEnd(result,i+1);
			
		}
		
		return AppendXtoEnd(str, i+1);
	}
}
