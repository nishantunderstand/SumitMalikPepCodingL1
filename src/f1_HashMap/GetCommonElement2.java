package f1_HashMap;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class GetCommonElement2 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int arr1[] = { 1,2,2,1 };
		int arr2[] = { 2,2};
		HashMap<Integer, Integer> fmap = new HashMap<>();
		for (int val : arr1) {
			// int val = arr1[i]; // when you use foreach , No need to again Ask For Value
			if (fmap.containsKey(val)) {
				int of = fmap.get(val);
				int nf = of + 1;
				fmap.put(val, nf);
			} else {
				fmap.put(val, 1);
			}
		}
		System.out.println(fmap);

		for (int val : arr2) {
			if (fmap.containsKey(val) && fmap.get(val) > 0) {
				System.out.print(val + ",");
				int of = fmap.get(val);
				int nf = of - 1;
				fmap.put(val, nf);
			}
		}
		scn.close();
	}
}
