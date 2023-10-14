package c2_TimeSpaceComplexitysorting;

import java.util.Arrays;
import java.util.Scanner;

public class TargetSumPair {
	public static void main(String[] args) {
		System.out.println("Sorting:");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		int target = sc.nextInt();
		System.out.println("Arrays:" + Arrays.toString(arr));

		TargetSumPair(arr, target);
		sc.close();
	}

	private static void TargetSumPair(int[] arr, int target) {
		Arrays.sort(arr);
		int li = 0;
		int ri = arr.length - 1;
		while (li < ri) {
			if (arr[li] + arr[ri] < target) {
				li++;

			} else if (arr[li] + arr[ri] > target) {
				ri--;

			} else {
				System.out.println(arr[li] + ", " + arr[ri]);
				li++;
				ri--;
			}
		}

	}

}
