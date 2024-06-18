package b1_Recursion_ApnaCollege;

/**
 * Traversing L-R // System.out.println("First Occurence of "+ ch +": is at
 * :"+firstIndex+1); // // Why this is wrong
 * you should Return -1 in case of Not Found
 */

public class StringFirstAndLastOccurence {
	public static void main(String[] args) {
		String str = "aabbddcccdg";
		char ch = 'g';
		int firstIndex = FirstOccurence(str, ch, 0);
		System.out.println("String :" + str);

		if (firstIndex == -1) {
			System.out.println(ch + " : is not Present in the string ");
		} else {
			System.out.println("First Occurence of " + ch + ": is at :" + (firstIndex + 1));
		}
		
		int lastIndex = LastOccurence(str,ch,str.length()-1);
		if(lastIndex==-1) {
			System.out.println(ch + " : is not Present in the string ");
		}else {
			System.out.println("Last Occurence of " + ch + ": is at :" + (lastIndex + 1));
		}
		
		
	}

	private static int LastOccurence(String str, char ch, int i) {
		if(i<0) {
			return -1;
		}
		
		if(ch == str.charAt(i)) {
			return i;
		}
		else {
			return LastOccurence(str, ch, i-1);
		}
	}

	private static int FirstOccurence(String str, char ch, int i) {
		if (i == str.length())
			return -1;

		if (ch == str.charAt(i)) {
			return i;
		} else {
			return FirstOccurence(str, ch, i + 1);
		}
	}

}
