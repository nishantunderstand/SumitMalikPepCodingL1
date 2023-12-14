package a5b_Array;

public class ArrayLinearSearch {
	public static void main(String[] args) {
		// ArrayLinearSearchOriginal();
		// ArrayLinearSearchExperiment();
		int res = ArrayLinearSearchExperimentv2();
		System.out.println(res);

	}

	private static int ArrayLinearSearchExperimentv2() {
		int[] arr = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100 };
		int data = 69;
		for (int i : arr) {
			if (i == data) {
				return i;
			}
		}

		return -1;
	}

	private static void ArrayLinearSearchExperiment() {
		int[] arr = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100 };
		int data = 60;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == data) {
				System.out.println("Element Found at Index " + i);
				System.exit(0);
			}
		}
	}

	private static void ArrayLinearSearchOriginal() {
		int[] arr = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100 };
		int data = 60;
		boolean flag = false;
		for (int i = 0; i < arr.length; i++) {
			// if (arr[i] == data)
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

/*
A couple of points to consider:

Using System.exit(0): While using System.exit(0) is valid, it's worth noting that it forcefully terminates the entire Java Virtual Machine (JVM). In most scenarios, it's preferable to structure your program in a way that allows it to exit naturally, without the need for System.exit(0). In more complex applications, abruptly terminating the JVM might cause unexpected issues.

Returning the Index: Instead of using System.exit(0), you might consider modifying the method to return the index where the element is found. This allows for more flexibility, and the calling code can decide what to do with the result.

Here's an alternative version returning the index:

java
Copy code
private static int findElementIndex(int[] arr, int data) {
    for (int i = 0; i < arr.length; i++) {
        if (arr[i] == data) {
            return i; // Return the index if element is found
        }
    }
    return -1; // Return -1 if element is not found
}
In this version, the method returns the index (or -1 if not found), and the calling code can decide how to handle the result.  
 
 
  
 */

