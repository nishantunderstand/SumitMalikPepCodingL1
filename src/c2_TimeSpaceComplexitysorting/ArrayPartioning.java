package c2_TimeSpaceComplexitysorting;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Dutch National Flag 
 * Application 
 * {@link Sort01}
 * {@link Sort012} 
 * {@link Sort012}
 */
public class ArrayPartioning {
	public static void partition(int[] arr, int pivot) {
		// 0 to j-1 -> Element <=pivot
		// j to i-1 -> Element >pivot
		// i to end -> Element UnIdentifed
		int i = 0;
		int j = 0; // <- Tricky Point
		while (i < arr.length) {
			if (arr[i] > pivot) {
				i++;
			} else if(arr[i] <= pivot){
				swap(arr, i, j);
				i++;
				j++;
			}
		}
	}

	public static void swap(int[] arr, int i, int j) {
		System.out.println("Swapping " + arr[i] + " and " + arr[j]);
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

	public static void main(String[] args) {
		System.out.println("Array Partioning:");
		Scanner sc = new Scanner(System.in);
		//int n = sc.nextInt();
		//int arr[] = new int[n];
		
		/*
		 * for (int i = 0; i < arr.length; i++) { arr[i] = sc.nextInt(); }
		 */
		
		//int pivot = sc.nextInt();
		int pivot = 5;
		int arr[] = {7,9,4,8,3,6,2,1};
		partition(arr, pivot);
		System.out.println("Arrays:" + Arrays.toString(arr));

		sc.close();
	}
}
