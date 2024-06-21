package a3a_StarPatternQuestion_SumeetMalik;

import java.util.Scanner;

public class Pattern03_ByMathWrong {
	public static void main(String[] args) {

		System.out.println("Enter the Number ");
		int n = 5;
		System.out.println("Your Star ");
		for(int i=1;i<=n;i++){
			for(int sp=n-i,st=i;st<n;sp--,st++){
				System.out.print(" ");
				System.out.print("*");
			}
			System.out.println();
		}		
	}
}
