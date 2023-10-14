package a5b_Array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayMax {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Number :");
		int n = scanner.nextInt();

		int[] arr = new int[n];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = scanner.nextInt();
		}

		// How to take Input by using for each ??

		System.out.println("Your Entered Arrays:" + Arrays.toString(arr));
		int max = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		System.out.println("Maximium in an Array " + max);

		int min = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] < min) {
				min = arr[i];
			}
		}

		System.out.println("Minimium in an Array " + min);
		int span = max - min;
		System.out.println("Array Span :" + span);

		scanner.close();
	}

}
