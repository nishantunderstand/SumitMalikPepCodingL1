package b1_RecursionSumitMalik;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayPrintByRecursion {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Array Length :");
		int n = sc.nextInt();
		
		System.out.println("Enter Data For Array :");
		int arr[] = new int[n];
		
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		
		System.out.println("Entered Arrays:"+Arrays.toString(arr));
		printArray(arr,0);
		sc.close();
	}

	private static void printArray(int[] arr,int idx) {
		if(idx==arr.length)
		{
			return;
		}
		System.out.print(arr[idx]+"\t");
		printArray(arr,idx+1);
	}

}
