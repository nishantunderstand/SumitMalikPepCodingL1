package b1_RecursionApnaCollege;

import java.util.Scanner;

public class NumberAsecPrint_LowValuesSend {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Number:");
		int n = sc.nextInt();
		PrintAsec(n);
		sc.close();
	}

	private static void PrintAsec(int n) {

		if (n == 0) {
			return;
		}
		PrintAsec(n - 1);
		System.out.println(n);
	}

}

//Here i am sending 10, then  Values are printed