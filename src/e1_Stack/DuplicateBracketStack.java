package e1_Stack;

import java.util.Scanner;
import java.util.Stack;

/**
 * Here Duplicate Means Unnecessary Bracket, Bracket which is not required.
 */
public class DuplicateBracketStack {
	public static void main(String[] args) {
		//System.out.println("Duplicate Bracket Stack:");
		Scanner scn = new Scanner(System.in);
		// String str = scn.nextLine();
		String str = "(a+b)+((a))";
		String str2 = "(a+b)+(a+b)";
		System.out.println(str);
		Stack<Character> st = new Stack<>();
		
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			
			if (ch == ')') {
				if (st.peek() == '(') {
					System.out.println("Duplicate Present:" + true);
					return;
				} else {
					while (st.peek() != '(') { // Condition 
						st.pop();
					}
					st.pop();// <-- Additional Pop is acting as a Condition to remove it. 
				}

			} else {// a,b,c,d,+
				st.push(ch);
			}
		}
		System.out.println("Duplicate Present:" + false);
		scn.close();

	}

}
