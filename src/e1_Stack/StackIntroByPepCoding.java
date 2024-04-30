package e1_Stack;

import java.util.Stack;

public class StackIntroByPepCoding {
	public static void main(String[] args) {
		Stack<Integer> st = new Stack<>();
		st.push(20);
		st.push(30);
		System.out.println(st + " size of stack: " + st.size() + " Present at top of stack: " + st.peek());
		st.push(30);
		System.out.println(st + " size of stack: " + st.size() + " Present at top of stack: " + st.peek());
		st.pop();
		System.out.println(st + " size of stack: " + st.size() + " Present at top of stack: " + st.peek());
		st.push(30);
		System.out.println(st + " size of stack: " + st.size() + " Present at top of stack: " + st.peek());
		st.pop();
		System.out.println(st + " size of stack: " + st.size() + " Present at top of stack: " + st.peek());
	
	}

}
