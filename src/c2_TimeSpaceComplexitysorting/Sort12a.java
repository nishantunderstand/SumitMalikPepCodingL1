package c2_TimeSpaceComplexitysorting;

import java.util.Arrays;
import java.util.Scanner;

public class Sort12a {
	public static void swap(int[] arr, int i, int j) {
		System.out.println("Swapping index " + i + " and index " + j);
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

	public static void main(String[] args) {
		System.out.println("Sorting 0-1-2:");
		Scanner sc = new Scanner(System.in);
		int[] arr = new int []{1,1,2,2,0,0,1,2,0,2,1};
		System.out.println("Arrays:" + Arrays.toString(arr));
		Sort012a(arr);
		System.out.println("Arrays:" + Arrays.toString(arr));

		sc.close();
	}

	private static void Sort012a(int[] arr) {
		int i = 0;
		int j = 0;
		int k = arr.length - 1;
		while (i <= k) {
			 if (arr[i] == 0) {
				swap(arr, i, j);
				i++;
				j++;
			} 
			else if (arr[i] == 1) {
				i++;
			}
			else if (arr[i]==2){
				swap(arr, i, k);
				k--;
			}
		}

	}

}