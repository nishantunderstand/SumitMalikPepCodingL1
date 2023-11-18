package a5b_Array;

import java.util.Scanner;

public class ArrayDifference {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Larger Array :");
		int n2 = sc.nextInt();
		int arr2[] = new int[n2];
		for (int i = 0; i < n2; i++) {
			arr2[i] = sc.nextInt();
		}

		System.out.println("Smaller Array :");
		int n1 = sc.nextInt();
		int arr1[] = new int[n1];
		for (int i = 0; i < n1; i++) {
			arr1[i] = sc.nextInt();
		}

		int diff[] = new int[arr1.length > arr2.length ? arr1.length : arr2.length];
		int i = arr1.length - 1;
		int j = arr2.length - 1;
		int k = diff.length - 1;
		int c = 0;
		while (k >= 0) {
			int dig = 0;

			if (arr2[j] + c >= arr1[i]) {
				dig = arr2[j] + c - arr1[i];
				c = 0;
			} else {
				dig = arr2[j] + c + 10 - arr1[i];
				c = -1;
			}
			diff[k] = dig;
			i--;
			j--;
			k--;
		}
		System.out.println("Resultant Array:");
		for (int i1 : diff) {
			System.out.println(i1);
		}

		sc.close();
	}

}
