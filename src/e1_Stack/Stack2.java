package e1_Stack;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class Stack2 {
	public static void main(String[] args) {
		System.out.println("Rename:");
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = scn.nextInt();
		}
		System.out.println("Rename :" + Arrays.toString(arr));
		int[] ans = Rename(arr);
		System.out.println("Rename :" + Arrays.toString(ans));
		scn.close();
	}

	private static int[] Rename(int[] arr) {
		int Rename[] = new int[arr.length];
		Stack<Integer> st = new Stack<>();
		for (int i = 0; i < arr.length; i++) {
			while (true) {

			}
		}
		return Rename;
	}

}
