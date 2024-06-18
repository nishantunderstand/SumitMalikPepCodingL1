package a3a_StarPatternQuestion_SummitMalik;
/**
                                *
                        *       *
                *       *       *
        *       *       *       *
*       *       *       *       *

sp Represent space
st Represent star

we need to make them dependent upon i,j,n
So that wit the change of n.
Our code will automatically change.
So no need to work too much.

*/

import java.util.Scanner;

public class Pattern03Original {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number ");
		int n = 5;
		System.out.println("Your Star ");
		int sp = n - 1;
		int st = 1;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= sp; j++) {
				System.out.print(" ");
			}
			for (int k = 1; k <= st; k++) {
				System.out.print("* ");
			}

			sp--;
			st++;
			System.out.println();
		}
		sc.close();
	}

}
