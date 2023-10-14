package a2_GettingStarted;

import java.util.Scanner;

public class NumberRotate {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int onum1 = n;
		int nod = 0;
		int k = sc.nextInt();

		int quot = 0;
		int rem = 0;
		int rotnum = 0;
		while (onum1 != 0) {
			onum1 /= 10;
			nod++;
		}

		k = k % nod;
		if (k < 0) {
			k += nod;
		}

		int div = (int) Math.pow(10, k);
		int mul = (int) Math.pow(10, nod - k);

		rem = n % div;
		quot = n / div;
		rotnum = rem * mul + quot;
		System.out.println(rotnum);

	}

}
