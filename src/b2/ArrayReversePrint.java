package b2;

public class ArrayReversePrint {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5 };
		ArrayReversePrint(arr, 0);
	}

	private static void ArrayReversePrint(int[] arr, int idx) {
		if (idx == arr.length)
			return;
			ArrayReversePrint(arr, idx + 1);
			System.out.print(arr[idx] + "\t");
	}
}

/*
 * It is same as printing Number Ascending and Descending. I think they are
 * same.
 */
