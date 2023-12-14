package a5b_Array;

public class ArrayMin2 {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, -1, -200 };
		int min = arr[0];
		for (int i : arr) {
			if (i < min) {
				min = i;
			}
		}
		System.out.println("Minimium in an Array " + min);
	}
}