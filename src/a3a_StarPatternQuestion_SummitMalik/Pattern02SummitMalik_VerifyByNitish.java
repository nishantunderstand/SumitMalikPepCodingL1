package a3a_StarPatternQuestion_SummitMalik;

import java.util.Scanner;

/** 
I really need to verify this code by Nitish.
Whether i can use this concept or not.
Mathematical equation are the best way to solve a problem.
*/

public class Pattern02SummitMalik_VerifyByNitish {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number ");
		int n = 5;
		System.out.println("Your Star ");
		for(int i=1;i<=n;i++){
			for(int j=n+1-i;j>=1;j--){
				System.out.print("*"+" ");		
			}
			System.out.println();
		}		
		sc.close();
	}

}
