package b1_RecursionSumitMalik;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayMax {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Array Length :");
		int n = sc.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Your Entered Arrays : " + Arrays.toString(arr));
		int ans = maxOfArray(arr, 0);
		System.out.println("Max in Array :" + ans);
		sc.close();
	}

	private static int maxOfArray(int[] arr, int idx) {
		// Stop the program when it Reach Last Index
		if (idx == arr.length - 1) {
			return arr[idx];
		}
		int maxInArr = maxOfArray(arr, idx + 1);

		if (arr[idx] > maxInArr) {
			return arr[idx];
		} else {
			return maxInArr;
		}
	}

}

// Incorrect Approach
/*
 * 
 * private static void maxOfArray(int[] arr, int idx) {
 * 
 * method stub if(arr[idx]==arr.length) { System.out.println("Max of Array");
 * return; }
 * 
 * if(arr[idx]>max) { max=arr[idx]; }
 * 
 * int max = arr[0]; maxOfArray(arr,idx+1);
 * 
 * }
 * 
 * }
 * 
 */
