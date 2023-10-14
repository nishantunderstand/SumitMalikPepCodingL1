package a0a_CodingBasic;

public class FindSquareRootByBinarySearch {
	public static void main(String[] args) {
		int num = 36;
		int low = 1;
		int high = num;
		int mid = 0;
		int ans = 0;
		int squOfNum = 0;
		while (low <= high) {
			mid = (low + high) / 2;
			squOfNum = mid * mid;
			if (squOfNum == num) {
				ans = mid;
				break;
			} else if (squOfNum < num) {
				ans = mid;
				low = mid + 1;

			} else {
				high = mid - 1;
			}
		}
		System.out.println(num + " Square by Number " + ans);
	}
}
