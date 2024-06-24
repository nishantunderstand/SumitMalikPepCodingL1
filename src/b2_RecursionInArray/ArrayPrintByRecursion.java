package b2_RecursionInArray;
/** 
Array Display
*/
public class ArrayPrintByRecursion {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5 };
		System.out.println("Iterative :");
		printArraybyIterative(arr, 0);
		System.out.println("\nRecursive :");
		printArraybyRecurssion(arr, 0);
	}

	private static void printArraybyIterative(int[] arr, int idx) {
		int i=idx;
		while (i < arr.length) {
			System.out.print(arr[i] + "\t");
			i++;
		}

	}

	private static void printArraybyRecurssion(int[] arr, int idx) {
		if(idx==arr.length)
			return;
		System.out.print(arr[idx]+"\t");
		printArraybyRecurssion(arr, idx + 1);
	}

}

/*
 * Scanner sc = new Scanner(System.in);
 * 
 * System.out.println("Enter the Array Length :"); int n = sc.nextInt();
 * 
 * System.out.println("Enter Data For Array :"); int arr[] = new int[n];
 * 
 * for(int i=0;i<arr.length;i++) { arr[i]=sc.nextInt(); }
 * System.out.println("Entered Arrays:"+Arrays.toString(arr)); sc.close();
 * 
 * 
 * 
 */
