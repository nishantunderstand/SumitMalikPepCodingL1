package f1_HashMap;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;
public class GetCommonElement1ForEach {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int[] arr1 = {5, 5, 9, 8, 5, 5, 8, 0, 3};
		int[] arr2 = {9, 7, 1, 0, 3, 6, 5, 9, 1, 1, 8, 0, 2, 4, 2, 9, 1, 5};
		// Output 9,0,3,5,8
		
		HashMap<Integer, Integer> hm = new HashMap<>();
		// Creating Character Frequency of array1
		for (int i:arr1) {
			if (hm.containsKey(i)) {
				int of = hm.get(i);
				int nf = of + 1;
				hm.put(i++, nf);
			} else {
				hm.put(i++, 1);
			}
		}
		System.out.println("Array 1:"+hm);
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