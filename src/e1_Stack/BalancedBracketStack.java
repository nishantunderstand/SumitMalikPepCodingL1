package e1_Stack;

import java.util.Scanner;
import java.util.Stack;

public class BalancedBracketStack {
	public static void main(String[] args) {
		System.out.println("Stack:");
		Scanner scn = new Scanner(System.in);
		String str = scn.nextLine();
		Stack<Character> st = new Stack<>();
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (ch == '(' || ch == '{' || ch == '[') { // Opening Bracket
				st.push(ch);
			} else if (ch == ')') {

			} else if (ch == '}') {

			} else if (ch == ']') {

			} else {// a,b,+,* //<-- Ignore
			}
		}

		scn.close();
	}

}
