package e1_Stack;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class NextGreaterElementValue {
	public static void main(String[] args) {
		System.out.println("Next Greater Element in Stack:");
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = scn.nextInt();
		}
		System.out.println("Arrays :" + Arrays.toString(arr));
		int[] nge = NextGreaterElement(arr);
		System.out.println("Next Greater Element :" + Arrays.toString(nge));
		scn.close();
	}

	private static int[] NextGreaterElement(int[] arr) {
		int nge[] = new int[arr.length];
		Stack<Integer> st = new Stack<>();

		st.push(arr[arr.length - 1]);// <- Last Element//<--
		nge[arr.length - 1] = -1;// <- Last Answer

		for (int i = arr.length - 2; i >= 0; i--) {
			// -,a.+
			while (st.size() > 0 && arr[i] >= st.peek()) {
				// Pop All Small Element , Stop on Larger One
				st.pop();
			}

			if (st.size() == 0) {
				nge[i] = -1;

			} else {
				nge[i] = st.peek();
			}

			st.push(arr[i]);
		}
		return nge;
	}

}
