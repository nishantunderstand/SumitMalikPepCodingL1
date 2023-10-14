package a5b_Array;

public class FloorAndCeil {
	public static void main(String[] args) {

		int[] arr = { 1, 5, 10, 15, 22, 33, 40, 42, 55, 66 };
		int data = 34;
		int low = 0;
		int high = arr.length - 1;
		int ceil = 0;
		int floor = 0;

		while (low <= high) {
			int mid = (low + high) / 2;
			if (data > arr[mid]) {
				low = mid + 1;
				floor = arr[mid];
			} else if (data < arr[mid]) {
				high = mid - 1;
				ceil = arr[mid];
			} else {
				ceil = arr[mid];
				floor = arr[mid];
				break;
			}
		}
		System.out.println("Ceil :" + ceil);
		System.out.println("floor: " + floor);

	}

}
