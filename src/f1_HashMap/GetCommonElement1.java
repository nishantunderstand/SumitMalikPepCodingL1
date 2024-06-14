package f1_HashMap;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;
public class GetCommonElement1 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int arr1[] = {1,2,2,1 };
		int arr2[] = { 2,2 };
		HashMap<Integer, Integer> hm = new HashMap<>();
		/**
		System.out.println("Array 1 : " + Arrays.toString(arr1));
		System.out.println("Array 2 : " + Arrays.toString(arr2));
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		System.out.println("Array 1 : " + Arrays.toString(arr1));
		System.out.println("Array 2 : " + Arrays.toString(arr2));
		*/
		for (int i = 0; i < arr1.length; i++) {
			int arrelem = arr1[i];
			if (hm.containsKey(arrelem)) {
				int of = hm.get(arrelem);
				int nf = of + 1;
				hm.put(arrelem, nf);
			} else {
				hm.put(arrelem, 1);
			}
		}
		//System.out.println(hm);
		for (int i = 0; i < arr2.length; i++) {
			int val = arr2[i];
			if (hm.containsKey(val)) {
				System.out.print(val + ",");
				hm.remove(val);
			}
		}
		System.out.println("---------------------------");
		System.out.println("HashMap:"+hm);
		scn.close();
	}
}