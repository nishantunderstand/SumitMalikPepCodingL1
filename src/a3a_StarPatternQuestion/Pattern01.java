package a3a_StarPatternQuestion;

/**

Where there is an problem,There is an opportunity.
```md
![Pattern1](https://i.imgur.com/EpGDS2F.png)
```
*/

/**
```markdowm
![Pattern1](https://i.imgur.com/EpGDS2F.png)
```
*
**
***
****
*****

June 18, 3.01 PM
you can update it like this
so that you can move forward 😉 
This is really important.
*/


import java.util.Scanner;

public class Pattern01 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number ");
		int n = sc.nextInt();
		System.out.println("Your Star ");
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		sc.close();
	}

}
