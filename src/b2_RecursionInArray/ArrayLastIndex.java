package b2_RecursionInArray;

public class ArrayLastIndex {
	public static void main(String[] args) {
		int arr[] = { 2, 2, 2, 2 };
		int data = 3;

		//int lastIndex1 = ArrayLastIndexv1(arr, 0, data);
		//System.out.println("Array Last Index of " + data + " = " + (lastIndex1 + 1));

		int lastIndex2 = ArrayLastIndexv1(arr, 0, data);
		System.out.println("Array Last Index of " + data + " = " + (lastIndex2 + 1));
	}

	private static int ArrayLastIndexv1(int[] arr, int idx, int data) {
		if (idx == arr.length) {
			return -1;
		}
		int lisma = ArrayLastIndexv1(arr, idx + 1, data);
		if (lisma == -1) {
			if (arr[idx] == data) {
				return idx;
			} else {
				return -1;
			}
		} else {
			return lisma;
		}
	}

	// What is wrong in this code ?
	private static int ArrayLastIndexv2(int[] arr, int idx, int data) {
		if (idx == arr.length) {
			return -1;
		}
		int lisma = ArrayLastIndexv2(arr, idx + 1, data);
		if (arr[idx] == data) {
			return idx;
		} else {
			return lisma;
		}
	}

}
