package e1_Stack;

import java.util.Stack;

/**
 * Stack is based on LIFO
 * {@link }
 */
public class StackIntroduction {
	public static void main(String[] args) {
		Stack<Character> st = new Stack<>();
		// st = 'a';
		// How to add to Stack ?
		// st.push("A");
		// To add a character to the stack, use a char literal, not a string
		st.push('A');
		st.push('B');
		st.push('C');
		st.push('D');
		System.out.println(st);
		st.remove(3);
		// You can remove from any place you want
		// 0-Based Indexing
		System.out.println(st);
		st.pop(); // Remove From Top Only
		System.out.println(st);
		st.peek();
		System.out.println(st);
		
	}
}
