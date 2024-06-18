package b1_Recursion_ApnaCollege;

import java.util.Arrays;

public class StringDuplicateRemove {
	
	public static boolean[] map = new boolean[26];
	

	public static void RemoveDuplicateString(String str,int idx,String newString) {
		if(idx==str.length())
		{
			System.out.println("Removed Duplicated String:"+newString);
			return;
		}
		
		char currChar = str.charAt(idx);
		if(map[currChar-'a']==true) {
			RemoveDuplicateString(str,idx+1,newString);
		}
		else {
			newString +=currChar;
			map[currChar-'a']=true;
			RemoveDuplicateString(str,idx+1,newString);
		}
		
	}
	
	public static void main(String[] args) {
		String str = "abbccda";
		System.out.println("Original String:"+str);
		System.out.println("Print Boolean Map: "+Arrays.toString(map));
		RemoveDuplicateString(str,0,"");
	
	}

}
