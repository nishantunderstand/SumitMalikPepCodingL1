package a5b_Array;

import java.util.Scanner;

public class ArraySubArray {

	public static void main(String[] args) {
		Scanner scnScanner = new Scanner(System.in);
		System.out.println("Number of Element to be Inserted");
		
		int n = scnScanner.nextInt();
		
		int[] arr = new int[n];
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("Enter the Value :");
			arr[i]=scnScanner.nextInt();
		}
		
		for(int i:arr)
		{
			System.out.println("Element in Array : "+i);
		}
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i;j<arr.length;j++)
			{
				for(int k=i;k<=j;k++)
				{
					System.out.print(arr[k]+"\t");
				}
				System.out.println();
			}
		}
		scnScanner.close();

	}

}
