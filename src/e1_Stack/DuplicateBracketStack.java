package e1_Stack;

import java.util.Scanner;
import java.util.Stack;

public class DuplicateBracketStack {
	public static void main(String[] args) {
		System.out.println("Duplicate Bracker Stack:");
		Scanner scn = new Scanner(System.in);
		String str = scn.nextLine();
		Stack<Character> st = new Stack<Character>();
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (ch == ')') {
				if (st.peek() == '(') {
					System.out.println("Duplicate Present:" + true);
					return;
				} else {
					while (st.peek() != '(') {
						st.pop();
					}
					st.pop();// <--
				}

			} else {// a,b,c,d,+
				st.push(ch);
			}
		}
		System.out.println("Duplicate Present:" + false);
		scn.close();

	}

}
