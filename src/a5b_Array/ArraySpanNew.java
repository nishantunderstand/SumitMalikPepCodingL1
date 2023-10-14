package a5b_Array;

import java.util.Arrays;
import java.util.Scanner;

public class ArraySpanNew {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Number of Element to be Inserted");
		int n = scn.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scn.nextInt();
		}
		int max = arr[0];
		int min = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
			if (arr[i] < min) {
				min = arr[i];
			}
		}
		System.out.println("Arrays :" + Arrays.toString(arr));
		int span = max - min;
		System.out.println("Span of an Array : " + span);
		scn.close();
	}

}
