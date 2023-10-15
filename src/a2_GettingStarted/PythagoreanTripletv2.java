package a2_GettingStarted;

public class PythagoreanTripletv2 {
	public static void main(String[] args) {
		int a = 12; // First number
		int b = 13; // Second number
		int c = 5; // Third number

		// Check if the three numbers form a Pythagorean triplet
		boolean isPythagoreanTriplet = (a * a) + (b * b) == (c * c) || (a * a) + (c * c) == (b * b)
				|| (b * b) + (c * c) == (a * a);

		// Print the result
		if (isPythagoreanTriplet) {
			System.out.println("The numbers " + a + ", " + b + ", and " + c + " form a Pythagorean triplet.");
		} else {
			System.out.println("The numbers " + a + ", " + b + ", and " + c + " do not form a Pythagorean triplet.");
		}
	}
}
