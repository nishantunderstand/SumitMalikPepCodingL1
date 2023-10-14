package a2_GettingStarted;

public class NumberRotate2 {
	public static void main(String[] args) {
		int num = 273516;
		int nod = CountOfNum(num);
		int k = 2;
		k = k % nod;
		if (k < 0) {
			k = k + nod;
		}

		int div = (int) Math.pow(10, k);
		int mult = (int) Math.pow(10, nod - k);
		int quo = num / div;
		int rem = num % div;
		int RotatedNum = rem * mult + quo;
		System.out.println(RotatedNum);
	}

	private static int CountOfNum(int num) {
		int count = 0;
		while (num > 0) {
			num = num / 10;
			count++;
		}
		return count;
	}

}
