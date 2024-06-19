package b1_Recursion_ApnaCollege;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayPrint2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[] = {1,2,3,4,5};
		displayArr(arr,arr.length-1);
		sc.close();
	}

	private static void displayArr(int[] arr, int idx) {
		if(idx<0)
		{
			return;
		}		
		displayArr(arr,idx-1);
		System.out.println(arr[idx]);
		
		
	}


}
