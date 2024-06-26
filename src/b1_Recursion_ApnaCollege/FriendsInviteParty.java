package b1_Recursion_ApnaCollege;

import java.util.Scanner;

public class FriendsInviteParty {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Number of Friends you want to invite:");
		int n = 7;
		int ans = FriendsInviteParty(n);
		System.out.println("Ways to Invite Friends :" + ans);
		scanner.close();
	}

	private static int FriendsInviteParty(int n) {
		if (n <= 1) {
			return 1;
		}
		int single = FriendsInviteParty(n - 1);
		int pair = (n - 1) * FriendsInviteParty(n - 2);
		return (single + pair);
	}
}
