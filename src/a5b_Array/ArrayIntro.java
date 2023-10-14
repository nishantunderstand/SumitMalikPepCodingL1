package a5b_Array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayIntro {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Number :");
		int n = scanner.nextInt();
		int arr[] = new int[n];
		System.out.println(Arrays.toString(arr));
		scanner.close();

	}

}
