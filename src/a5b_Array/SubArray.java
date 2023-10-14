package a5b_Array;

public class SubArray {

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3 };
		for (int i = 0; i < arr.length; i++) {
			for (int j = i; j < arr.length; j++) {
				for (int k = i; k <= j; k++) { // Traverse From i to j
					System.out.print(arr[k] + "\t");
				}
				System.out.println();
			}
		}
	}

}
