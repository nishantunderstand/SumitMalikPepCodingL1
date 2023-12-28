package c2_TimeSpaceComplexitysorting;

public class _Sorting {
	public static void main(String[] args) {
		int arr[] = { 5, 9, 8, 2, 1 };
		Bubblesorting(arr);
	}

	public static void Bubblesorting(int[] arr) {
		for (int itr = 0; itr < arr.length; itr++) {

		}


	}


	public static void swap(int[] arr, int i, int j) {
		System.out.println("Swapping " + arr[i] + " and " + arr[j]);
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}


	public static boolean isSmaller(int[] arr, int i, int j) {
		if (arr[i] < arr[j])
			return true;
		else {
			return false;
		}

	}

}
