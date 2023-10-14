package e1_Stack;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class NextSmallerElementModIndex {
	public static void main(String[] args) {
		System.out.println("Next Smaller Element in Stack Sol 2: && Left to Right: ");
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = scn.nextInt();
		}
		System.out.println("Next Smaller Element :" + Arrays.toString(arr));
		int[] ans = NextGreaterElement(arr);
		System.out.println("Next Smaller Element :" + Arrays.toString(ans));
		scn.close();
	}

	private static int[] NextGreaterElement(int[] arr) {
		int nge[] = new int[arr.length];
		Stack<Integer> st = new Stack<>();
		st.push(0); // Element Position
		for (int i = 1; i < arr.length; i++) {
			// -a,+
			while (st.size() > 0 && arr[i] <= arr[st.peek()]) { // <--
				int pos = st.peek();// <--
				nge[pos] = arr[i];
				st.pop();
			}
			st.push(i);
		}
		// Left Item in Stack
		while (st.size() > 0) {
			int pos = st.peek();
			nge[pos] = -1;
			st.pop();
		}

		return nge;
	}

}
