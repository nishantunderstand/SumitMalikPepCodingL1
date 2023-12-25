package b3_RecursionArrayList;

import java.util.ArrayList;

public class SubSequenceGet {
	public static void main(String[] args) {
		String string = "abc";
		ArrayList<String> result = SubSequenceGet(string);
		System.out.println(result);
	}

	private static ArrayList<String> SubSequenceGet(String str) {
		if (str.length() == 0) {
			ArrayList<String> bres = new ArrayList<String>();
			bres.add("");
			return bres;
		}

		String curr = str.substring(0, 1);
		String ros = str.substring(1);
		ArrayList<String> rres = SubSequenceGet(ros);

		ArrayList<String> mres = new ArrayList<>();

		for (String i : rres) {
			mres.add("" + i);

		}
		for (String i : rres) {

			mres.add(curr + i);
		}
		return mres;
	}

}

/*
 * 
 * 
 * // There are 2 way of writting it, When result is presented in [, c, b, bc,
 * a, ac, ab, abc] That's means it is an arraylist
 * 
 * Writting Approach 2 for( String i:rres) { mres.add("" + i); mres.add(curr +
 * i); }* private static ArrayList<String> ArrayListSubSequenceGet(String
 * string) {
 * 
 * if (string.length() == 0) { ArrayList<String> breStrings = new ArrayList<>();
 * breStrings.add(""); return breStrings; }
 * 
 * // abc // a char currChar = string.charAt(0); // bc String remString =
 * string.substring(1); ArrayList<String> subArrayList =
 * ArrayListSubSequenceGet(remString);
 * 
 * ArrayList<String> resultArrayList = new ArrayList<>(); for (String s :
 * subArrayList) { resultArrayList.add("" + remString); }
 * 
 * for (String s : subArrayList) { resultArrayList.add(currChar + remString); }
 * 
 * return resultArrayList;
 * 
 * } // a // char curr = str.charAt(0); // You cannot add Character to String
 * 
 * // bc // bc - wala result // Final Result for (String i : rres) { mres.add(""
 * + rres); //<--- Here mres.add(curr + rres); } return mres;
 * 
 *
 * 
 */
