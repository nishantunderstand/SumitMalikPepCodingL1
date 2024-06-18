package b1_Recursion_SumitMalik_General;

import java.util.ArrayList;
import java.util.Scanner;

/*
 * I  created this for Sample
 */
public class StairPathFinalSample {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// System.out.println("Enter the number :");
		// int n = scanner.nextInt();
		int n = 5;

		ArrayList<String> paths = GetStairPath(n);
		System.out.println("Stair Paths:");
		System.out.println(paths);

		System.out.println("Path From " + n + " are:");
		StairPathPrint(n, "");

		System.out.println("Dynamic Programming :-");
		int cp = StairClimbDp(n);
		System.out.println("Stair Path Combination :" + cp);
		
		int cpmemo = StairClimbDpMemo(n, new int[n + 1]);
		System.out.println("Stair Path Combination :" + cpmemo);

		int cpTab = StairClimbDpTab(n);
		System.out.println("Stair Path Combination :" + cpTab);

		scanner.close();
	}



	private static void StairPathPrint(int n, String path) {
		if (n < 0) {
			return;
		}
		if (n == 0) {
			System.out.println(path);
			return;
		}

		StairPathPrint(n - 1, path + "1");
		StairPathPrint(n - 2, path + "2");
		StairPathPrint(n - 3, path + "3");

	}



/*
 * if (n < 0) { return; }
 * 
 * You need to handle Negative Cases as well, Otherwise Problem will get error
 * or incorrect Output
 * 
 */

private static ArrayList<String> GetStairPath(int n) {
	if (n == 0) {
		ArrayList<String> bres = new ArrayList<>();
		bres.add("");
		return bres;
	} else if (n < 0) {
		ArrayList<String> bres = new ArrayList<>();
		return bres;
	}

	ArrayList<String> path1 = GetStairPath(n - 1);
	ArrayList<String> path2 = GetStairPath(n - 2);
	ArrayList<String> path3 = GetStairPath(n - 3);
	ArrayList<String> paths = new ArrayList<>();

	for (String i : path1) {
		paths.add(1 + i);
	}
	for (String i : path2) {
		paths.add(2 + i);
	}
	for (String i : path3) {
		paths.add(3 + i);
	}
	return paths;
}



/*
 * if (n == 0) { ArrayList<String> bres = new ArrayList<>(); bres.add("");
 * return bres; } else (n < 0) { ArrayList<String> bres = new ArrayList<>();
 * return bres; }
 * 
 * ArrayList<String> path1 = GetStairPath(n - 1); //<-- Error State
 * ArrayList<String> path2 = GetStairPath(n - 2); ArrayList<String> path3 =
 * GetStairPath(n - 3);
 * 
 * 
 */

private static int StairClimbDp(int n) {
	if (n == 0) {
		return 1;
	} else if (n < 0) {
		return 0;
	}
	System.out.println("Hello :" + n);
	int nm1 = StairClimbDp(n - 1);
	int nm2 = StairClimbDp(n - 2);
	int nm3 = StairClimbDp(n - 3);
	int nm = nm1 + nm2 + nm3;
	return nm;
}



/*
 * if (n == 0) { return 1; } else { <-- Wrong code return 0; }
 * 
 * 
 */

private static int StairClimbDpMemo(int n, int[] qb) {
	if (n == 0) {
		return 1;
	} else if (n < 0) {
		return 0;
	}
	if (qb[n] > 0) {
		return qb[n];
	}
	System.out.println("Hello :" + n);
	int nm1 = StairClimbDpMemo(n - 1, qb);
	int nm2 = StairClimbDpMemo(n - 2, qb);
	int nm3 = StairClimbDpMemo(n - 3, qb);
	int nm = nm1 + nm2 + nm3;
	qb[n] = nm;
	return nm;
}


/*
 * if (n == 0) { return 1; } else { <-- Wrong code return 0; }
 * 
 * 
 */

private static int StairClimbDpTab(int n) {
	int dp[] = new int[n + 1];

	dp[0] = 1;
	for (int i = 1; i <= n; i++) {
		if (i == 1) {
			dp[i] = dp[i - 1];
		} else if (i == 2) {
			dp[i] = dp[i - 1] + dp[i - 2];
		} else {
			dp[i] = dp[i - 1] + dp[i - 2] + dp[i - 3];
		}
	}
	return dp[n];
}

}

/*
 * if (n == 0) { return 1; } else { <-- Wrong code return 0; }
 * 
 * Careful for loop i=1, i<= n
 */