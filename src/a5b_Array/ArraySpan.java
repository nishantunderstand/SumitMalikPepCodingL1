package a5b_Array;

import java.util.Scanner;

public class ArraySpan {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		System.out.println("Number of Element to be Inserted");

		int n = scn.nextInt();

		int[] arr = new int[n];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = scn.nextInt();
		}

		for (int i : arr) {
			System.out.println("Element in Array : " + i);
		}

		int max = arr[0];
		int min = arr[0];

		// Can we use Foreach Loop Here?
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}

		}

		for (int i = 1; i < arr.length; i++) {

			if (arr[i] < min) {
				min = arr[i];
			}

		}
		int span = max - min;
		System.out.println("Span of an Array : " + span);

		scn.close();

	}

}
