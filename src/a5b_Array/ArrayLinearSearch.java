package a5b_Array;

public class ArrayLinearSearch {
	public static void main(String[] args) {
		int[] arr = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100 };
		int data = 60;
		boolean flag = false;
		for (int i = 0; i < arr.length; i++) {
			if (data == arr[i]) {
				flag = true;
				System.out.println("Element Found at Index " + i);
				break;
			}
		}
		if (!flag) {
			System.out.println("Element Not Found");
		}
	}
}
