package e1_Stack;

import java.util.Scanner;
import java.util.Stack;

// redundant Code : Code that is unecessary is called.


public class BalancedBracketStack {
	public static void main(String[] args) {
		String str = "(){}}{";
		
		/** 
		 * "())";
		"(]"; // False is Excepted
		[(a + b) + {(c + d) * (e / f)}] -> true
		[(a + b) + {(c + d) * (e / f)]} -> false
		[(a + b) + {(c + d) * (e / f)} -> false
		([(a + b) + {(c + d) * (e / f)}] -> false
		*/

		Stack<Character> st = new Stack<>();
		boolean isBalanced = true; // Flag to indicate balance
		
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (ch == '(' || ch == '{' || ch == '[') { // Opening Bracket
				st.push(ch);
			} else if (ch == ')') {
				if(!handleclosing(st,'(')){
					isBalanced=false;
					break;
				}				
			} else if (ch == '}') {
				if(!handleclosing(st,'{')){
					isBalanced=false;
					break;
				}
			} else if (ch == ']') {
				if(!handleclosing(st,'[')){
					isBalanced=false;
					break;
				}
			} else { // a,b,+,* //<-- Ignore
				continue;
			}
		}
		if(isBalanced && st.size()==0){
			System.out.println(true);
		}else{
			System.out.println(false);
		}	
	}

	private static boolean handleclosing(Stack<Character> st, char corresch) {
		// 4.15 PM why are we checking Size here, I am already checking size in the end. Is this duplicate code ? 
		// 4.32 PM - It is required. // Underflow & Overflow
		if(st.size()==0) 
		{ 
			return false;		
		}		
		else if(st.peek()!=corresch){
			return false;			
		}else{
			st.pop();
			return true;
		}		
	}
}
