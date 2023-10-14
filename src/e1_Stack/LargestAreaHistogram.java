package e1_Stack;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class LargestAreaHistogram {
	public static void main(String[] args) {
		System.out.println("Largest Area Histogram:");
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = scn.nextInt();
		}
		System.out.println("LargestAreaHistogram :" + Arrays.toString(arr));
		LargestAreaHistogram(arr);
		scn.close();
	}

	private static void LargestAreaHistogram(int[] arr) {
		int rb[] = new int[arr.length];
		Stack<Integer> st = new Stack<>();

		st.push(arr.length - 1);// Last Element Index
		rb[arr.length - 1] = arr.length;// Right Boundary

		for (int i = arr.length - 2; i >= 0; i--) {
			while (st.size() > 0 && arr[i] <= arr[st.peek()]) { // Pop All Large Element , Stop on Smaller One
				st.pop();
			}
			if (st.size() == 0) {
				rb[i] = arr.length;
			} else {
				rb[i] = st.peek();
			}
			st.push(i);
		}

		int lb[] = new int[arr.length];
		// Clear Stack & to Reuse Again
		st = new Stack<>();// <- Initialize Again

		st.push(0);// First Element Index
		lb[0] = -1;// Left Boundary

		for (int i = 1; i < arr.length; i++) {
			while (st.size() > 0 && arr[i] <= arr[st.peek()]) {
				st.pop();
			}
			if (st.size() == 0) {
				lb[i] = -1;
			} else {
				lb[i] = st.peek();
			}
			st.push(i);
		}

		int maxArea = 0;
		for (int i = 0; i < arr.length; i++) {
			int width = rb[i] - lb[i] - 1;
			int area = arr[i] * width;
			if (area > maxArea) {
				maxArea = area;
			}

		}
		System.out.println("Max Area :" + maxArea);

	}

}
