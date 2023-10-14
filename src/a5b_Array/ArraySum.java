package a5b_Array;

import java.util.Arrays;
import java.util.Scanner;

public class ArraySum {

	public static void main(String[] args) {
		Scanner scnScanner = new Scanner(System.in);

		int[] one = { 9, 9, 9 };

		int[] two = { 1 };

		int[] sum = new int[one.length > two.length ? one.length : two.length];
		int c = 0;
		int i = one.length - 1;
		int j = two.length - 1;
		int k = sum.length - 1;
		System.out.println(Arrays.toString(one));
		System.out.println(Arrays.toString(two));
		while (k > 0) {
			int dig = c;
			if (i > 0) {
				dig += one[i];
			}
			if (j > 0) {
				dig += two[j];
			}
			// Why = Should be considered ??
			c = dig / 10;
			dig = dig % 10;
			sum[k] = dig;
			i--;
			j--;
			k--;
		}
		if (c != 0) {
			System.out.print(c);
		}
		for (int val : sum) {
			System.out.print(val);
		}
		scnScanner.close();
	}

}
