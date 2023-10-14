package b1_RecursionSumitMalik;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayFirstIndex2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the Array Length :");
		int n = sc.nextInt();
		int arr[] = new int[n];

		System.out.println("Enter the Values for Array :");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}

		System.out.println("Enter the Data to Find Occurence in the Array :");
		int data = sc.nextInt();
		System.out.println("Your Entered Arrays : " + Arrays.toString(arr));
		int i = 0;
		while (i < arr.length) {
			if (arr[i] == data) {
				System.out.println(i);
				break;
			}
			i++;
		}

		sc.close();
	}

}
