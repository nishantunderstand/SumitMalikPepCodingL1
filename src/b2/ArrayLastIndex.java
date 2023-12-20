package b2;

public class ArrayLastIndex {
	public static void main(String[] args) {


		int arr[] = { 2, 2, 2, 2 };
		int data = 2;

		int lastIndex = ArrayLastIndex(arr, 0, data);
		System.out.println("Array Last Index " + data + "=" + lastIndex);



	}

	private static int ArrayLastIndex(int[] arr, int idx, int data) {
		if (idx == arr.length) {
			return -1;
		}
		int lisma = ArrayLastIndex(arr, idx + 1, data);
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
}
