package b1_RecursionSumitMalikGeneral;

import java.util.Scanner;

public class FactorialNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Number:");
		int n = sc.nextInt();
		int ans= FactNumber(n);
		System.out.println("Factorial of "+n+" numbers:"+ans);
		sc.close();
	}

	private static int FactNumber(int n) {
		
		if(n==0 || n==1)
		{
			return 1;
		}
		
		int factnm1 = FactNumber(n-1);
		int factn = n*factnm1;
		return factn;
	}

	
}
