package a5b_Array;

import java.util.Scanner;

public class ArrayDifference {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Arrays:");
		int n1 = sc.nextInt();
		int arr1[] = new int[n1];
		for (int i = 0; i < n1; i++) {
			arr1[i] = sc.nextInt();
		}

		int n2 = sc.nextInt();
		int arr2[] = new int[n2];
		for (int i = 0; i < n2; i++) {
			arr1[i] = sc.nextInt();
		}

		int diff[] = new int[n2];
		int i = arr1.length - 1;
		int j = arr2.length - 1;
		int k = diff.length - 1;
		int c = 0;
		while (k > 0) {

		}
		sc.close();

	}

}
