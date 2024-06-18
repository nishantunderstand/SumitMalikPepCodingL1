package a3a_StarPatternQuestion_SummitMalik;
/**
*	*	*	*	*	
*	*	*	*	
*	*	*	
*	*	
*
This one is  better.

*/
import java.util.Scanner;

public class Pattern02SummitMalik {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number ");
		int n = 5;
		System.out.println("Your Star ");
		for (int i = n; i >= 1; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*" + " ");
			}
			System.out.println();
		}
		sc.close();
	}

}
