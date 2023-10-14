package a5b_Array;

public class Array {

	public static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

	public static void main(String[] args)

	{

		int[] one = new int[5];
		one[0] = 0;
		one[1] = 1;
		one[2] = 2;
		one[3] = 3;
		one[4] = 4;

		System.out.println("Array One Length : " + one.length);

		System.out.println("Array One Before Modification ");
		for (int i = 0; i < one.length; i++) {
			System.out.println("Array item at index:" + i + ":" + one[i]);
		}

		// To access First element or Last element, Will it take same time or different?

		int[] two = one;
		two[3] = 33;

		System.out.println("Array One After Modification");
		for (int i = 0; i < one.length; i++) {
			System.out.println("Array item at index:" + i + ":" + one[i]);
		}

		// Why Array One & Two both showing same result?

		System.out.println("Array Two :");
		for (int i = 0; i < two.length; i++) {
			System.out.println("Array item at index:" + i + ":" + two[i]);
		}

		System.out.println();
		for (int i = 0; i < one.length; i++) {
			System.out.println("Array item at index:" + i + ":" + one[i]);
		}

		swap(one, 0, 3);
		// Why i was getting error, when i was declaring swap method here, Reason Java
		// Doesn't support nested method

		System.out.println();
		for (int i = 0; i < one.length; i++) {
			System.out.println("Array item at index:" + i + ":" + one[i]);
		}

	}

}
