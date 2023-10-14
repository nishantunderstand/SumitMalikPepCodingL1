package a0a_CodingBasic;

public class FindSquareRootByIteratingNumber {
	public static void main(String[] args) {
		int num = 29;
		int i = 1;
		while (i * i <= num) {
			i++;
		}
		System.out.println("Answer:" + (i - 1));
	}

}
