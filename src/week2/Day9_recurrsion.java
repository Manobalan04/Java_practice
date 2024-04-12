package week2;

public class Day9_recurrsion {

	public int factorial(int a) {
		if (a == 0) {
			return 1;
		} else {
			return a * factorial(a - 1);
		}
	}

	public static void main(String[] args) {
		System.out.println("recursion:-");
		System.out.println("");

		Day9_recurrsion rc = new Day9_recurrsion();
		System.out.println(rc.factorial(6));

	}
}