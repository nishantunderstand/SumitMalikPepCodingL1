package c1_DynamicProgramming;

import java.util.Scanner;

public class ArrangeBuildingDp {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Arrange Building Count :");
		int n = sc.nextInt();
		int old_build = 1;
		int old_space = 1;
		for (int i = 2; i <= n; i++) {
			int new_build = old_space;
			int new_space = old_build + old_space;
			old_build = new_build;
			old_space = new_space;
		}
		int arrng = old_build + old_space;
		System.out.println("Possible Arrangment :" + (arrng * arrng));
		sc.close();
	}
}

/*
 * os,ns <-- This Syntax are Better ob,nb
 * 
 * 
 * 
 */